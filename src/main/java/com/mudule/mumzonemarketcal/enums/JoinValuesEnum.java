package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 对接字段名称枚举
 * @ClassName JoinValuesEnum
 * @Autor DZT
 * @Date 2019/8/28 10:24
 * @Version 1.0
 */
public enum JoinValuesEnum {
    CODE("code","状态码"),
    GAINID("gainId","规则码"),
    GOODSID("goodsId","商品ID"),
    STATUS("status","状态"),
    LIST("list","列表"),
    MLAMOUNT("mlAmount","抹零"),
    ID("id","ID"),
    TIME("time","小儿游泳异步任务执行分钟数"),
    SUBOBJECT("subObject","邮箱发送主题"),
    CONTENT("content","邮箱发送的内容"),
    MSG("msg","返回信息"),
    NULL(null,"空");
    private String value;
    private String msg;

    JoinValuesEnum(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    /**
     * 获取对应的枚举
     * @param value
     * @return
     */
    public static JoinValuesEnum getJoinValuesEnumByCode(String value){
        if (StringUtils.isEmpty(value)){
            return JoinValuesEnum.NULL;
        }
        for (JoinValuesEnum joinValuesEnum:JoinValuesEnum.values()){
            if (value.equals(joinValuesEnum.value)){
                return joinValuesEnum;
            }
        }
        return JoinValuesEnum.NULL;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
