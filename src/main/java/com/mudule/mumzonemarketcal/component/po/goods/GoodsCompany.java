package com.mudule.mumzonemarketcal.component.po.goods;

import java.util.Date;

public class GoodsCompany {
    private String id;

    private String name;

    private String code;

    private String barCode;

    private String goodsCode;

    private String primaryClassifyId;

    private String goodsUnitId;

    private Byte status;

    private Byte bulkBear;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getPrimaryClassifyId() {
        return primaryClassifyId;
    }

    public void setPrimaryClassifyId(String primaryClassifyId) {
        this.primaryClassifyId = primaryClassifyId;
    }

    public String getGoodsUnitId() {
        return goodsUnitId;
    }

    public void setGoodsUnitId(String goodsUnitId) {
        this.goodsUnitId = goodsUnitId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getBulkBear() {
        return bulkBear;
    }

    public void setBulkBear(Byte bulkBear) {
        this.bulkBear = bulkBear;
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