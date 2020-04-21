package com.mudule.mumzonemarketcal.component.po.base;

public class BaseZjAccount {
    private String id;

    private String baseShopId;

    private String accountName;

    private Byte certificateType;

    private String certificateNo;

    private Byte customerType;

    private Byte status;

    private Byte dr;

    private String cltaccbnkeid;

    private String cltaccopenbkcd;

    private String cltaccopenbknm;

    private String mchid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBaseShopId() {
        return baseShopId;
    }

    public void setBaseShopId(String baseShopId) {
        this.baseShopId = baseShopId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Byte getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Byte certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public Byte getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Byte customerType) {
        this.customerType = customerType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getDr() {
        return dr;
    }

    public void setDr(Byte dr) {
        this.dr = dr;
    }

    public String getCltaccbnkeid() {
        return cltaccbnkeid;
    }

    public void setCltaccbnkeid(String cltaccbnkeid) {
        this.cltaccbnkeid = cltaccbnkeid;
    }

    public String getCltaccopenbkcd() {
        return cltaccopenbkcd;
    }

    public void setCltaccopenbkcd(String cltaccopenbkcd) {
        this.cltaccopenbkcd = cltaccopenbkcd;
    }

    public String getCltaccopenbknm() {
        return cltaccopenbknm;
    }

    public void setCltaccopenbknm(String cltaccopenbknm) {
        this.cltaccopenbknm = cltaccopenbknm;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }
}