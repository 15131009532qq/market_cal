package com.mudule.mumzonemarketcal.enums;

/**
 * @Description 请输入类描述信息
 * @ClassName IsTimerCardEnum
 * @Autor DZT
 * @Date 2019/8/28 14:10
 * @Version 1.0
 */
public enum IsTimerCardEnum {
    IS_TIME_CARD("1","是次卡"),
    IS_NOT_TIME_CARD("0","不是次卡");
    private String code;
    private String msg;

    IsTimerCardEnum(String code, String msg) {
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
