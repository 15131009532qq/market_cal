package com.mudule.mumzonemarketcal.component.po.market;

import java.util.Date;

public class MarketH5 {
    private String id;

    private String title;

    private String url;

    private String checkedRecourceId;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCheckedRecourceId() {
        return checkedRecourceId;
    }

    public void setCheckedRecourceId(String checkedRecourceId) {
        this.checkedRecourceId = checkedRecourceId;
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