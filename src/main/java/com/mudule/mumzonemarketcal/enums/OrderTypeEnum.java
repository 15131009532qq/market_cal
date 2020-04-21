package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 订单类型枚举类
 * @ClassName OrderTypeEnum
 * @Autor DZT
 * @Date 2019/3/14 16:18
 * @Version 1.0
 */
public enum  OrderTypeEnum {
    GOODSORDER("0","普通商品"),
    SERVICEORDER("1","服务类商品"),
    TIMESCARDORDER("2","计次卡商品"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    OrderTypeEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取订单类型
     * @param code
     * @return
     */
    public static OrderTypeEnum getOrderTypeEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return OrderTypeEnum.NULL;
        }
        for (OrderTypeEnum orderTypeEnum:OrderTypeEnum.values()){
            if (code.equals(orderTypeEnum.getCode())){
                return orderTypeEnum;
            }
        }
        return OrderTypeEnum.NULL;
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
