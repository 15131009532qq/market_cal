package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 上下架
 * @ClassName StandAndDownEnum
 * @Autor DZT
 * @Date 2019/9/24 10:35
 * @Version 1.0
 */
public enum StandAndDownEnum {
    STAND("0","上架"),
    DOWN("1","下架"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    StandAndDownEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取订单类型
     * @param code
     * @return
     */
    public static StandAndDownEnum getStandAndDownEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return StandAndDownEnum.NULL;
        }
        for (StandAndDownEnum standAndDownEnum:StandAndDownEnum.values()){
            if (code.equals(standAndDownEnum.getCode())){
                return standAndDownEnum;
            }
        }
        return StandAndDownEnum.NULL;
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
