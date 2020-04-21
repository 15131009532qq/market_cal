package com.mudule.mumzonemarketcal.service.impl;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.base.BaseShopMapper;
import com.mudule.mumzonemarketcal.component.po.base.BaseShop;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.MarketStrategyCodeEnum;
import com.mudule.mumzonemarketcal.enums.MarketStrategyEnum;
import com.mudule.mumzonemarketcal.enums.PayCnlEnum;
import com.mudule.mumzonemarketcal.market.factory.MarketStrategyFactory;
import com.mudule.mumzonemarketcal.market.factory.MarketStrategyFactoryImpl;
import com.mudule.mumzonemarketcal.service.MarketService;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @Description 营销数据服务层实现类
 * @ClassName MarketServiceImpl
 * @Autor DZT
 * @Date 2019/3/13 17:04
 * @Version 1.0
 */
@Slf4j
@Service
public class MarketServiceImpl implements MarketService {

//    /**
//     * 加载配置类
//     */
//    private final  MarketStrategyFactory marketStrategyFactory = new MarketStrategyFactoryImpl();

    @Override
    public ResponseDiscountVo marketCal(OrderVo orderVo) {
//        /**
//         * 总流程:
//         *       DO
//         *       -->满减劵
//         *       -->体验劵
//         *       -->折扣劵
//         *       -->计次卡
//         *       -->营销活动
//         *       WHILE
//         *       -->抹零
//         *       -->会员折扣
//         *       -->商品折扣
//         *       -->议价折扣
//         *       -->组合支付【各种支付方式:现金、余额、积分抵现等】
//         *       -->积分抵现金额均摊
//         *       -->获取积分
//         *       目前是根据流程【用户选择的顺序作为优先级】计算营销信息
//         *       改版之后使用Drools-->添加对应的规则信息则需要根据drl设置的规则信息,
//         *       进行营销流程的控制
//         *       根据优惠券列表的传递顺序进行优惠券营销计算
//         *       根据list<TicketVo>的优惠列表消费顺序进行消费
//         */
//        ResponseDiscountVo responseDiscount=new ResponseDiscountVo();
//        List<TicketVo>  ticketVoList=orderVo.getTicketVoList();
//        if (StringUtils.isNotEmpty(ticketVoList)){
//            /**
//             * 根据优惠券链表
//             *     1、根据列表顺序进行优惠
//             */
//            List<DiscountItem> discountItemList=new ArrayList<>();
//            for (TicketVo ticketVo:ticketVoList){
//                orderVo.setTicketVo(ticketVo);
//                ResponseDiscountVo responseDiscountVo7=marketStrategyFactory
//                        .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.SEVEN.getCode()))
//                        .calMarketContext(orderVo);
//                if (!strategyActResult(responseDiscountVo7)){
//                    return responseDiscountVo7;}
//                if (StringUtils.isNotEmpty(responseDiscountVo7.getDiscountItem())){
//                    discountItemList.addAll(responseDiscountVo7.getDiscountItem());}
//                orderVo=responseDiscountVo7.getOrderVo();
//                orderVo.setTicketVo(ticketVo);
//                ResponseDiscountVo responseDiscountVo1=marketStrategyFactory
//                        .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.ONE.getCode()))
//                        .calMarketContext(orderVo);
//                if (!strategyActResult(responseDiscountVo1)){
//                    return responseDiscountVo1;}
//                if (StringUtils.isNotEmpty(responseDiscountVo1.getDiscountItem())){
//                    discountItemList.addAll(responseDiscountVo1.getDiscountItem());}
//                orderVo=responseDiscountVo1.getOrderVo();
//                orderVo.setTicketVo(ticketVo);
//                ResponseDiscountVo responseDiscountVo10=marketStrategyFactory
//                        .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.TEN.getCode()))
//                        .calMarketContext(orderVo);
//                if (!strategyActResult(responseDiscountVo10)){
//                    return responseDiscountVo10;}
//                if (StringUtils.isNotEmpty(responseDiscountVo10.getDiscountItem())){
//                    discountItemList.addAll(responseDiscountVo10.getDiscountItem());}
//                orderVo=responseDiscountVo10.getOrderVo();
//                orderVo.setTicketVo(ticketVo);
//                ResponseDiscountVo responseDiscountVo6=marketStrategyFactory
//                        .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.SIX.getCode()))
//                        .calMarketContext(orderVo);
//                if (!strategyActResult(responseDiscountVo6)){
//                    return responseDiscountVo6;}
//                if (StringUtils.isNotEmpty(responseDiscountVo6.getDiscountItem())){
//                    discountItemList.addAll(responseDiscountVo6.getDiscountItem());}
//                ResponseDiscountVo responseDiscountVo4=marketStrategyFactory
//                        .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.FOUR.getCode()))
//                        .calMarketContext(orderVo);
//                if (!strategyActResult(responseDiscountVo4)){
//                    return responseDiscountVo4;}
//                if (StringUtils.isNotEmpty(responseDiscountVo4.getDiscountItem())){
//                    discountItemList.addAll(responseDiscountVo4.getDiscountItem());}
//                orderVo=responseDiscountVo4.getOrderVo();
//            }
//            //设置参数结果集
//            responseDiscount.setCode(UseConstant.SUCCESS);
//            responseDiscount.setOrderVo(orderVo);
//            responseDiscount.setDiscountItem(discountItemList);
//        }
//        //进行其他优惠策略折扣执行
//        ResponseDiscountVo responseDiscountVo5=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.FIVE.getCode()))
//                .calMarketContext(orderVo);
//        if (!strategyActResult(responseDiscountVo5)){
//            return responseDiscountVo5;}
//        ResponseDiscountVo responseDiscountVo8=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.EIGHT.getCode()))
//                .calMarketContext(responseDiscountVo5.getOrderVo());
//        if (!strategyActResult(responseDiscountVo8)){
//            return responseDiscountVo8;}
//        ResponseDiscountVo responseDiscountVo12=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.TWELVE.getCode()))
//                .calMarketContext(responseDiscountVo5.getOrderVo());
//        if (!strategyActResult(responseDiscountVo12)){
//            return responseDiscountVo12;}
//        ResponseDiscountVo responseDiscountVo9=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.NINE.getCode()))
//                .calMarketContext(responseDiscountVo12.getOrderVo());
//        if (!strategyActResult(responseDiscountVo9)){
//            return responseDiscountVo9;}
//        ResponseDiscountVo responseDiscountVo11=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.ELEVEN.getCode()))
//                .calMarketContext(responseDiscountVo9.getOrderVo());
//        if (!strategyActResult(responseDiscountVo11))
//            return responseDiscountVo11;
//        ResponseDiscountVo responseDiscountVo3=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.THREE.getCode()))
//                .calMarketContext(responseDiscountVo11.getOrderVo());
//        if (!strategyActResult(responseDiscountVo3)){
//            return responseDiscountVo3;}
//        ResponseDiscountVo responseDiscountVo2=marketStrategyFactory
//                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(MarketStrategyCodeEnum.TWO.getCode()))
//                .calMarketContext(responseDiscountVo3.getOrderVo());
//        if (!strategyActResult(responseDiscountVo2))
//            return responseDiscountVo2;
//        //处理结果信息
//        return toPayMonyCal(getLastResponseDiscountVo(responseDiscountVo2.getCode(),
//                                                        responseDiscountVo2.getMsg(),
//                                                        responseDiscountVo2.getOrderVo(),
//                                                        responseDiscount,
//                                                        responseDiscountVo3,
//                                                        responseDiscountVo5,
//                                                        responseDiscountVo8,
//                                                        responseDiscountVo12,
//                                                        responseDiscountVo9,
//                                                        responseDiscountVo11,
//                                                        responseDiscountVo2));
        return null;
    }

    /**
     * 计算实际支付的金额
     * @param responseDiscountVo
     * @return
     */
//    @Override
    public ResponseDiscountVo toPayMonyCal(ResponseDiscountVo responseDiscountVo) {
        BigDecimal totalAmount=new BigDecimal(0.00);//商品合计金额
        BigDecimal toPayAmount=new BigDecimal(0.00);//待支付金额
        BigDecimal bargainAmount = new BigDecimal(0.00);
        BigDecimal presentDiscount = BigDecimal.ZERO;
        //1、计算商品合计金额
        OrderVo orderVo0=responseDiscountVo.getOrderVo();
        List<OrderSubVo> orderSubVoList=responseDiscountVo.getOrderVo().getGoods();
        if (StringUtils.isNotEmpty(orderSubVoList)){
            for (Iterator<OrderSubVo> iterator=orderSubVoList.iterator();iterator.hasNext();){
                OrderSubVo orderSubVo=iterator.next();
                if (OrderConstant.TIMESCARDORDER.equals(orderVo0.getOrderType())){
                    totalAmount=totalAmount.add(orderSubVo.getOriginPrice().multiply(new BigDecimal(orderSubVo.getGoodsCount()==0?1:orderSubVo.getGoodsCount())));
                }else {
                    totalAmount=totalAmount.add(orderSubVo.getPrice().multiply(new BigDecimal(orderSubVo.getGoodsCount()==0?1:orderSubVo.getGoodsCount())));
                }
            }
            //计算赠品价格
            for (Iterator<OrderSubVo> iterator=orderSubVoList.iterator();iterator.hasNext();){
                OrderSubVo orderSubVo=iterator.next();
                if (orderSubVo.getPresentNum() !=null && orderSubVo.getPresentNum()>0){
                    presentDiscount=presentDiscount.add(orderSubVo.getPrice().multiply(new BigDecimal(orderSubVo.getPresentNum())));
                }
                responseDiscountVo.setPresentDiscount(presentDiscount);
            }
            //2、计算商品待支付金额
            toPayAmount=toPayAmount.add(totalAmount.subtract(responseDiscountVo.getBargainDiscount())
                        .subtract(responseDiscountVo.getGoodsDiscount())
                        .subtract(responseDiscountVo.getMemberDiscount()))
                        .subtract(responseDiscountVo.getPresentDiscount());
            List<DiscountItem> discountItemList=responseDiscountVo.getDiscountItem();
            if (StringUtils.isNotEmpty(discountItemList)){
                for (Iterator<DiscountItem> iterator=discountItemList.iterator();iterator.hasNext();){
                    DiscountItem discountItem=iterator.next();
                    toPayAmount=toPayAmount.subtract(discountItem.getDiscount());
                }
            }
            //判断支付金额 是否小于0
            if (toPayAmount.compareTo(BigDecimal.ZERO)==-1){
                responseDiscountVo.setCode(UseConstant.FAIL);
                responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                responseDiscountVo.setMsg(ErrMsgConstant.TO_PAY_LESS_DISCOUNT_AMOUNT);
                return responseDiscountVo;
            }
            if (responseDiscountVo.getOrderVo().getOrderType().equals(OrderConstant.GOODSORDER) ){
                //如果是商品  计算单个商品总金额-优惠均摊
                for (int i = 0 ; i< orderSubVoList.size();i++){
                    OrderSubVo orderSubVo = orderSubVoList.get(i);
                    BigDecimal price = orderSubVo.getPrice();
                    if (StringUtils.isNotEmpty(responseDiscountVo.getOrderVo().getMemberCompanyId())){
                        price = orderSubVo.getMemberPrice();
                    }
                    if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
                        if (UseConstant.ZERO.equals(orderVo0.getMemberDiscountType())){
                            price=orderSubVo.getMemberPrice();
                        }
                        if (StringUtils.isEmpty(orderVo0.getMemberDiscountType())||UseConstant.TWO.equals(orderVo0.getMemberDiscountType())||UseConstant.ONE.equals(orderVo0.getMemberDiscountType())){
                            price=new BigDecimal(orderSubVo.getSecondPrice());
                        }
                    }
                    if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice()) && orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO) >0){
                        price = orderSubVo.getBargainPrice();
                    }int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
                    BigDecimal goodsAmount = price.multiply(new BigDecimal(count));
                    BigDecimal totalDiscount = new BigDecimal(0.00);
                    if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount()) && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO) >0){
                        totalDiscount = orderSubVo.getTotalDiscount();
                    }
                    goodsAmount = goodsAmount.subtract(totalDiscount);
                    orderSubVo.setGoodsAmount(goodsAmount);
                }
            }
            if (responseDiscountVo.getOrderVo().getOrderType().equals(OrderConstant.TIMESCARDORDER) ){
                //如果是商品  计算单个商品总金额-优惠均摊
                for (int i = 0 ; i< orderSubVoList.size();i++){
                    OrderSubVo orderSubVo = orderSubVoList.get(i);
                    BigDecimal price = orderSubVo.getPrice();
                    int count = orderSubVo.getGoodsCount();
                    BigDecimal goodsAmount = price.multiply(new BigDecimal(count));
                    BigDecimal totalDiscount = new BigDecimal(0.00);
                    if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount()) && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO) >0){
                        totalDiscount = orderSubVo.getTotalDiscount();
                    }
                    goodsAmount = goodsAmount.subtract(totalDiscount);
                    orderSubVo.setGoodsAmount(goodsAmount);
                }
            }
            //计算议价总合
            if (StringUtils.isNotEmpty(orderSubVoList)){
                for (int i = 0; i<orderSubVoList.size() ; i++){
                    OrderSubVo orderSubVo = orderSubVoList.get(i);
                    if (orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO) >0){
                        if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice())&&orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)==1){
                            bargainAmount=bargainAmount.add(orderSubVo.getBargainPrice().multiply(new BigDecimal(orderSubVo.getGoodsCount())));
                        }
                    }
                }
            }
            OrderVo orderVo = responseDiscountVo.getOrderVo();
            String payCanl=getPayCal(orderVo.getShopId());
            if (log.isInfoEnabled()){
                log.info("查询门店支付渠道信息:"+payCanl);
            }

            orderVo.setPayCnl(payCanl);
            orderVo.setBargainingAmount(bargainAmount);
            if (OrderConstant.TIMESCARDORDER.equals(orderVo.getOrderType())){
                orderVo.setTotalAmount(totalAmount);
            }
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setTotalAmount(totalAmount);
            responseDiscountVo.setToPayAmount(toPayAmount);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
        }
        return responseDiscountVo;
    }

    /**
     * 校验执行策略是否成功
     * @param responseDiscountVo
     * @return
     */
    public boolean strategyActResult(ResponseDiscountVo responseDiscountVo){
        if (responseDiscountVo.getCode().equals(UseConstant.SUCCESS)){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 计算最终的折扣信息
     * @param orderVo
     * @param responseDiscountVo
     * @return
     */
    public ResponseDiscountVo getLastResponseDiscountVo(String code,String msg,OrderVo orderVo,ResponseDiscountVo... responseDiscountVo){
        ResponseDiscountVo result=new ResponseDiscountVo();
        List<DiscountItem> discountItemList=new ArrayList<>();
        BigDecimal memberDiscount=new BigDecimal(0.00);
        BigDecimal totalAmount=new BigDecimal(0.00);
        BigDecimal bargainDiscount=new BigDecimal(0.00);
        BigDecimal goodsDiscount=new BigDecimal(0.00);
        BigDecimal toPayAmount=new BigDecimal(0.00);
        for (ResponseDiscountVo responseDiscountVo1:responseDiscountVo){
            memberDiscount=memberDiscount.add(responseDiscountVo1.getMemberDiscount());
            totalAmount=totalAmount.add(responseDiscountVo1.getTotalAmount());
            bargainDiscount=bargainDiscount.add(responseDiscountVo1.getBargainDiscount());
            goodsDiscount=goodsDiscount.add(responseDiscountVo1.getGoodsDiscount());
            toPayAmount=toPayAmount.add(responseDiscountVo1.getToPayAmount());
            if (StringUtils.isNotEmpty(responseDiscountVo1.getDiscountItem())){
                discountItemList.addAll(responseDiscountVo1.getDiscountItem());
            }
        }
        result.setMemberDiscount(memberDiscount);
        result.setTotalAmount(totalAmount);
        result.setBargainDiscount(bargainDiscount);
        result.setGoodsDiscount(goodsDiscount);
        result.setToPayAmount(toPayAmount);
        //时间复杂度太高-->相当对对象属性遍历5遍
//        result.setMemberDiscount(
//                Arrays.stream(responseDiscountVo).map(ResponseDiscountVo::getMemberDiscount).reduce(BigDecimal::add).get()
//        );
//        result.setTotalAmount(
//                Arrays.stream(responseDiscountVo).map(ResponseDiscountVo::getTotalAmount).reduce(BigDecimal::add).get()
//        );
//        result.setGoodsDiscount(
//                Arrays.stream(responseDiscountVo).map(ResponseDiscountVo::getGoodsDiscount).reduce(BigDecimal::add).get()
//        );
//        result.setBargainDiscount(
//                Arrays.stream(responseDiscountVo).map(ResponseDiscountVo::getBargainDiscount).reduce(BigDecimal::add).get()
//        );
//        result.setToPayAmount(
//                Arrays.stream(responseDiscountVo).map(ResponseDiscountVo::getToPayAmount).reduce(BigDecimal::add).get()
//        );
        result.setOrderVo(orderVo);
        result.setDiscountItem(discountItemList);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 查询门店支付渠道
     * @param stopId
     * @return
     */
    public String getPayCal(String stopId){
       BaseShopMapper baseShopMapper=(BaseShopMapper) SpringContext.getContext().getBean(BeanNameConstant.BASESHOPMAPPER);
       if (StringUtils.isNotEmpty(stopId)){
           BaseShop baseShop= baseShopMapper.selectByPrimaryKey(stopId);
           return  String.valueOf(baseShop.getPayChannel());
       }else {
           return PayCnlEnum.ORIGIN_PAY_CNL.getCode();
       }
    }
}
