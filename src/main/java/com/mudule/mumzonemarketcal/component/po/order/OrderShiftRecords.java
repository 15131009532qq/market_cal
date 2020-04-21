package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderShiftRecords {
    private String id;

    private String userId;

    private BigDecimal receivableAmount;

    private BigDecimal actualAmount;

    private BigDecimal quotationAmount;

    private BigDecimal overAndShort;

    private BigDecimal cashAmount;

    private BigDecimal cardAmount;

    private BigDecimal wechatAmount;

    private BigDecimal aliAmount;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date updateTime;

    private BigDecimal cashFirm;

    private String shopId;

    private String shopName;

    private BigDecimal timeCardAmount;

    private BigDecimal memberAccount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(BigDecimal receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public BigDecimal getQuotationAmount() {
        return quotationAmount;
    }

    public void setQuotationAmount(BigDecimal quotationAmount) {
        this.quotationAmount = quotationAmount;
    }

    public BigDecimal getOverAndShort() {
        return overAndShort;
    }

    public void setOverAndShort(BigDecimal overAndShort) {
        this.overAndShort = overAndShort;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BigDecimal getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(BigDecimal cardAmount) {
        this.cardAmount = cardAmount;
    }

    public BigDecimal getWechatAmount() {
        return wechatAmount;
    }

    public void setWechatAmount(BigDecimal wechatAmount) {
        this.wechatAmount = wechatAmount;
    }

    public BigDecimal getAliAmount() {
        return aliAmount;
    }

    public void setAliAmount(BigDecimal aliAmount) {
        this.aliAmount = aliAmount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getCashFirm() {
        return cashFirm;
    }

    public void setCashFirm(BigDecimal cashFirm) {
        this.cashFirm = cashFirm;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BigDecimal getTimeCardAmount() {
        return timeCardAmount;
    }

    public void setTimeCardAmount(BigDecimal timeCardAmount) {
        this.timeCardAmount = timeCardAmount;
    }

    public BigDecimal getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(BigDecimal memberAccount) {
        this.memberAccount = memberAccount;
    }
}