package com.mudule.mumzonemarketcal.component.po.base;

import java.util.Date;

public class BaseGatewaySwimmingring {
    private String id;

    private String gatewayId;

    private String swimingringId;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getSwimingringId() {
        return swimingringId;
    }

    public void setSwimingringId(String swimingringId) {
        this.swimingringId = swimingringId;
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