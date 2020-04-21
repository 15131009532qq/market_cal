package com.mudule.mumzonemarketcal.component.po.member;

import java.util.Date;

public class MemberMarketCard {
    private String id;

    private String memberId;

    private String thirdIdentityId;

    private String cardTemplateId;

    private String bizCardNo;

    private Byte source;

    private Date createTime;

    private Date updateTime;

    private Date openDate;

    private Date validDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getThirdIdentityId() {
        return thirdIdentityId;
    }

    public void setThirdIdentityId(String thirdIdentityId) {
        this.thirdIdentityId = thirdIdentityId;
    }

    public String getCardTemplateId() {
        return cardTemplateId;
    }

    public void setCardTemplateId(String cardTemplateId) {
        this.cardTemplateId = cardTemplateId;
    }

    public String getBizCardNo() {
        return bizCardNo;
    }

    public void setBizCardNo(String bizCardNo) {
        this.bizCardNo = bizCardNo;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
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

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }
}