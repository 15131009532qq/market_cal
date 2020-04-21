package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderGoodsSale {
    private String id;

    private String saleCode;

    private String shopId;

    private String supplierId;

    private Date deliveryDate;

    private String purchaseCode;

    private String purchaseId;

    private Date orderDate;

    private Byte purchaseStatus;

    private Byte receivedStatus;

    private Byte payStatus;

    private String creator;

    private Integer saleNum;

    private Integer sendNum;

    private BigDecimal saleAmount;

    private BigDecimal freight;

    private BigDecimal amount;

    private BigDecimal payAmount;

    private Byte saleType;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String shopName;

    private String supplierName;

    private BigDecimal confirmSaleAmount;

    private BigDecimal confirmFreight;

    private BigDecimal confirmTax;

    private BigDecimal confirmAmount;

    private Integer confirmSaleNum;

    private Byte statusFlow;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Byte getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(Byte purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Byte getReceivedStatus() {
        return receivedStatus;
    }

    public void setReceivedStatus(Byte receivedStatus) {
        this.receivedStatus = receivedStatus;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getSendNum() {
        return sendNum;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Byte getSaleType() {
        return saleType;
    }

    public void setSaleType(Byte saleType) {
        this.saleType = saleType;
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public BigDecimal getConfirmSaleAmount() {
        return confirmSaleAmount;
    }

    public void setConfirmSaleAmount(BigDecimal confirmSaleAmount) {
        this.confirmSaleAmount = confirmSaleAmount;
    }

    public BigDecimal getConfirmFreight() {
        return confirmFreight;
    }

    public void setConfirmFreight(BigDecimal confirmFreight) {
        this.confirmFreight = confirmFreight;
    }

    public BigDecimal getConfirmTax() {
        return confirmTax;
    }

    public void setConfirmTax(BigDecimal confirmTax) {
        this.confirmTax = confirmTax;
    }

    public BigDecimal getConfirmAmount() {
        return confirmAmount;
    }

    public void setConfirmAmount(BigDecimal confirmAmount) {
        this.confirmAmount = confirmAmount;
    }

    public Integer getConfirmSaleNum() {
        return confirmSaleNum;
    }

    public void setConfirmSaleNum(Integer confirmSaleNum) {
        this.confirmSaleNum = confirmSaleNum;
    }

    public Byte getStatusFlow() {
        return statusFlow;
    }

    public void setStatusFlow(Byte statusFlow) {
        this.statusFlow = statusFlow;
    }
}