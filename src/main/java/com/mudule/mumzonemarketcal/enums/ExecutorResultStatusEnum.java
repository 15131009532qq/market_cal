package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 执行状态描述
 * @ClassName ExecutorResultStatusEnum
 * @Autor DZT
 * @Date 2019/8/28 10:36
 * @Version 1.0
 */
public enum ExecutorResultStatusEnum {
    SUCCESS("SUCCESS","执行成功！"),
    FAIL("FAIL","执行失败！"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 描述信息
     */
    private String msg;

    ExecutorResultStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取对应的枚举
     * @param code
     * @return
     */
    public static ExecutorResultStatusEnum getExecutorResultStatusEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return ExecutorResultStatusEnum.NULL;
        }
        for (ExecutorResultStatusEnum executorResultStatusEnum:ExecutorResultStatusEnum.values()){
            if (code.equals(executorResultStatusEnum.getCode())){
                return executorResultStatusEnum;
            }
        }
        return ExecutorResultStatusEnum.NULL;
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
