package com.mudule.mumzonemarketcal.common;

import com.mudule.mumzonemarketcal.component.po.market.MarketTicket;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.IsTimerCardEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.utils.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 提供一些营销通用的公共方法
 * @ClassName ConstantCommMethod
 * @Autor DZT
 * @Date 2019/3/20 13:30
 * @Version 1.0
 */
public class ConstantCommMethod {
    /**
     * 判断集合是否对应的优惠券类型
     * @param code
     * @return
     */
    public static boolean checkHaveTickets(List<TicketVo> list, String... code){
        /**
         * 时间复杂度O(n)
         */
//        list.stream().anyMatch(t->t.getTicketType().equals(code));
        /**
         * 时间复杂度O(2n)~O(n)
         */
//        list.stream().map(TicketVo::getTicketType).anyMatch(code::equals);
        if (StringUtils.isEmpty(list)){
            return false;
        }else{
            for (String ticketType:code){
                boolean flag=list.stream().anyMatch(t->t.getTicketType().equals(ticketType));
                if (flag){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * code 为null 返回 "0"
     * @param code
     * @return
     */
    public static String checkIntegerIsNullOfZero(String code){
        return StringUtils.isEmpty(code)?"0":code;
    }

    /**
     * 设置返回值的基本信息
     * @param code 状态码
     * @param errCode 异常码
     * @param msg  提示信息
     * @param orderVo 载体
     */
    public static void  setResponseBasicInfo(ResponseDiscountVo responseDiscountVo, String code, Integer errCode, String msg, OrderVo orderVo){
        responseDiscountVo.setCode(code);
        responseDiscountVo.setErrCode(errCode);
        responseDiscountVo.setMsg(msg);
        responseDiscountVo.setOrderVo(orderVo);
    }

    /**
     * 设置响应列表的优惠券列表基础信息
     * @param ticketVo 优惠劵VO
     * @param marketTicket 查询优惠券DO
     * @param orderVo 订单VO
     * @param responseDiscountVo 响应实体VO
     * @param code 状态码
     */
    public static void setResponseDiscountItemsBasicInfo(TicketVo ticketVo, MarketTicket marketTicket,OrderVo orderVo,ResponseDiscountVo responseDiscountVo,String code){
        List<DiscountItem> discountItems = new ArrayList<>();
        DiscountItem discountItem = new DiscountItem();
        discountItem.setId(ticketVo.getId());
        discountItem.setDiscount(marketTicket.getTicketAmount());
        discountItem.setDiscountType(String.valueOf(marketTicket.getTicketType()));
        discountItem.setName(marketTicket.getTicketName());
        discountItems.add(discountItem);
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setCode(code);
        responseDiscountVo.setDiscountItem(discountItems);
    }

    /**
     * 设置单个优惠券基础信息
     * @param ticketVo 优惠券VO
     * @param ticketName 劵名称
     * @param memberTicketId 会员持有劵ID
     * @param ticketAmount 优惠券面额
     * @param ticketType  优惠券类型
     */
    public static void setTicketVoBasicInfo(TicketVo ticketVo, String ticketName, String memberTicketId, BigDecimal ticketAmount,String ticketType){
        ticketVo.setTicketName(ticketName);
        ticketVo.setTicketId(memberTicketId);
        ticketVo.setTicketAmount(ticketAmount);
        ticketVo.setTicketType(ticketType);
    }

    /**
     * 获取商品或者计次卡 实付单价信息 --单种类商品[不刨除优惠均摊]
     * @param orderSubVo
     * @param orderVo
     * @return
     */
    public static BigDecimal getGoodsOrTimeCardRealPayPrice(OrderSubVo orderSubVo,OrderVo orderVo){
        //商品单价
        BigDecimal price = orderSubVo.getPrice();
        //判断是否是会员  (用总单的会员来判断就可)  是则取会员价
        if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            price = orderSubVo.getMemberPrice();
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
        return price;
    }

    /**
     * 获取服务类订单实际待支付金额 -->单个服务[刨除优惠均摊]
     * @param orderSubVo
     * @param orderVo
     * @return
     */
    public static BigDecimal getServiceRealPayPrice(OrderSubVo orderSubVo,OrderVo orderVo){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        //计算金额
        BigDecimal price=new BigDecimal(0.00);
        boolean flag=ConstantCommMethod.checkHaveTickets(orderSubVo.getTicketVoList(), TicketType.EXPERIENCETICKET_TYPE);
        if (flag){
            //使用体验劵
            return toPayAmount;
        }
        if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
            return toPayAmount;
        }
        if (StringUtils.isNotEmpty(orderVo.getBillingUser())||StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                price=price.add(orderSubVo.getOriginPrice());
            }else {
                price=price.add(orderSubVo.getMemberPrice());
            }
        }else {
            price=price.add(orderSubVo.getOriginPrice());
        }
        BigDecimal singPrice = BigDecimal.ZERO;
        singPrice = singPrice.add(price).subtract(orderSubVo.getTotalDiscount());
        toPayAmount =toPayAmount.add(singPrice);
        return toPayAmount;
    }
}
