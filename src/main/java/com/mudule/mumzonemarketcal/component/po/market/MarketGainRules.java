package com.mudule.mumzonemarketcal.component.po.market;

import java.math.BigDecimal;
import java.util.Date;

public class MarketGainRules {
    private String id;

    private String companyId;

    private Byte gainType;

    private BigDecimal amount;

    private String gainRules;

    private Byte status;

    private Date createTime;

    private Date updateTime;

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

    public Byte getGainType() {
        return gainType;
    }

    public void setGainType(Byte gainType) {
        this.gainType = gainType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getGainRules() {
        return gainRules;
    }

    public void setGainRules(String gainRules) {
        this.gainRules = gainRules;
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
}