package com.mudule.mumzonemarketcal.component.po.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderGoodsPurchase {
    private String id;

    private String purchaseCode;

    private String shopId;

    private String supplierId;

    private Date receiveDate;

    private Date orderDate;

    private String consignee;

    private String linkman;

    private String address;

    private Byte purchaseStatus;

    private Byte receivedStatus;

    private Byte payStatus;

    private String creator;

    private Integer purchaseNum;

    private Integer arriveNum;

    private BigDecimal purchaseAmount;

    private BigDecimal freight;

    private BigDecimal amount;

    private BigDecimal payAmount;

    private Byte purchaseType;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String shopName;

    private String supplierName;

    private Byte auditStatus;

    private BigDecimal confirmPurchaseAmount;

    private BigDecimal confirmFreight;

    private BigDecimal confirmAmount;

    private Byte refundApplyStatus;

    private BigDecimal onPay;

    private Byte statusFlow;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
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

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public Integer getArriveNum() {
        return arriveNum;
    }

    public void setArriveNum(Integer arriveNum) {
        this.arriveNum = arriveNum;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
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

    public Byte getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(Byte purchaseType) {
        this.purchaseType = purchaseType;
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

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public BigDecimal getConfirmPurchaseAmount() {
        return confirmPurchaseAmount;
    }

    public void setConfirmPurchaseAmount(BigDecimal confirmPurchaseAmount) {
        this.confirmPurchaseAmount = confirmPurchaseAmount;
    }

    public BigDecimal getConfirmFreight() {
        return confirmFreight;
    }

    public void setConfirmFreight(BigDecimal confirmFreight) {
        this.confirmFreight = confirmFreight;
    }

    public BigDecimal getConfirmAmount() {
        return confirmAmount;
    }

    public void setConfirmAmount(BigDecimal confirmAmount) {
        this.confirmAmount = confirmAmount;
    }

    public Byte getRefundApplyStatus() {
        return refundApplyStatus;
    }

    public void setRefundApplyStatus(Byte refundApplyStatus) {
        this.refundApplyStatus = refundApplyStatus;
    }

    public BigDecimal getOnPay() {
        return onPay;
    }

    public void setOnPay(BigDecimal onPay) {
        this.onPay = onPay;
    }

    public Byte getStatusFlow() {
        return statusFlow;
    }

    public void setStatusFlow(Byte statusFlow) {
        this.statusFlow = statusFlow;
    }
}