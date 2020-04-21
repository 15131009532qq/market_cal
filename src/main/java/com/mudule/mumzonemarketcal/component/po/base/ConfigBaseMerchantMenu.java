package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class ConfigBaseMerchantMenu {
    private Long id;

    private String pid;

    private String title;

    private Byte isLeafnode;

    private Byte hierarchy;

    private String menuUrl;

    private Integer sortNum;

    private Byte accessSource;

    private Byte isShow;

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

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Byte getAccessSource() {
        return accessSource;
    }

    public void setAccessSource(Byte accessSource) {
        this.accessSource = accessSource;
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