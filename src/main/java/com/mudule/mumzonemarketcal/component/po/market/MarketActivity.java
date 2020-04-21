package com.mudule.mumzonemarketcal.component.po.market;

import java.math.BigDecimal;
import java.util.Date;

public class MarketActivity {
    private String id;

    private String orgId;

    private String activityName;

    private Byte activityType;

    private Date activityStartTime;

    private Date activityEndTime;

    private String activityCreater;

    private Byte activityAuditState;

    private Byte activityState;

    private Byte activityCrowd;

    private Integer maxTimes;

    private String putChannel;

    private String url;

    private String activityTriggerCondition;

    private Byte receiveType;

    private String msgTemplateId;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    private String urlId;

    private String activityCode;

    private Byte activitySource;

    private Byte status;

    private Byte joinType;

    private BigDecimal limitAmount;

    private BigDecimal discountAmount;

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

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Byte getActivityType() {
        return activityType;
    }

    public void setActivityType(Byte activityType) {
        this.activityType = activityType;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getActivityCreater() {
        return activityCreater;
    }

    public void setActivityCreater(String activityCreater) {
        this.activityCreater = activityCreater;
    }

    public Byte getActivityAuditState() {
        return activityAuditState;
    }

    public void setActivityAuditState(Byte activityAuditState) {
        this.activityAuditState = activityAuditState;
    }

    public Byte getActivityState() {
        return activityState;
    }

    public void setActivityState(Byte activityState) {
        this.activityState = activityState;
    }

    public Byte getActivityCrowd() {
        return activityCrowd;
    }

    public void setActivityCrowd(Byte activityCrowd) {
        this.activityCrowd = activityCrowd;
    }

    public Integer getMaxTimes() {
        return maxTimes;
    }

    public void setMaxTimes(Integer maxTimes) {
        this.maxTimes = maxTimes;
    }

    public String getPutChannel() {
        return putChannel;
    }

    public void setPutChannel(String putChannel) {
        this.putChannel = putChannel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActivityTriggerCondition() {
        return activityTriggerCondition;
    }

    public void setActivityTriggerCondition(String activityTriggerCondition) {
        this.activityTriggerCondition = activityTriggerCondition;
    }

    public Byte getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Byte receiveType) {
        this.receiveType = receiveType;
    }

    public String getMsgTemplateId() {
        return msgTemplateId;
    }

    public void setMsgTemplateId(String msgTemplateId) {
        this.msgTemplateId = msgTemplateId;
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

    public String getUrlId() {
        return urlId;
    }

    public void setUrlId(String urlId) {
        this.urlId = urlId;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Byte getActivitySource() {
        return activitySource;
    }

    public void setActivitySource(Byte activitySource) {
        this.activitySource = activitySource;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getJoinType() {
        return joinType;
    }

    public void setJoinType(Byte joinType) {
        this.joinType = joinType;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }
}