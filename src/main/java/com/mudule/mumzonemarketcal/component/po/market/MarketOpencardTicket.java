package com.mudule.mumzonemarketcal.component.po.market;

import java.util.Date;

public class MarketOpencardTicket {
    private String id;

    private String opencardId;

    private String ticketId;

    private Byte ticketType;

    private Integer ticketNum;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpencardId() {
        return opencardId;
    }

    public void setOpencardId(String opencardId) {
        this.opencardId = opencardId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Byte getTicketType() {
        return ticketType;
    }

    public void setTicketType(Byte ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
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
}