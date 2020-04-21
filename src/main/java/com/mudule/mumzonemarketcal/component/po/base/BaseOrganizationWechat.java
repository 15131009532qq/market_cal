package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class BaseOrganizationWechat {
    private String id;

    private String organizationId;

    private String wechatMchid;

    private String subWechatMchid;

    private String appId;

    private String subAppId;

    private String appKey;

    private Byte isScan;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private String apiKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getWechatMchid() {
        return wechatMchid;
    }

    public void setWechatMchid(String wechatMchid) {
        this.wechatMchid = wechatMchid;
    }

    public String getSubWechatMchid() {
        return subWechatMchid;
    }

    public void setSubWechatMchid(String subWechatMchid) {
        this.subWechatMchid = subWechatMchid;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Byte getIsScan() {
        return isScan;
    }

    public void setIsScan(Byte isScan) {
        this.isScan = isScan;
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

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}