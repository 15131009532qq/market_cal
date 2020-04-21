package com.mudule.mumzonemarketcal.component.po.market;

import java.math.BigDecimal;
import java.util.Date;

public class MarketTicket {
    private String id;

    private String orgId;

    private String ticketName;

    private String ticketSubName;

    private Byte ticketType;

    private BigDecimal ticketAmount;

    private Byte isShare;

    private BigDecimal limitAmount;

    private Integer limitCount;

    private BigDecimal ticketDiscount;

    private Integer giveCount;

    private Byte validType;

    private Integer validDay;

    private Date startDate;

    private Date endDate;

    private Byte putChannel;

    private Byte joinType;

    private String applyType;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketSubName() {
        return ticketSubName;
    }

    public void setTicketSubName(String ticketSubName) {
        this.ticketSubName = ticketSubName;
    }

    public Byte getTicketType() {
        return ticketType;
    }

    public void setTicketType(Byte ticketType) {
        this.ticketType = ticketType;
    }

    public BigDecimal getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(BigDecimal ticketAmount) {
        this.ticketAmount = ticketAmount;
    }

    public Byte getIsShare() {
        return isShare;
    }

    public void setIsShare(Byte isShare) {
        this.isShare = isShare;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public BigDecimal getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(BigDecimal ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
    }

    public Integer getGiveCount() {
        return giveCount;
    }

    public void setGiveCount(Integer giveCount) {
        this.giveCount = giveCount;
    }

    public Byte getValidType() {
        return validType;
    }

    public void setValidType(Byte validType) {
        this.validType = validType;
    }

    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getPutChannel() {
        return putChannel;
    }

    public void setPutChannel(Byte putChannel) {
        this.putChannel = putChannel;
    }

    public Byte getJoinType() {
        return joinType;
    }

    public void setJoinType(Byte joinType) {
        this.joinType = joinType;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
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

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }
}