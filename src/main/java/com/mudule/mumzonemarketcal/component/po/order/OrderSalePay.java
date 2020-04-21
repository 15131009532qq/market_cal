package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderSalePay {
    private String id;

    private String orderCode;

    private String memberCompanyId;

    private BigDecimal money;

    private Byte payType;

    private String mchId;

    private String retFlowId;

    private String buyerEmail;

    private String returnCode;

    private String timeEnd;

    private Date createTime;

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

    public String getMemberCompanyId() {
        return memberCompanyId;
    }

    public void setMemberCompanyId(String memberCompanyId) {
        this.memberCompanyId = memberCompanyId;
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
}