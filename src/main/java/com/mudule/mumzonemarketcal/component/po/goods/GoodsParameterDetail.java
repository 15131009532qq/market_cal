package com.mudule.mumzonemarketcal.component.po.goods;

import java.util.Date;

public class GoodsParameterDetail {
    private String id;

    private String goodsParameterId;

    private String paramValue;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Byte status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsParameterId() {
        return goodsParameterId;
    }

    public void setGoodsParameterId(String goodsParameterId) {
        this.goodsParameterId = goodsParameterId;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}