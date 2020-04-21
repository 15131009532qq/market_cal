package com.mudule.mumzonemarketcal.component.po.market;

import java.util.Date;

public class MarketConsumptionRules {
    private String id;

    private String companyId;

    private Byte consumeType;

    private String consumptionRules;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Integer integral;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Byte getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(Byte consumeType) {
        this.consumeType = consumeType;
    }

    public String getConsumptionRules() {
        return consumptionRules;
    }

    public void setConsumptionRules(String consumptionRules) {
        this.consumptionRules = consumptionRules;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}