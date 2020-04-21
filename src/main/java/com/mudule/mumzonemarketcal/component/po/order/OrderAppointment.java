package com.mudule.mumzonemarketcal.component.po.order;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderAppointment {
    private String id;

    private String memberCompanyId;

    private String companyId;

    private String shopId;

    private String orderCode;

    private String userPhone;

    private String userName;

    private String appointmentTime;

    private BigDecimal amount;

    private Byte status;

    private Date arriveTime;

    private Date endTime;

    private Byte source;

    private Date createTime;

    private Date updateTime;

    private Byte dr;

    private String gender;

    private String remark;

    private String cancelReason;

    private Date cancelTime;

    private Byte cancelType;

    private String cancelUser;

    private BigDecimal bargainingAmount;

    private String activityId;

    private BigDecimal activityAmount;

    private String ticketId;

    private BigDecimal ticketAmount;

    private BigDecimal mlPrice;

    private Integer integralMoney;

    private BigDecimal integralAmount;

    private Integer integralGoods;

    private String cashier;

    private String posCode;

    private BigDecimal cashCollection;

    private BigDecimal cashChange;

    private String billingUser;

    private String salerId;

    private String activityName;

    private String experienceId;

    private String experienceName;

    private BigDecimal experienceAmount;

    private Integer totalGain;

    private Byte orderType;

    private String tickets;

}