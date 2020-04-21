package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.common.ConstantCommMethod;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.IsTimerCardEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.BigDecimalCheckAmount;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 抹零
 * @ClassName MlPrice
 * @Autor DZT
 * @Date 2019/3/13 14:52
 * @Version 1.0
 */
@Slf4j
public class MlPrice implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public MlPrice(){

    }
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->抹零优惠均摊计算");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        if (StringUtils.isNotEmpty(orderVo.getMlPrice())&&orderVo.getMlPrice().compareTo(BigDecimal.ZERO) == 1) {
            log.info("进行抹零操作--->执行抹零优惠均摊策略");
            if (OrderConstant.GOODSORDER.equals(orderVo.getOrderType())||OrderConstant.TIMESCARDORDER.equals(orderVo.getOrderType())) {
                //商品
                orderVo = this.goodsMarket(orderVo);
            } else if (OrderConstant.SERVICEORDER.equals(orderVo.getOrderType())) {
                //服务
                orderVo = this.serviceMarket(orderVo);
            }
            List<DiscountItem> list = new ArrayList<>();
            DiscountItem discountItem = new DiscountItem();
            discountItem.setDiscount(orderVo.getMlPrice());
            discountItem.setDiscountType(TicketType.MLTYPE);
            discountItem.setName(UseConstant.MLNAME);
            list.add(discountItem);
            responseDiscountVo.setDiscountItem(list);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
        }else{
            log.info("未进行抹零操作--->不执行抹零优惠均摊策略");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
        }
        return responseDiscountVo;
    }

    /**
     * 商品抹零计算均摊
     * @param orderVo
     * @return
     */
    public OrderVo goodsMarket(OrderVo orderVo){
        BigDecimal mlPrice = orderVo.getMlPrice();
        List<OrderSubVo> orderSubVoArrayList = orderVo.getGoods();
        String memberCompany = orderVo.getMemberCompanyId();
        //本单代收金额
        BigDecimal payAmount = this.calPayAmount(orderSubVoArrayList,memberCompany,orderVo);
        //计算优惠比例
        BigDecimal bilibili = mlPrice.divide(payAmount,8,RoundingMode.DOWN);
        //存已抹零金额
        BigDecimal residuePrice = BigDecimal.ZERO;
        for (int i =0; i<orderSubVoArrayList.size();i++){
            if (residuePrice.compareTo(mlPrice) ==0){
                break;
            }
            OrderSubVo orderSubVo = orderSubVoArrayList.get(i);

            BigDecimal price = this.selectPrice(orderSubVo,orderVo.getMemberCompanyId(),orderVo);
            //商品数量
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
            //计算单个商品和
            BigDecimal singlePrice = price.multiply(new BigDecimal(count));
            //优惠均摊
            BigDecimal oldDiscount = BigDecimal.ZERO;
            if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount()) && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                oldDiscount = orderSubVo.getTotalDiscount();
            }//判断商品价减去优惠均摊是否大于零
            if (oldDiscount.compareTo(BigDecimal.ZERO) == 1){
                singlePrice = singlePrice.subtract(oldDiscount);
            }
            //判断是否是最后一个商品 最后一个保持精度
            if (i == orderSubVoArrayList.size()-1){
                //剩余抹零没有均摊的金额
                BigDecimal lastPrice = mlPrice.subtract(residuePrice);
                if (singlePrice.compareTo(lastPrice) >=0){
                    //如果商品金额大于剩余均摊金额则可以均摊优惠
                    orderSubVo.setTotalDiscount(oldDiscount.add(lastPrice));
                }else {
                    //商品的价格小于均摊的优惠
                    orderSubVo.setTotalDiscount(oldDiscount.add(singlePrice));
                    //已经均摊的金额 累加
                    residuePrice = residuePrice.add(singlePrice);
                    //再次计算  将剩余金额均摊
                    orderSubVoArrayList = this.calculateMlAgain(orderSubVoArrayList,mlPrice.subtract(residuePrice),orderVo.getMemberCompanyId(),orderVo);
                }
            }else{
                //抹零均摊 TODO 抹零需进行进位
                if (singlePrice.compareTo(BigDecimal.ZERO) == 1){
                //如果大于零则继续计算抹零均摊
                    //该商品所占优惠比例
                    BigDecimal bg1=singlePrice.multiply(bilibili);
                    //极端精度值需进位
                    BigDecimal bg2=BigDecimalCheckAmount.checkExtreme(bg1);
                    BigDecimal singleBili=BigDecimal.ZERO;
                    singleBili = singleBili.add(bg2).setScale(2,RoundingMode.DOWN);
                    //避免超出优惠金额
                    if (singleBili.compareTo(mlPrice.subtract(residuePrice)) >=0){
                        if(singlePrice.compareTo(singleBili)>0){
                            orderSubVo.setTotalDiscount(oldDiscount.add(mlPrice.subtract(mlPrice.subtract(residuePrice))));
                        }else {
                            singleBili = singlePrice;
                            orderSubVo.setTotalDiscount(oldDiscount.add(singleBili));
                        }
                    }else {
                        if(singlePrice.compareTo(singleBili)>0){
                            orderSubVo.setTotalDiscount(oldDiscount.add(singleBili));
                        }else {
                            singleBili = singlePrice;
                            orderSubVo.setTotalDiscount(oldDiscount.add(singleBili));
                        }
                    }
                    residuePrice = residuePrice.add(singleBili);
                }
            }
        }
        log.info("商品抹零均摊后---[{}]",orderVo.toString());
        return orderVo;
    }

    /**
     * 服务抹零计算均摊
     * @param orderVo
     * @return
     */
    public OrderVo serviceMarket(OrderVo orderVo){
        BigDecimal mlPrice = orderVo.getMlPrice();
        List<OrderSubVo> orderSubVoArrayList = orderVo.getGoods();
        //本单代收金额
        BigDecimal payAmount = this.serviceCalculatePayAmount(orderSubVoArrayList);
        //计算优惠比例
        BigDecimal bilibili = mlPrice.divide(payAmount,8,RoundingMode.DOWN);
        //存已抹零金额
        BigDecimal residuePrice = BigDecimal.ZERO;
        for (int i =0; i<orderSubVoArrayList.size();i++){
            if (residuePrice.compareTo(mlPrice) ==0){
                break;
            }
            OrderSubVo orderSubVo = orderSubVoArrayList.get(i);
            BigDecimal price = this.selectPrice(orderSubVo,orderVo.getMemberCompanyId(),orderVo);
            //判断该服务是否使用了体验券
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                //该服务已使用次卡
                continue;
            }if (ticketVoList != null && ticketVoList.size()>0){
                boolean b = ConstantCommMethod.checkHaveTickets(ticketVoList, "0");
                if (b){
                    price = orderSubVo.getPrice();
                }
            }
            //服务数量都为1  不用再计算
            //优惠均摊
            BigDecimal oldDiscount = BigDecimal.ZERO;
            if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount())){
                oldDiscount = orderSubVo.getTotalDiscount();
            }//判断商品价减去优惠均摊是否大于零
            if (oldDiscount.compareTo(BigDecimal.ZERO) == 1){
                price = price.subtract(oldDiscount);
            }//判断是否是最后一个商品
            if (i == orderSubVoArrayList.size()-1){
                //剩余抹零没有均摊的金额
                BigDecimal lastPrice = mlPrice.subtract(residuePrice);
                if (price.compareTo(lastPrice) >=0){
                    //如果商品金额大于剩余均摊金额则可以均摊优惠
                    orderSubVo.setTotalDiscount(oldDiscount.add(lastPrice));
                }else {
                    //商品的价格小于均摊的优惠
                    orderSubVo.setTotalDiscount(oldDiscount.add(price));
                    //已经均摊的金额 累加
                    residuePrice = residuePrice.add(price);
                    //再次计算  将剩余金额均摊
                    orderSubVoArrayList = this.calculateServiceMlAgain(orderSubVoArrayList,mlPrice.subtract(residuePrice),orderVo.getMemberCompanyId(),orderVo);
                }
            }else{
                if (price.compareTo(BigDecimal.ZERO) == 1){
                    //如果大于零则继续计算抹零均摊
                    //该商品所占优惠比例
                    BigDecimal bg1=price.multiply(bilibili);
                    //极端精度需要进位
                    BigDecimal bg2=BigDecimalCheckAmount.checkExtreme(bg1);
                    BigDecimal singleBili=BigDecimal.ZERO;
                    singleBili = singleBili.add(bg2).setScale(2,RoundingMode.DOWN);
                    //避免超出优惠金额
                    if (singleBili.compareTo(mlPrice.subtract(residuePrice)) >=0){
                        if(price.compareTo(singleBili)>0){
                            orderSubVo.setTotalDiscount(oldDiscount.add(mlPrice.subtract(mlPrice.subtract(residuePrice))));
                        }else {
                            singleBili = price;
                            orderSubVo.setTotalDiscount(oldDiscount.add(singleBili));
                        }
                    }else {
                        if(price.compareTo(singleBili)>0){
                            orderSubVo.setTotalDiscount(oldDiscount.add(singleBili));
                        }else {
                            singleBili = price;
                            orderSubVo.setTotalDiscount(oldDiscount.add(singleBili));
                        }
                    }
                    residuePrice = residuePrice.add(singleBili);
                }
            }


        }

        log.info("服务抹零均摊后---[{}]",orderVo.toString());
        return orderVo;
    }

    /**
     * 获取价格
     * @param orderSubVo
     * @param memberID
     * @param orderVo
     * @return
     */
    public BigDecimal selectPrice(OrderSubVo orderSubVo,String memberID,OrderVo orderVo){
        //商品单价
        BigDecimal price = orderSubVo.getPrice();
        //判断是否是会员  (用总单的会员来判断就可)  是则取会员价
        if (StringUtils.isNotEmpty(memberID)){
            price = orderSubVo.getMemberPrice();
        }//如果有议价取议价
        if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
            if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&orderVo.getMemberDiscountType().equals(UseConstant.ZERO)){
                price=orderSubVo.getMemberPrice();
            }else {
                price=new BigDecimal(orderSubVo.getSecondPrice());
            }
        }
        if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice()) && orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
            price = orderSubVo.getBargainPrice();
        }if (StringUtils.isNotEmpty(orderSubVo.getIsTimerCard()) && IsTimerCardEnum.IS_TIME_CARD.getCode().equals(String.valueOf(orderSubVo.getIsTimerCard()))){
            if (StringUtils.isNotEmpty(orderSubVo.getPriceType())){
                if (PriceTypeEnum.MEMBER_PRICE.getCode().equals(orderSubVo.getPriceType())){
                    price=orderSubVo.getPrice();
                }else {
                    price = orderSubVo.getOriginPrice();
                }
            }
        }
        return price;
    }

    /**
     * 再次进行商品、次卡类均摊
     * @param orderSubVoArrayList
     * @param mlPrice
     * @param memberId
     * @return
     */
    public List<OrderSubVo> calculateMlAgain(List<OrderSubVo> orderSubVoArrayList,BigDecimal mlPrice,String memberId,OrderVo orderVo){
        BigDecimal residuePrice = BigDecimal.ZERO;
        for (int i =0;i<orderSubVoArrayList.size();i++){
            OrderSubVo orderSubVo = orderSubVoArrayList.get(i);
            BigDecimal price = this.selectPrice(orderSubVo,memberId,orderVo);
            //商品数量
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
            //计算单个商品和
            BigDecimal singlePrice = price.multiply(new BigDecimal(count));
            //优惠均摊
            BigDecimal oldDiscount = BigDecimal.ZERO;
            if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount())){
                oldDiscount = orderSubVo.getTotalDiscount();
            }//判断商品价减去优惠均摊是否大于零
            if (oldDiscount.compareTo(BigDecimal.ZERO) == 1){
                singlePrice = singlePrice.subtract(oldDiscount);
            }
            //singlePrice大于0 才能优惠均摊
            if (singlePrice.compareTo(BigDecimal.ZERO) == 1){
                //判断商品价格是否大于剩余优惠均摊
                if (price.compareTo(mlPrice.subtract(residuePrice)) >= 0){
                    //可以全部均摊
                    orderSubVo.setTotalDiscount(oldDiscount.add(mlPrice.subtract(residuePrice)));
                    break;
                }else{
                    //部分均摊
                    orderSubVo.setTotalDiscount(oldDiscount.add(singlePrice));
                    //累加均摊过的金额
                    residuePrice = residuePrice.add(singlePrice);
                }
            }
        }
        return orderSubVoArrayList;
    }

    public List<OrderSubVo> calculateServiceMlAgain(List<OrderSubVo> orderSubVoArrayList,BigDecimal mlPrice,String memberId,OrderVo orderVo){
        BigDecimal residuePrice = BigDecimal.ZERO;
        for (int i =0; i<orderSubVoArrayList.size();i++){
            OrderSubVo orderSubVo = orderSubVoArrayList.get(i);
            //判断该服务是否使用了体验券
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){

                //该服务已使用次卡
                continue;
            }BigDecimal price = this.selectPrice(orderSubVo,memberId,orderVo);
            if (ticketVoList != null && ticketVoList.size()>0){
                boolean b = ConstantCommMethod.checkHaveTickets(ticketVoList, "0");
                if (b){
                    price = orderSubVo.getPrice();
                }
            }
            //服务数量都为1  不用再计算
            //优惠均摊
            BigDecimal oldDiscount = BigDecimal.ZERO;
            if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount())){
                oldDiscount = orderSubVo.getTotalDiscount();
            }//判断商品价减去优惠均摊是否大于零
            if (oldDiscount.compareTo(BigDecimal.ZERO) == 1){
                price = price.subtract(oldDiscount);
            }
            //singlePrice大于0 才能优惠均摊
            if (price.compareTo(BigDecimal.ZERO) == 1){
                //判断商品价格是否大于剩余优惠均摊
                if (price.compareTo(mlPrice.subtract(residuePrice)) >= 0){
                    //可以全部均摊
                    orderSubVo.setTotalDiscount(oldDiscount.add(mlPrice.subtract(residuePrice)));
                    break;
                }else{
                    //部分均摊
                    orderSubVo.setTotalDiscount(oldDiscount.add(price));
                    //累加均摊过的金额
                    residuePrice = residuePrice.add(price);
                }
            }
        }
        return orderSubVoArrayList;
    }

    public BigDecimal calPayAmount(List<OrderSubVo> orderSubVoList,String memberCompany,OrderVo orderVo){
        BigDecimal payAmount = BigDecimal.ZERO;
        for (int i= 0; i <orderSubVoList.size() ; i++){
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            BigDecimal memberPrice = orderSubVo.getPrice();//会员价
            if (StringUtils.isNotEmpty(memberCompany)){
                if (StringUtils.isNotEmpty(orderSubVo.getMemberPrice())&& orderSubVo.getMemberPrice().compareTo(BigDecimal.ZERO)>0){
                    memberPrice = orderSubVo.getMemberPrice();
                }
            }
            if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
                if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&orderVo.getMemberDiscountType().equals(UseConstant.ZERO)){
                    memberPrice=orderSubVo.getMemberPrice();
                }else {
                    memberPrice=new BigDecimal(orderSubVo.getSecondPrice());
                }
            }
            if (orderSubVo.getBargainPrice() != null && orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
                memberPrice = orderSubVo.getBargainPrice();
            }
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();//TODO 排除赠品
            if (orderSubVo.getGoodsCount() == 0){
                count = 1;
            }
            if (count==0&&StringUtils.isNotEmpty(orderSubVo)){//TODO 校验是否全部是赠品
                count=0;
            }
            BigDecimal singlePrice = memberPrice.multiply(new BigDecimal(count));
            if (orderSubVo.getTotalDiscount() != null && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                BigDecimal totalDIscount = orderSubVo.getTotalDiscount();
                singlePrice = singlePrice.subtract(totalDIscount);
            }
            payAmount = payAmount.add(singlePrice);

        }
        return payAmount;
    }

    /**
     * 服务总价
     * @param orderSubVoList
     * @return
     */
    public BigDecimal serviceCalculatePayAmount(List<OrderSubVo> orderSubVoList){
        BigDecimal payAmount = BigDecimal.ZERO;
        for (int i= 0; i <orderSubVoList.size() ; i++){
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            //判断该服务是否已经使用了次卡
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                continue;
            }
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            BigDecimal memberPrice = orderSubVo.getPrice();//会员价
            if (StringUtils.isNotEmpty(orderSubVo.getMemberCompanyId())){
                memberPrice = orderSubVo.getMemberPrice();
            }
            if (ticketVoList!=null){
                if (ConstantCommMethod.checkHaveTickets(ticketVoList, TicketTypeEnum.EXPERIENCE_SECURITIES.getCode())){
                    memberPrice = orderSubVo.getPrice();

                }
            }
            if (orderSubVo.getBargainPrice() != null && orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
                memberPrice = orderSubVo.getBargainPrice();
            }
            if (orderSubVo.getTotalDiscount() != null && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                BigDecimal totalDIscount = orderSubVo.getTotalDiscount();
                memberPrice = memberPrice.subtract(totalDIscount);
            }
            payAmount = payAmount.add(memberPrice);

        }
        return payAmount;
    }
}
