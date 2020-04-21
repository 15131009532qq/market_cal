package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class BaseMessage {
    private String id;

    private String companyId;

    private String title;

    private Date releaseTime;

    private Integer orderNum;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    private Byte messageType;

    private Byte messageStyle;

    private String messageCover;

    private String subTitle;

    private String contentUrl;

    private Byte messageClassify;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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

    public Byte getMessageType() {
        return messageType;
    }

    public void setMessageType(Byte messageType) {
        this.messageType = messageType;
    }

    public Byte getMessageStyle() {
        return messageStyle;
    }

    public void setMessageStyle(Byte messageStyle) {
        this.messageStyle = messageStyle;
    }

    public String getMessageCover() {
        return messageCover;
    }

    public void setMessageCover(String messageCover) {
        this.messageCover = messageCover;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Byte getMessageClassify() {
        return messageClassify;
    }

    public void setMessageClassify(Byte messageClassify) {
        this.messageClassify = messageClassify;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}