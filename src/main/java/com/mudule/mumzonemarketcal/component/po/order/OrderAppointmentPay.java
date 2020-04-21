package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderAppointmentPay {
    private String id;

    private String orderCode;

    private String serviceId;

    private String userId;

    private BigDecimal money;

    private Byte payType;

    private String mchId;

    private String retFlowId;

    private String buyerEmail;

    private String returnCode;

    private Date timeEnd;

    private Date createTime;

    private Integer usedNum;

    private Integer sysPayCnl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getRetFlowId() {
        return retFlowId;
    }

    public void setRetFlowId(String retFlowId) {
        this.retFlowId = retFlowId;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public Integer getSysPayCnl() {
        return sysPayCnl;
    }

    public void setSysPayCnl(Integer sysPayCnl) {
        this.sysPayCnl = sysPayCnl;
    }
}