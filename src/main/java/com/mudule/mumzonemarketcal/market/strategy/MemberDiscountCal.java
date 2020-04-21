package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.component.vo.TicketVo;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description 会员优惠策略
 * @ClassName MemberDiscountCal
 * @Autor DZT
 * @Date 2019/3/18 17:21
 * @Version 1.0
 */
@Slf4j
public class MemberDiscountCal  implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public MemberDiscountCal(){

    }
    /**
     * 会员优惠策略
     *      会员优惠策略规则:
     *              1、计次卡、体验劵、赠品的不参与会员折扣
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->会员优惠计算");
        ResponseDiscountVo responseDiscountVo = new ResponseDiscountVo();
        //1、如果是会员则计算会员价  否则直接返回
        if(StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            log.info("是会员--->执行会员优惠策略");
                //1.1商品--->普通商品存在会员价格
            if (orderVo.getOrderType().equals(OrderConstant.GOODSORDER)){
                responseDiscountVo = this.goodsCalMarket(orderVo);
            }else if (orderVo.getOrderType().equals(OrderConstant.SERVICEORDER)){
                //1.2服务--->服务存在会员价格
                responseDiscountVo = this.serviceCalMarket(orderVo);
            }else if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)){
                //1.3计次卡--->计次卡存在会员价和原价
                responseDiscountVo = this.goodsCalMarket(orderVo);
            }else{
                responseDiscountVo.setOrderVo(orderVo);
                responseDiscountVo.setCode(UseConstant.FAIL);
                responseDiscountVo.setErrCode(ErrCodeConstant.SERVICE_RUN_ERR);
                responseDiscountVo.setMsg(ErrMsgConstant.NO_ORDER_TYPE);
            }
        }else {
            log.info("不是会员--->不执行会员优惠策略");
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
        }
        return responseDiscountVo;
    }

    /**
     * 计算会员折扣  商品和计次卡
     * @param orderVo
     * @return
     */
    public ResponseDiscountVo goodsCalMarket(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo = new ResponseDiscountVo();
        List<OrderSubVo> orderVoGoods = orderVo.getGoods();
        BigDecimal memberDiscount = new BigDecimal(0.00);//会员折扣变量基准
        for (int i = 0; i<orderVoGoods.size(); i++){
            OrderSubVo orderSubVo = orderVoGoods.get(i);
            //判断是否使用了议价 议价不为null且议价金额不为0
            if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice())&&orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)==1){
                continue;
            }
            if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)==1){
                if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())){
                    if (UseConstant.ZERO.equals(orderVo.getMemberDiscountType())){
                        BigDecimal subPrice=new BigDecimal(0.00);
                        subPrice=subPrice.add(new BigDecimal(orderSubVo.getSecondPrice())).subtract(orderSubVo.getMemberPrice());
                        memberDiscount=memberDiscount.add(subPrice.multiply(new BigDecimal(orderSubVo.getGoodsCount()-orderSubVo.getPresentNum())));
                    }
                }
                continue;
            }else {
                if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())){
                    //计次卡
                    if (OrderConstant.TIMESCARDORDER.equals(orderVo.getOrderType())){
                        if (UseConstant.ONE.equals(orderVo.getMemberDiscountType())){
                            BigDecimal subPrice=new BigDecimal(0.00);
                            subPrice=subPrice.add(orderSubVo.getOriginPrice()).subtract(orderSubVo.getPrice());
                            memberDiscount=memberDiscount.add(subPrice.multiply(new BigDecimal(orderSubVo.getGoodsCount()-orderSubVo.getPresentNum())));
                            continue;
                        }else {
                            continue;
                        }
                    }
                    if (UseConstant.ZERO.equals(orderVo.getMemberDiscountType())){
                        BigDecimal subPrice=new BigDecimal(0.00);
                        subPrice=subPrice.add(orderSubVo.getPrice()).subtract(orderSubVo.getMemberPrice());
                        memberDiscount=memberDiscount.add(subPrice.multiply(new BigDecimal(orderSubVo.getGoodsCount()-orderSubVo.getPresentNum())));
                        continue;
                    }
                }
            }
            //（商品原价-商品单个会员价）*数量
            BigDecimal price = orderSubVo.getPrice();
            BigDecimal memberPrice = orderSubVo.getMemberPrice();
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();//TODO 排除赠品的数量
            memberDiscount = memberDiscount.add((price.subtract(memberPrice)).multiply(new BigDecimal(count)));
        }
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setMemberDiscount(memberDiscount);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        return responseDiscountVo;
    }

    /**
     * 计算会员折扣  服务
     * @param orderVo
     * @return
     */
    public ResponseDiscountVo serviceCalMarket(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo = new ResponseDiscountVo();
        BigDecimal memberDiscount = new BigDecimal(0.00);
        List<OrderSubVo> orderVoGoods = orderVo.getGoods();
        for (int i = 0; i<orderVoGoods.size(); i++){
            OrderSubVo orderSubVo = orderVoGoods.get(i);
            //1、判断服务是否使用计次卡支付
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                continue;
            }
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            //2、判断是否使用体验劵--->体验劵不用计算会员折扣优惠券均摊，优惠券需要计算优惠均摊
            if (StringUtils.isNotEmpty(ticketVoList)&&ticketVoList.size()>0){
                //3、遍历子订单优惠列表是否使用了优惠
                Boolean flag = false;
                for (int j = 0 ;j <ticketVoList.size(); j ++){
                    TicketVo ticketVo = ticketVoList.get(j);
                    if (ticketVo.getTicketType().equals(TicketTypeEnum.EXPERIENCE_SECURITIES.getCode())){
                        flag = true;
                        break;
                    }
                }if (flag){
                    continue;
                }
            }
            BigDecimal memberPrice = orderSubVo.getMemberPrice();
            BigDecimal price = orderSubVo.getPrice();
            memberDiscount = memberDiscount.add(price.subtract(memberPrice));
        }
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setMemberDiscount(memberDiscount);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        return responseDiscountVo;
    }
}
