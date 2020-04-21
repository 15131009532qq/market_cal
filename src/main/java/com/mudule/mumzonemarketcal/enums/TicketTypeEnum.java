package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 优惠券和组合支付方式枚举
 * @ClassName TicketTypeEnum
 * @Autor DZT
 * @Date 2019/8/28 10:13
 * @Version 1.0
 */
public enum TicketTypeEnum {
    EXPERIENCE_SECURITIES("0","体验劵"),
    WITH_REDUCED_SECURITIES("1","满减劵"),
    WITH_DISCOUNT_COUPONS_BUY("2","买折劵"),
    WITH_GIFT_COUPONS("3","满赠劵"),
    TIMES_CARD("4","计次卡"),
    WITH_DISCOUNT_COUPONS("5","折扣劵"),
    CASH_PAY("6","现金支付"),
    MEMBER_STORE_PAY("7","余额支付"),
    ONE_ORDER_DISCOUNT("8","满减活动"),
    ONE_ORDER_SUBSTRACTION("9","满折活动"),
    INTEGRAL_PAY("10","积分抵现"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 描述信息
     */
    private String msg;
    TicketTypeEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取对应的枚举
     * @param code
     * @return
     */
    public static TicketTypeEnum getTicketTypeEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return TicketTypeEnum.NULL;
        }
        for (TicketTypeEnum ticketTypeEnum:TicketTypeEnum.values()){
            if (code.equals(ticketTypeEnum.getCode())){
                return ticketTypeEnum;
            }
        }
        return TicketTypeEnum.NULL;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
