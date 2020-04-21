package com.mudule.mumzonemarketcal.component.po.goods;

import java.util.Date;

public class GoodsLabel {
    private String id;

    private String shopId;

    private String name;

    private Byte labelType;

    private Date createTime;

    private Date updateTime;

    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getLabelType() {
        return labelType;
    }

    public void setLabelType(Byte labelType) {
        this.labelType = labelType;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}