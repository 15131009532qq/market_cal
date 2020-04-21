package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 优惠券和组合支付方式枚举
 * @ClassName TicketTypeEnum
 * @Autor DZT
 * @Date 2019/8/28 10:13
 * @Version 1.0
 */
public enum PriceTypeEnum {
    PRICE("0","原价"),
    MEMBER_PRICE("1","会员价"),
    BARIGARING_PRICE("2","议价"),
    CHANGE_PRICE("3","单品变价"),
    MEMBER_DISCOUNT("4","会员折扣"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 描述信息
     */
    private String msg;
    PriceTypeEnum(String code, String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取对应的枚举
     * @param code
     * @return
     */
    public static PriceTypeEnum getPriceTypeEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return PriceTypeEnum.NULL;
        }
        for (PriceTypeEnum ticketTypeEnum: PriceTypeEnum.values()){
            if (code.equals(ticketTypeEnum.getCode())){
                return ticketTypeEnum;
            }
        }
        return PriceTypeEnum.NULL;
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
