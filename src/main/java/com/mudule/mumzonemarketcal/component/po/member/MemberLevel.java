package com.mudule.mumzonemarketcal.component.po.member;

import java.util.Date;

public class MemberLevel {
    private String id;

    private String companyId;

    private String code;

    private String name;

    private Byte upgradeType;

    private Integer integral;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    private Byte discountType;

    private String memberDiscount;

    private String memberPriceLevelId;

    private String levelDescribe;

    private Byte validType;

    private Integer retainTime;

    private Integer totalAmount;

    private Integer rewardIntegral;

    private Byte source;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(Byte upgradeType) {
        this.upgradeType = upgradeType;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
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

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }

    public Byte getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Byte discountType) {
        this.discountType = discountType;
    }

    public String getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(String memberDiscount) {
        this.memberDiscount = memberDiscount;
    }

    public String getMemberPriceLevelId() {
        return memberPriceLevelId;
    }

    public void setMemberPriceLevelId(String memberPriceLevelId) {
        this.memberPriceLevelId = memberPriceLevelId;
    }

    public String getLevelDescribe() {
        return levelDescribe;
    }

    public void setLevelDescribe(String levelDescribe) {
        this.levelDescribe = levelDescribe;
    }

    public Byte getValidType() {
        return validType;
    }

    public void setValidType(Byte validType) {
        this.validType = validType;
    }

    public Integer getRetainTime() {
        return retainTime;
    }

    public void setRetainTime(Integer retainTime) {
        this.retainTime = retainTime;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getRewardIntegral() {
        return rewardIntegral;
    }

    public void setRewardIntegral(Integer rewardIntegral) {
        this.rewardIntegral = rewardIntegral;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }
}