package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 优惠规则参与状态枚举
 * @ClassName MarketJoinTypeEnum
 * @Autor DZT
 * @Date 2019/8/28 10:29
 * @Version 1.0
 */
public enum MarketJoinTypeEnum {
    ALL_JOIN("0","全部参与"),
    ASSIGN_JOIN("1","指定参与"),
    ASSIGN_NOT_JOIN("2","指定不参与"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 描述信息
     */
    private String msg;

    /**
     * 获取对应的枚举
     * @param code
     * @return
     */
    public static MarketJoinTypeEnum getMarketJoinTypeEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return MarketJoinTypeEnum.NULL;
        }
        for (MarketJoinTypeEnum marketJoinTypeEnum:MarketJoinTypeEnum.values()){
            if (code.equals(marketJoinTypeEnum.getCode())){
                return marketJoinTypeEnum;
            }
        }
        return MarketJoinTypeEnum.NULL;
    }

    MarketJoinTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
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
