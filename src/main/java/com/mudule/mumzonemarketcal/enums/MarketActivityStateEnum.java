package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 活动状态
 * @ClassName MarketActivityStateEnum
 * @Autor DZT
 * @Date 2019/9/24 10:07
 * @Version 1.0
 */
public enum MarketActivityStateEnum {
    NO_START("0","未开始"),
    START("1","已开始"),
    END("2","已结束"),
    OFF_LINE("3","已下线"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    MarketActivityStateEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取活动类型
     * @param code
     * @return
     */
    public static MarketActivityStateEnum getMarketActivityStateEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return MarketActivityStateEnum.NULL;
        }
        for (MarketActivityStateEnum marketActivityEnum:MarketActivityStateEnum.values()){
            if (code.equals(marketActivityEnum.getCode())){
                return marketActivityEnum;
            }
        }
        return MarketActivityStateEnum.NULL;
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
