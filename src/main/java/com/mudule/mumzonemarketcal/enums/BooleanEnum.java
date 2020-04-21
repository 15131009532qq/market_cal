package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 请输入类描述信息
 * @ClassName BooleanEnum
 * @Autor DZT
 * @Date 2019/8/28 10:48
 * @Version 1.0
 */
public enum BooleanEnum {
    TRUE("true","确定"),
    FALSE("false","不确定"),
    NULL(null,"空");
    /**
     * 布尔值
      */
    private String code;
    /**
     * 状态码
     */
    private String msg;

    /**
     * 获取对应的枚举
     * @param code
     * @return
     */
    public static BooleanEnum getBooleanEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return BooleanEnum.NULL;
        }
        for (BooleanEnum marketJoinTypeEnum:BooleanEnum.values()){
            if (code.equals(marketJoinTypeEnum.code)){
                return marketJoinTypeEnum;
            }
        }
        return BooleanEnum.NULL;
    }

    BooleanEnum(String code, String msg) {
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
