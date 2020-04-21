package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 支付渠道
 * @ClassName PayCnlEnum
 * @Autor DZT
 * @Date 2019/8/28 12:44
 * @Version 1.0
 */
public enum PayCnlEnum {
    ORIGIN_PAY_CNL("0","原生支付"),
    CICC_PAY_CNL("1","中金支付"),
    SM_PAY_CNL("2","商米支付"),
    NULL(null,"空");

    /**
     * 渠道码
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
    public static PayCnlEnum getPayCnlEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return PayCnlEnum.NULL;
        }
        for (PayCnlEnum payCnlEnum:PayCnlEnum.values()){
            if (code.equals(payCnlEnum.code)){
                return payCnlEnum;
            }
        }
        return PayCnlEnum.NULL;
    }

    PayCnlEnum(String code, String msg) {
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
