package com.mudule.mumzonemarketcal.market.rules;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.base.BaseShopMapper;
import com.mudule.mumzonemarketcal.component.po.base.BaseShop;
import com.mudule.mumzonemarketcal.component.vo.DiscountItem;
import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.PayCnlEnum;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 规则执行静态方法
 * @ClassName RuleExecuteContant
 * @Autor DZT
 * @Date 2019/6/28 17:03
 * @Version 1.0
 */
@Slf4j
public class RuleExecuteContant {

    /**
     * 计算实际支付的金额
     * @param responseDiscountVo
     * @return
     */
    public static ResponseDiscountVo toPayMonyCal(ResponseDiscountVo responseDiscountVo) {
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
     * 计算最终的折扣信息
     * @param code
     * @param msg
     * @param responseDiscountVo
     * @return
     */
    public static ResponseDiscountVo getLastResponseDiscountVo(String code,String msg,List<ResponseDiscountVo> responseDiscountVo){
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
        result.setDiscountItem(discountItemList);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    /**
     * 校验执行策略是否成功
     * @param responseDiscountVo
     * @return
     */
    public static boolean strategyActResult(ResponseDiscountVo responseDiscountVo){
        if (responseDiscountVo.getCode().equals(UseConstant.SUCCESS)){
            return true;
        }else {
            return false;
        }
    }


    /**
     * 查询门店支付渠道
     * @param stopId
     * @return
     */
    public static String getPayCal(String stopId){
        BaseShopMapper baseShopMapper=(BaseShopMapper) SpringContext.getContext().getBean(BeanNameConstant.BASESHOPMAPPER);
        if (StringUtils.isNotEmpty(stopId)){
            BaseShop baseShop= baseShopMapper.selectByPrimaryKey(stopId);
            return  String.valueOf(baseShop.getPayChannel());
        }else {
            return PayCnlEnum.ORIGIN_PAY_CNL.getCode();
        }
    }
}
