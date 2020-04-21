package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class ConfigBaseBossMenuAuth {
    private Integer id;

    private Integer bossMenuId;

    private Integer authId;

    private Byte dr;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBossMenuId() {
        return bossMenuId;
    }

    public void setBossMenuId(Integer bossMenuId) {
        this.bossMenuId = bossMenuId;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}