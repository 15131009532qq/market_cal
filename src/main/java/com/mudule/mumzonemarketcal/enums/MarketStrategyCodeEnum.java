package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 执行策略code码
 * @ClassName MarketStrategyCodeEnum
 * @Autor DZT
 * @Date 2019/8/28 11:55
 * @Version 1.0
 */
public enum MarketStrategyCodeEnum {
    ONE("1","体验劵"),
    TWO("2","获取积分"),
    THREE("3","积分抵现"),
    FOUR("4","营销活动"),
    FIVE("5","抹零"),
    SIX("6","计次卡"),
    SEVEN("7","满减劵"),
    EIGHT("8","会员折扣"),
    NINE("9","议价折扣"),
    TEN("10","折扣劵折扣"),
    ELEVEN("11","组合支付"),
    TWELVE("12","商品折扣"),
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
     * 获取枚举测试类
     * @param code
     * @return
     */
    public static MarketStrategyCodeEnum getMarketStrategyCodeEnumEnum(String code){
        if (StringUtils.isEmpty(code)){
            return MarketStrategyCodeEnum.NULL;
        }else {
            for (MarketStrategyCodeEnum marketStrategyCodeEnum:MarketStrategyCodeEnum.values()){
                if (marketStrategyCodeEnum.code.equals(code)){
                    return marketStrategyCodeEnum;
                }
            }
        }
        return MarketStrategyCodeEnum.NULL;
    }

    MarketStrategyCodeEnum(String code, String msg) {
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
