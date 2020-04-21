package com.mudule.mumzonemarketcal.component.po.base;

import java.math.BigDecimal;
import java.util.Date;

public class BaseUserOrgAccess {
    private String id;

    private String userId;

    private String orgId;

    private Byte accessType;

    private BigDecimal mlMoney;

    private Byte mlAccess;

    private Byte dr;

    private Date createTime;

    private Date updateTime;

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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Byte getAccessType() {
        return accessType;
    }

    public void setAccessType(Byte accessType) {
        this.accessType = accessType;
    }

    public BigDecimal getMlMoney() {
        return mlMoney;
    }

    public void setMlMoney(BigDecimal mlMoney) {
        this.mlMoney = mlMoney;
    }

    public Byte getMlAccess() {
        return mlAccess;
    }

    public void setMlAccess(Byte mlAccess) {
        this.mlAccess = mlAccess;
    }

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
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