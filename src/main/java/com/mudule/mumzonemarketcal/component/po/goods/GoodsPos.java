package com.mudule.mumzonemarketcal.component.po.goods;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsPos {
    private String id;

    private String goodsShopId;

    private String posPriceTemplateId;

    private String shopId;

    private String name;

    private String code;

    private String barCode;

    private String goodsCode;

    private BigDecimal goodsSalePrice;

    private BigDecimal goodsMemberPrice;

    private String primaryClassifyId;

    private String goodsUnitId;

    private String goodsUnitName;

    private String goodsPackParameterId;

    private Byte status;

    private Byte bulkBear;

    private String incomeTaxRates;

    private BigDecimal manufacturerPrice;

    private Byte isBatch;

    private Byte isAllot;

    private Byte retailState;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsShopId() {
        return goodsShopId;
    }

    public void setGoodsShopId(String goodsShopId) {
        this.goodsShopId = goodsShopId;
    }

    public String getPosPriceTemplateId() {
        return posPriceTemplateId;
    }

    public void setPosPriceTemplateId(String posPriceTemplateId) {
        this.posPriceTemplateId = posPriceTemplateId;
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

    public BigDecimal getGoodsSalePrice() {
        return goodsSalePrice;
    }

    public void setGoodsSalePrice(BigDecimal goodsSalePrice) {
        this.goodsSalePrice = goodsSalePrice;
    }

    public BigDecimal getGoodsMemberPrice() {
        return goodsMemberPrice;
    }

    public void setGoodsMemberPrice(BigDecimal goodsMemberPrice) {
        this.goodsMemberPrice = goodsMemberPrice;
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

    public String getGoodsUnitName() {
        return goodsUnitName;
    }

    public void setGoodsUnitName(String goodsUnitName) {
        this.goodsUnitName = goodsUnitName;
    }

    public String getGoodsPackParameterId() {
        return goodsPackParameterId;
    }

    public void setGoodsPackParameterId(String goodsPackParameterId) {
        this.goodsPackParameterId = goodsPackParameterId;
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

    public String getIncomeTaxRates() {
        return incomeTaxRates;
    }

    public void setIncomeTaxRates(String incomeTaxRates) {
        this.incomeTaxRates = incomeTaxRates;
    }

    public BigDecimal getManufacturerPrice() {
        return manufacturerPrice;
    }

    public void setManufacturerPrice(BigDecimal manufacturerPrice) {
        this.manufacturerPrice = manufacturerPrice;
    }

    public Byte getIsBatch() {
        return isBatch;
    }

    public void setIsBatch(Byte isBatch) {
        this.isBatch = isBatch;
    }

    public Byte getIsAllot() {
        return isAllot;
    }

    public void setIsAllot(Byte isAllot) {
        this.isAllot = isAllot;
    }

    public Byte getRetailState() {
        return retailState;
    }

    public void setRetailState(Byte retailState) {
        this.retailState = retailState;
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