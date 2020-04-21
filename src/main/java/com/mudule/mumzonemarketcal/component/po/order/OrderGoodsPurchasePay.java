package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderGoodsPurchasePay {
    private String id;

    private String orderCode;

    private String paymentShopId;

    private String receiveShopId;

    private BigDecimal money;

    private Byte payType;

    private String shopId;

    private String retFlowId;

    private String returnCode;

    private String timeEnd;

    private Date createTime;

    private Integer sysPayCnl;

    private String bizOrderNo;

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

    public String getPaymentShopId() {
        return paymentShopId;
    }

    public void setPaymentShopId(String paymentShopId) {
        this.paymentShopId = paymentShopId;
    }

    public String getReceiveShopId() {
        return receiveShopId;
    }

    public void setReceiveShopId(String receiveShopId) {
        this.receiveShopId = receiveShopId;
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

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getRetFlowId() {
        return retFlowId;
    }

    public void setRetFlowId(String retFlowId) {
        this.retFlowId = retFlowId;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSysPayCnl() {
        return sysPayCnl;
    }

    public void setSysPayCnl(Integer sysPayCnl) {
        this.sysPayCnl = sysPayCnl;
    }

    public String getBizOrderNo() {
        return bizOrderNo;
    }

    public void setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
    }
}