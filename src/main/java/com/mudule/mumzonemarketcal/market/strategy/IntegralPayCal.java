package com.mudule.mumzonemarketcal.market.strategy;

import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ConstantCommMethod;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 积分抵现-->包括积分抵购商品、积分抵现金额
 * @ClassName IntegralPayCal
 * @Autor DZT
 * @Date 2019/3/13 14:55
 * @Version 1.0
 */
@Slf4j
public class IntegralPayCal implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public IntegralPayCal(){

    }

    /**
     * 积分抵现 需要计算抵现积分的金额
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->获取积分抵现计算");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        responseDiscountVo.setOrderVo(orderVo);
        //1、获取营销列表
        List<TicketVo> list=orderVo.getTicketVoList();
        boolean flag= list.stream().anyMatch(x->x.getTicketType().equals(TicketType.INTEGRAL_PAY));
        //2、判断是否使用积分抵现
        if (flag){
            log.info("使用积分进行积分抵现--->执行积分抵现策略");
            responseDiscountVo=integralPay(list,orderVo,responseDiscountVo);
            return responseDiscountVo;
        }else {
            log.info("无积分抵现--->不执行积分抵现策略");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
    }

    /**
     * 进行积分抵现
     * @param list
     * @param orderVo
     * @param responseDiscountVo
     * @return
     */
    public ResponseDiscountVo integralPay(List<TicketVo> list,OrderVo orderVo,ResponseDiscountVo responseDiscountVo){
        List<DiscountItem> discountItems = new ArrayList<>();
        for (TicketVo ticketVo:list){
            DiscountItem discountItem = new DiscountItem();
            switch (ticketVo.getTicketType()){
                case TicketType.INTEGRAL_PAY: discountItem.setName(ticketVo.getIntegral()+UseConstant.INTEGRAL_PAY_NAME);
                     //进行积分抵现均摊
                     integralDiscount(orderVo);
                     break;
                default: continue;
            }
            discountItem.setId("");
            discountItem.setDiscount(ticketVo.getTicketAmount());
            discountItem.setDiscountType(ticketVo.getTicketType());
            discountItem.setIntegral(ticketVo.getIntegral());
            discountItems.add(discountItem);
        }
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        responseDiscountVo.setDiscountItem(discountItems);
        return responseDiscountVo;
    }
    /**
     * 计算抵现积分比例
     * @param singPrice
     * @param orderVo
     * @return
     */
    public BigDecimal orderSubVoExcepleIntegral(BigDecimal singPrice, OrderVo orderVo, BigDecimal totalAmount){
        BigDecimal result=new BigDecimal(0.00);
        BigDecimal price=new BigDecimal(0.00);
        BigDecimal price1=new BigDecimal(0.00);
        BigDecimal price2=new BigDecimal(0.00);
        if (singPrice.compareTo(BigDecimal.ZERO)<=0){
            return singPrice;
        }
        price=price.add(singPrice);
        BigDecimal integralPay=orderGoodsMegreIntegral(orderVo);
        price1=price1.add(integralPay);
        price2=price2.add(totalAmount);
        price1=price1.multiply(price).divide(price2,2,BigDecimal.ROUND_DOWN);
        result=result.add(price1);
        return result;
    }

    /**
     * 获取合并积分抵现 金额
     * @param orderVo
     * @return
     */
    public  BigDecimal orderGoodsMegreIntegral(OrderVo orderVo){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        //判断是否有积分抵现
        if (StringUtils.isNotEmpty(orderVo.getTicketVoList())){
            for (TicketVo ticketVo:orderVo.getTicketVoList()){
                if (ticketVo.getTicketType().equals(UseConstant.TEN)){
                    toPayAmount=toPayAmount.add(ticketVo.getTicketAmount());
                }
            }
        }
        if (StringUtils.isNotEmpty(orderVo.getPayType())){
            JSONObject payTypeJson=JSONObject.parseObject(orderVo.getPayType());
            if (StringUtils.isNotEmpty(payTypeJson.getString(UseConstant.SEVEN))){//积分抵现
                toPayAmount=toPayAmount.add(payTypeJson.getBigDecimal(UseConstant.SEVEN));
            }
        }
        return toPayAmount;
    }

    /**
     * 根据实付金额计算积分抵现均摊
     * @param orderVo
     * @return
     */
    public void integralDiscount(OrderVo orderVo){
        List<OrderSubVo> orderSubVoList=orderVo.getGoods();
        BigDecimal totalAmount=new BigDecimal(0.00);
        BigDecimal integralPayAmount=new BigDecimal(0.00);
        BigDecimal dem=orderGoodsMegreIntegral(orderVo);
        BigDecimal subIntegralPayAmount=new BigDecimal(0.00);//精度
        /**
         * 普通商品类和计次卡类和服务类
         */
        if (orderVo.getOrderType().equals(OrderConstant.GOODSORDER)||orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)||orderVo.getOrderType().equals(OrderConstant.SERVICEORDER)){
            //计算积分抵现比例
            if (orderVo.getOrderType().equals(OrderConstant.GOODSORDER)){
                for (OrderSubVo orderSubVo:orderSubVoList){
                    BigDecimal goodsAmount=getGoodsOrderGoodsAmount(orderSubVo,orderVo);
                    totalAmount=totalAmount.add(goodsAmount);
                }
                for (OrderSubVo orderSubVo:orderSubVoList){
                    BigDecimal goodsAmount=getGoodsOrderGoodsAmount(orderSubVo,orderVo);
                    BigDecimal goodsAmountSubtractIntegralPay=orderSubVoExcepleIntegral(goodsAmount,orderVo,totalAmount);
                    BigDecimal integralDisocunt=new BigDecimal(0.00);
                    integralDisocunt=integralDisocunt.add(orderSubVo.getIntegralDiscount()).add(goodsAmountSubtractIntegralPay);
                    orderSubVo.setIntegralDiscount(integralDisocunt);
                    integralPayAmount.add(goodsAmountSubtractIntegralPay);
                }
            }else if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)){
                for (OrderSubVo orderSubVo:orderSubVoList){
                    BigDecimal timeCardPayAmount=getTimeCardOrderGoodsAmount(orderSubVo,orderVo);
                    totalAmount=totalAmount.add(timeCardPayAmount);
                }
                for (OrderSubVo orderSubVo:orderSubVoList){
                    BigDecimal goodsAmount=getTimeCardOrderGoodsAmount(orderSubVo,orderVo);
                    BigDecimal goodsAmountSubtractIntegralPay=orderSubVoExcepleIntegral(goodsAmount,orderVo,totalAmount);
                    BigDecimal integralDisocunt=new BigDecimal(0.00);
                    integralDisocunt=integralDisocunt.add(orderSubVo.getIntegralDiscount()).add(goodsAmountSubtractIntegralPay);
                    orderSubVo.setIntegralDiscount(integralDisocunt);
                    integralPayAmount=integralPayAmount.add(goodsAmountSubtractIntegralPay);
                }
            }else {
                for (OrderSubVo orderSubVo:orderSubVoList){
                    BigDecimal memberPrice =selectPriceService(orderVo,orderSubVo);
                    totalAmount=totalAmount.add(memberPrice);
                }
                for (OrderSubVo orderSubVo:orderSubVoList){
                    BigDecimal memberPrice=selectPriceService(orderVo,orderSubVo);
                    BigDecimal goodsAmountSubtractIntegralPay=orderSubVoExcepleIntegral(memberPrice,orderVo,totalAmount);
                    BigDecimal integralDisocunt=new BigDecimal(0.00);
                    integralDisocunt=integralDisocunt.add(orderSubVo.getIntegralDiscount()).add(goodsAmountSubtractIntegralPay);
                    orderSubVo.setIntegralDiscount(integralDisocunt);
                    integralPayAmount=integralPayAmount.add(goodsAmountSubtractIntegralPay);
                }
            }
            subIntegralPayAmount=subIntegralPayAmount.add(dem).subtract(integralPayAmount);
            if (subIntegralPayAmount.compareTo(BigDecimal.ZERO)>1){//有精度问题
                for (int i=orderSubVoList.size()-1;i>=0;i--){
                    OrderSubVo orderSubVo=orderSubVoList.get(i);
                    BigDecimal goodsAmount=getGoodsOrderGoodsAmount(orderSubVo,orderVo);
                    if (i==orderSubVoList.size()-1){
                        if (goodsAmount.compareTo(subIntegralPayAmount)>1){
                            BigDecimal integralDisocunt=new BigDecimal(0.00);
                            integralDisocunt=integralDisocunt.add(orderSubVo.getIntegralDiscount()).add(subIntegralPayAmount);
                            orderSubVo.setIntegralDiscount(integralDisocunt);
                        }else {
                            for (int j=orderSubVoList.size()-1;j>=0;j--){
                                OrderSubVo orderSubVo1=orderSubVoList.get(j);
                                if (j!=orderSubVoList.size()-1){
                                    if (goodsAmount.compareTo(subIntegralPayAmount)>1){
                                        BigDecimal integralDisocunt=new BigDecimal(0.00);
                                        integralDisocunt=integralDisocunt.add(orderSubVo1.getIntegralDiscount()).add(subIntegralPayAmount);
                                        orderSubVo1.setIntegralDiscount(integralDisocunt);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        orderVo.setGoods(orderSubVoList);
    }

    /**
     * 获取商品类子订单实付金额
     * @param orderSubVo
     * @param orderVo
     * @return
     */
    public BigDecimal getGoodsOrderGoodsAmount(OrderSubVo orderSubVo,OrderVo orderVo){
        BigDecimal price = orderSubVo.getPrice();
        if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            price = orderSubVo.getMemberPrice();
        }
        if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
            if (UseConstant.ZERO.equals(orderVo.getMemberDiscountType())){
                price=orderSubVo.getMemberPrice();
            }
            if (StringUtils.isEmpty(orderVo.getMemberDiscountType())||UseConstant.TWO.equals(orderVo.getMemberDiscountType())||UseConstant.ONE.equals(orderVo.getMemberDiscountType())){
                price=new BigDecimal(orderSubVo.getSecondPrice());
            }
        }
        if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice()) && orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO) >0){
            price = orderSubVo.getBargainPrice();
        }
        int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
        BigDecimal goodsAmount = price.multiply(new BigDecimal(count));
        BigDecimal totalDiscount = new BigDecimal(0.00);
        if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount()) && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO) >0){
            totalDiscount = orderSubVo.getTotalDiscount();
        }
        goodsAmount = goodsAmount.subtract(totalDiscount);
        return goodsAmount;
    }

    /**
     * 计算次卡类子订单实付金额
     * @param orderSubVo
     * @param orderVo
     * @return
     */
    public BigDecimal getTimeCardOrderGoodsAmount(OrderSubVo orderSubVo,OrderVo orderVo){
        BigDecimal price = orderSubVo.getPrice();
        int count = orderSubVo.getGoodsCount();
        BigDecimal goodsAmount = price.multiply(new BigDecimal(count));
        BigDecimal totalDiscount = new BigDecimal(0.00);
        if (StringUtils.isNotEmpty(orderSubVo.getTotalDiscount()) && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO) >0){
            totalDiscount = orderSubVo.getTotalDiscount();
        }
        goodsAmount = goodsAmount.subtract(totalDiscount);
        return goodsAmount;
    }

    /**
     * 计算服务类支付订单总金额
     * @param orderVo
     * @return
     */
    public BigDecimal selectPriceService(OrderVo orderVo,OrderSubVo x){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        //计算金额
        BigDecimal price=new BigDecimal(0.00);
        boolean flag= ConstantCommMethod.checkHaveTickets(x.getTicketVoList(),TicketType.EXPERIENCETICKET_TYPE);
        if (flag){
            //使用体验劵
            return toPayAmount;
        }
        if (StringUtils.isNotEmpty(x.getGoodsId())){
            return toPayAmount;
        }
        if (StringUtils.isNotEmpty(orderVo.getBillingUser())||StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            if (StringUtils.isNotEmpty(x.getGoodsId())){
                price=price.add(x.getOriginPrice());
            }else {
                price=price.add(x.getMemberPrice());
            }
        }else {
            price=price.add(x.getOriginPrice());
        }
        BigDecimal singPrice = BigDecimal.ZERO;
        singPrice = singPrice.add(price).subtract(x.getTotalDiscount());
        toPayAmount =toPayAmount.add(singPrice);
        return toPayAmount;
    }
}
