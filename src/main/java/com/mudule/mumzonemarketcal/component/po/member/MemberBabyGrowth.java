package com.mudule.mumzonemarketcal.component.po.member;

import java.util.Date;

public class MemberBabyGrowth {
    private String id;

    private String companyId;

    private String memberCompanyId;

    private String babyId;

    private String imageUrl;

    private Byte imageType;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String thumbnailUrl;

    private String lifeRecordId;

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

    public String getMemberCompanyId() {
        return memberCompanyId;
    }

    public void setMemberCompanyId(String memberCompanyId) {
        this.memberCompanyId = memberCompanyId;
    }

    public String getBabyId() {
        return babyId;
    }

    public void setBabyId(String babyId) {
        this.babyId = babyId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Byte getImageType() {
        return imageType;
    }

    public void setImageType(Byte imageType) {
        this.imageType = imageType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getLifeRecordId() {
        return lifeRecordId;
    }

    public void setLifeRecordId(String lifeRecordId) {
        this.lifeRecordId = lifeRecordId;
    }
}