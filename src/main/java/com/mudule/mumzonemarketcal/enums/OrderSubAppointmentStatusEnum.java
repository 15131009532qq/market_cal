package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 子预约单状态码
 * @ClassName OrderSubAppointmentStatusEnum
 * @Autor DZT
 * @Date 2019/8/28 9:26
 * @Version 1.0
 */
public enum OrderSubAppointmentStatusEnum {
    APPOINTMENT("1","预约"),
    SERVICEING("2","服务中"),
    FINSHING("3","已完成"),
    NULL(null,"空");
    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    OrderSubAppointmentStatusEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    /**
     * 获取订单类型
     * @param code
     * @return
     */
    public static OrderSubAppointmentStatusEnum getOrderSubAppointmentStatusEnumByCode(String code){
        if (StringUtils.isEmpty(code)){
            return OrderSubAppointmentStatusEnum.NULL;
        }
        for (OrderSubAppointmentStatusEnum orderSubAppointmentStatusEnum:OrderSubAppointmentStatusEnum.values()){
            if (code.equals(orderSubAppointmentStatusEnum.getCode())){
                return orderSubAppointmentStatusEnum;
            }
        }
        return OrderSubAppointmentStatusEnum.NULL;
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
    }
}
