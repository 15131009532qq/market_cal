package com.mudule.mumzonemarketcal.constant;

/**
 * @Description 优惠券类型
 * @ClassName TicketType
 * @Autor DZT
 * @Date 2019/3/18 10:22
 * @Version 1.0
 */
public interface TicketType {
    /**
     * 体验劵
     */
    String EXPERIENCETICKET_TYPE="0";
    /**
     * 1-满减券
     */
    String  DISCOUNTCOUPONS="1";
    /**
     * 2-买折券，
     */
    String BUYDISCOUNTCOUPONS="2";
    /**
     * 3-买赠券
     */
    String  GIFTCOUPON="3";
    /**
     * 4-计次卡
     */
    String TIMECARD="4";
    /**
     * 5-折扣劵
     */
    String WITH_DISCOUNT_COUPONS="5";
    /**
     * 3-抹零
     */
    String MLTYPE="3";
    /**
     * 现金:组合支付的一种方式
     */
    String CASH="6";
    /**
     * 余额:组合支付的一种方式
     */
    String BALANCE="7";
    /**
     * 8-满减活动
     */
    String ONE_ORDER_SUB="8";
    /**
     * 9-满折活动
     */
    String ONE_ORDEr_DISCOUNT="9";
    /**
     * 10-积分抵现
     */
    String INTEGRAL_PAY="10";
}
