package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class BaseProductPrefabricateRole {
    private String id;

    private String productId;

    private String roleCode;

    private String roleName;

    private String remark;

    private Byte isDistribution;

    private Byte isDisplay;

    private Byte isPreset;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getIsDistribution() {
        return isDistribution;
    }

    public void setIsDistribution(Byte isDistribution) {
        this.isDistribution = isDistribution;
    }

    public Byte getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Byte isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Byte getIsPreset() {
        return isPreset;
    }

    public void setIsPreset(Byte isPreset) {
        this.isPreset = isPreset;
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