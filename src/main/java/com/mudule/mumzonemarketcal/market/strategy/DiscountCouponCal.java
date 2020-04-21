package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketGoodsMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketMapper;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoods;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.IsTimerCardEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DZT
 * @date 2019-06-27
 */
@Slf4j
public class DiscountCouponCal implements MarketStrategy {

    private MarketTicketMapper marketTicketMapper;
    private MarketTicketGoodsMapper marketTicketGoodsMapper;
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public DiscountCouponCal(){
        this.marketTicketMapper=(MarketTicketMapper) SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETMAPPER);
        this.marketTicketGoodsMapper=(MarketTicketGoodsMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETGOODSMAPPER);
    }

    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        ResponseDiscountVo responseDiscountVo = new ResponseDiscountVo();
        //折扣券只针对于商品
        List<OrderSubVo> goods = orderVo.getGoods();
        List<OrderSubVo> resultGoods = new ArrayList<>();
        //查询折扣券信息
        TicketVo ticketVo = orderVo.getTicketVo();
        //判断是否能使用折扣劵
        if (StringUtils.isNotEmpty(ticketVo)&& TicketTypeEnum.WITH_DISCOUNT_COUPONS.getCode().equals(ticketVo.getTicketType())&&OrderConstant.GOODSORDER.equals(orderVo.getOrderType())){
            log.info("商品类执行折扣劵优惠策略----------->");
        }else {
            log.info("服务类、次卡类、未使用折扣劵不执行折扣劵优惠策略----------->");
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
        String ticketId = ticketVo.getTicketId();
        MarketTicket marketTicket = marketTicketMapper.selectById(ticketId);
        //查询优惠券可用商品
        List<MarketTicketGoods> marketTicketGoodsList = marketTicketGoodsMapper.selectByTicketId(ticketId);
        //参与优惠的商品
        List<OrderSubVo> discountGoods = new ArrayList<>();
        //统计参加优惠的金额
        BigDecimal totalAmount = BigDecimal.ZERO;
        //当前订单中商品是否有满足折扣券商品
        int totalCount = 0;
        for (int i =0;i<goods.size();i++){
            OrderSubVo orderSubVo = goods.get(i);
            for (int j = 0;j<marketTicketGoodsList.size();j++){
                MarketTicketGoods marketTicketGoods = marketTicketGoodsList.get(j);
                if (marketTicketGoods.getGoodsId().equals(orderSubVo.getGoodsSkuId())){
                    discountGoods.add(orderSubVo);
                }
            }
        }
        //判断参与的商品是否有其他优惠
        boolean flag=checkGoodsUsedDiscount(discountGoods);
        if (flag){
            responseDiscountVo.setCode(UseConstant.FAIL);
            responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
            responseDiscountVo.setMsg(ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        //统计折扣券 优惠金额
        BigDecimal coupon = marketTicket.getTicketDiscount();
        //计算该订单中总优惠金额
        BigDecimal totalDiscount = ticketVo.getTicketAmount();
        BigDecimal remainDiscount = BigDecimal.ZERO;
        if (discountGoods.size()>0){
            for (int i = 0; i<discountGoods.size();i++){
                OrderSubVo orderSubVo = discountGoods.get(i);
                List<TicketVo> ticketVoList = new ArrayList<>();
                if (orderSubVo.getTicketVoList() !=null && orderSubVo.getTicketVoList().size()>0){
                    ticketVoList = orderSubVo.getTicketVoList();
                }
                ticketVoList.add(ticketVo);
                //折扣券只有会员可以使用
                BigDecimal singlePrice = this.calSinglePrice(orderSubVo,orderVo);
                BigDecimal oldTotalDiscount = BigDecimal.ZERO;
                if (orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO) >0){
                    oldTotalDiscount = orderSubVo.getTotalDiscount();
                }
                singlePrice = singlePrice.subtract(oldTotalDiscount);
                BigDecimal newTotalDiscount = BigDecimal.ZERO;
                if (i == discountGoods.size()-1){
                    //是最后一个商品
                    //判断剩余均摊该商品能否全部均摊掉
                    //剩余未被均摊掉的钱
                    BigDecimal lastPrice = BigDecimal.ZERO;
                    lastPrice = totalDiscount.subtract(remainDiscount);
                    if (singlePrice.compareTo(lastPrice) >=0){
                        //可以被全部均摊掉
                        newTotalDiscount = oldTotalDiscount.add(lastPrice);
                        orderSubVo.setTotalDiscount(newTotalDiscount);
                    }else {
                        //先将该商品均摊最大值 剩下的循环均摊在其他商品中
                        newTotalDiscount = oldTotalDiscount.add(singlePrice);
                        orderSubVo.setTotalDiscount(newTotalDiscount);
                        remainDiscount = remainDiscount.add(singlePrice);
                        lastPrice = lastPrice.subtract(singlePrice);
                        for (int j =0 ;j<discountGoods.size();j++){
                            OrderSubVo subVo = discountGoods.get(j);
                            //计算商品价格
                            BigDecimal singlePrice1 = this.calSinglePrice(subVo,orderVo);
                            BigDecimal oldDiscount1 = subVo.getTotalDiscount();
                            singlePrice1 = singlePrice1.subtract(oldDiscount1);
                            if (singlePrice1.compareTo(lastPrice)>=0){
                                //能够被全部均摊掉
                                newTotalDiscount = BigDecimal.ZERO.add(oldTotalDiscount).add(lastPrice);
                                orderSubVo.setTotalDiscount(newTotalDiscount);
                                break;
                            }else {
                                //先将该商品均摊最大值 剩下的循环均摊在其他商品中
                                newTotalDiscount = BigDecimal.ZERO.add(oldTotalDiscount).add(singlePrice1);
                                orderSubVo.setTotalDiscount(newTotalDiscount);
                                remainDiscount = remainDiscount.add(singlePrice1);
                                lastPrice = lastPrice.subtract(singlePrice1);
                            }
                        }
                    }
                    orderSubVo.setTicketVoList(ticketVoList);
                }else{
                    //否则不是最后一个商品
                    BigDecimal singleDiscount = BigDecimal.ZERO;
                    singleDiscount = singlePrice.multiply(new BigDecimal("1").subtract(coupon.multiply(new BigDecimal("0.1")))).setScale(2,BigDecimal.ROUND_DOWN);
                    remainDiscount = remainDiscount.add(singleDiscount);
                    newTotalDiscount = oldTotalDiscount.add(singleDiscount);
                    orderSubVo.setTotalDiscount(newTotalDiscount);
                    orderSubVo.setTicketVoList(ticketVoList);
                }
            }
            for (int i =0;i<goods.size();i++){
                OrderSubVo subVo = goods.get(i);
                for (int j=0;j<discountGoods.size();j++){
                    OrderSubVo discountVo = discountGoods.get(j);
                    if (subVo.getGoodsSkuId().equals(discountVo.getGoodsSkuId())){
                        resultGoods.add(discountVo);
                        break;
                    }if (j == discountGoods.size()-1){
                        //如果是最后一个商品 则代表这个商品不是优惠商品
                        resultGoods.add(subVo);
                    }
                }
            }
        }
        orderVo.setGoods(resultGoods);
        responseDiscountVo.setOrderVo(orderVo);
        List<DiscountItem> list = new ArrayList<>();
        DiscountItem discountItem = new DiscountItem();
        discountItem.setId(ticketVo.getId());
        discountItem.setDiscount(totalDiscount);
        discountItem.setDiscountType(TicketTypeEnum.WITH_DISCOUNT_COUPONS.getCode());//买折券
        discountItem.setName(ticketVo.getTicketName());
        list.add(discountItem);
        responseDiscountVo.setDiscountItem(list);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        return responseDiscountVo;
    }

    /**
     * 计算单价
     * @param orderSubVo
     * @param orderVo
     * @return
     */
    public BigDecimal calSinglePrice(OrderSubVo orderSubVo,OrderVo orderVo){
        BigDecimal singlePrice=calOrderSubVoAmount(orderVo,orderSubVo);
        int goodsCount = orderSubVo.getGoodsCount();
        if (StringUtils.isNotEmpty(orderSubVo.getPresentNum())){
            goodsCount -= orderSubVo.getPresentNum();
        }
        singlePrice = singlePrice.multiply(new BigDecimal(goodsCount));
        return singlePrice;
    }
    /**
     * 判断商品是否使用了优惠
     * @param orderSub
     * @return
     */
    public boolean checkGoodsUsedDiscount(List<OrderSubVo> orderSub){
        if (StringUtils.isNotEmpty(orderSub)&&orderSub.size()>0){
            for (OrderSubVo orderSubVo:orderSub){
                List<TicketVo> list=orderSubVo.getTicketVoList();
                if (StringUtils.isNotEmpty(list)&&list.size()>0){
                    for (TicketVo ticketVo:list){
                        if (TicketType.ONE_ORDER_SUB.equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketType.ONE_ORDEr_DISCOUNT.equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketType.DISCOUNTCOUPONS.equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketTypeEnum.WITH_DISCOUNT_COUPONS.getCode().equals(ticketVo.getTicketType())){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * 计算商品和次卡类子订单 待支付金额
     * @param orderVo
     * @param orderSubVo
     * @return
     */
    public BigDecimal calOrderSubVoAmount(OrderVo orderVo,OrderSubVo orderSubVo){
        //商品单价
        BigDecimal price = orderSubVo.getPrice();
        //判断是否是会员  (用总单的会员来判断就可)  是则取会员价
        if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            price = orderSubVo.getMemberPrice();
        }
        if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&orderVo.getMemberDiscountType().equals(UseConstant.ZERO)){
            price=orderSubVo.getMemberPrice();
        }
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
        return  price;
    }
}
