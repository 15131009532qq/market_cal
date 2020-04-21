package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class BaseOrganizationAlipay {
    private String id;

    private String organizationId;

    private String partner;

    private String appId;

    private String zfbPublicKey;

    private String rsaPublicKey;

    private String rsaPrivateKey;

    private Byte isScan;

    private Byte status;

    private Date createTime;

    private Date updateTime;

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

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getZfbPublicKey() {
        return zfbPublicKey;
    }

    public void setZfbPublicKey(String zfbPublicKey) {
        this.zfbPublicKey = zfbPublicKey;
    }

    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
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
}