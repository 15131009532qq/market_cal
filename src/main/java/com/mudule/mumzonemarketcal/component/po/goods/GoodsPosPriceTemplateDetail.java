package com.mudule.mumzonemarketcal.component.po.goods;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsPosPriceTemplateDetail {
    private String id;

    private String priceTemplateId;

    private String priceTemplateCode;

    private String goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private BigDecimal memberPrice;

    private String goodsUnit;

    private String goodsSpec;

    private String barCode;

    private Byte isFreight;

    private BigDecimal freight;

    private Byte changeStatus;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPriceTemplateId() {
        return priceTemplateId;
    }

    public void setPriceTemplateId(String priceTemplateId) {
        this.priceTemplateId = priceTemplateId;
    }

    public String getPriceTemplateCode() {
        return priceTemplateCode;
    }

    public void setPriceTemplateCode(String priceTemplateCode) {
        this.priceTemplateCode = priceTemplateCode;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Byte getIsFreight() {
        return isFreight;
    }

    public void setIsFreight(Byte isFreight) {
        this.isFreight = isFreight;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public Byte getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Byte changeStatus) {
        this.changeStatus = changeStatus;
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

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }
}