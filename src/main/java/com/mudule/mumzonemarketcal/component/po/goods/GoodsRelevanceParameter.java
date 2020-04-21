package com.mudule.mumzonemarketcal.component.po.goods;

import java.util.Date;

public class GoodsRelevanceParameter {
    private String id;

    private String goodsId;

    private String goodsParameterDetailId;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsParameterDetailId() {
        return goodsParameterDetailId;
    }

    public void setGoodsParameterDetailId(String goodsParameterDetailId) {
        this.goodsParameterDetailId = goodsParameterDetailId;
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