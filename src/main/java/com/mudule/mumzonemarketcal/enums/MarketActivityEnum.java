package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 营销活动
 * @ClassName MarketActivityEnum
 * @Autor DZT
 * @Date 2019/9/24 10:00
 * @Version 1.0
 */
public enum MarketActivityEnum {
    MEMBER_PULL_NEW("0","会员拉新"),
    MEMBER_LOVING("1","会员关怀"),
    ONE_ORDER_DISCOUNT_1("3","整单折扣"),
    ONE_ORDER_DISCOUNT_2("4","整单满减"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    MarketActivityEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取订单类型
     * @param code
     * @return
     */
    public static MarketActivityEnum getMarketActivityEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return MarketActivityEnum.NULL;
        }
        for (MarketActivityEnum marketActivityEnum:MarketActivityEnum.values()){
            if (code.equals(marketActivityEnum.getCode())){
                return marketActivityEnum;
            }
        }
        return MarketActivityEnum.NULL;
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
    }}
