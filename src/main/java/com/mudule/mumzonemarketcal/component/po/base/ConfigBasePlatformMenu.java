package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class ConfigBasePlatformMenu {
    private Integer id;

    private String pid;

    private String title;

    private Byte isLeafnode;

    private Byte hierarchy;

    private Byte sortNum;

    private String menuUrl;

    private Byte accessSource;

    private Byte status;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getIsLeafnode() {
        return isLeafnode;
    }

    public void setIsLeafnode(Byte isLeafnode) {
        this.isLeafnode = isLeafnode;
    }

    public Byte getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Byte hierarchy) {
        this.hierarchy = hierarchy;
    }

    public Byte getSortNum() {
        return sortNum;
    }

    public void setSortNum(Byte sortNum) {
        this.sortNum = sortNum;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Byte getAccessSource() {
        return accessSource;
    }

    public void setAccessSource(Byte accessSource) {
        this.accessSource = accessSource;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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