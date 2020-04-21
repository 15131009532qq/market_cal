package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 活动适用人群
 * @ClassName MarketActivityCrowdEnum
 * @Autor DZT
 * @Date 2019/9/24 10:29
 * @Version 1.0
 */
public enum MarketActivityCrowdEnum {
    ALL("0","全部会员"),
    REGISTER_MEMBER("1","注册会员"),
    MEMBER_LEVEL("2","会员等级"),
    DEFIND_MEMBER("3","自定义会员"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    MarketActivityCrowdEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取订单类型
     * @param code
     * @return
     */
    public static MarketActivityCrowdEnum getMarketActivityCrowdEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return MarketActivityCrowdEnum.NULL;
        }
        for (MarketActivityCrowdEnum marketActivityCrowdEnum:MarketActivityCrowdEnum.values()){
            if (code.equals(marketActivityCrowdEnum.getCode())){
                return marketActivityCrowdEnum;
            }
        }
        return MarketActivityCrowdEnum.NULL;
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
