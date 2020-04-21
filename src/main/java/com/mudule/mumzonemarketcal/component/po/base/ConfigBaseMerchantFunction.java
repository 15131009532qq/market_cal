package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class ConfigBaseMerchantFunction {
    private Long id;

    private String pid;

    private String name;

    private String funDesc;

    private Byte status;

    private Byte isLeafnode;

    private Byte dr;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunDesc() {
        return funDesc;
    }

    public void setFunDesc(String funDesc) {
        this.funDesc = funDesc;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsLeafnode() {
        return isLeafnode;
    }

    public void setIsLeafnode(Byte isLeafnode) {
        this.isLeafnode = isLeafnode;
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