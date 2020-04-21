package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description Dl状态枚举
 * @ClassName DlStatusEnum
 * @Autor DZT
 * @Date 2019/8/28 10:25
 * @Version 1.0
 */
public enum DlStatusEnum {
    DL_1("1","已删除"),
    DL_0("0","正常"),
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
    public static DlStatusEnum getDlStatusEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return DlStatusEnum.NULL;
        }
        for (DlStatusEnum dlStatusEnum:DlStatusEnum.values()){
            if (code.equals(dlStatusEnum.getCode())){
                return dlStatusEnum;
            }
        }
        return DlStatusEnum.NULL;
    }

    DlStatusEnum(String code, String msg) {
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
