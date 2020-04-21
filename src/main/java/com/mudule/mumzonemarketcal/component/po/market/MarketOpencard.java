package com.mudule.mumzonemarketcal.component.po.market;

import java.math.BigDecimal;
import java.util.Date;

public class MarketOpencard {
    private String id;

    private String companyId;

    private Byte isRatio;

    private BigDecimal amount;

    private Byte isCoupon;

    private Byte isExperience;

    private Integer sendNum;

    private String sendRules;

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

    public Byte getIsRatio() {
        return isRatio;
    }

    public void setIsRatio(Byte isRatio) {
        this.isRatio = isRatio;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getIsCoupon() {
        return isCoupon;
    }

    public void setIsCoupon(Byte isCoupon) {
        this.isCoupon = isCoupon;
    }

    public Byte getIsExperience() {
        return isExperience;
    }

    public void setIsExperience(Byte isExperience) {
        this.isExperience = isExperience;
    }

    public Integer getSendNum() {
        return sendNum;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }

    public String getSendRules() {
        return sendRules;
    }

    public void setSendRules(String sendRules) {
        this.sendRules = sendRules;
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