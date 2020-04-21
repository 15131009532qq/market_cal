package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class ConfigBaseMerchantAuth {
    private Integer id;

    private String pid;

    private String name;

    private Integer sortNum;

    private String remark;

    private Byte isLeafnode;

    private Byte isShow;

    private Byte dr;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getIsLeafnode() {
        return isLeafnode;
    }

    public void setIsLeafnode(Byte isLeafnode) {
        this.isLeafnode = isLeafnode;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
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