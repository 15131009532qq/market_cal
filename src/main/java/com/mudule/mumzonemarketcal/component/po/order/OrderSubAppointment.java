package com.mudule.mumzonemarketcal.component.po.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderSubAppointment {
    private String id;

    private String memberCompanyId;

    private String appointmentId;

    private String serviceId;

    private String serviceName;

    private String technicianId;

    private String technicianName;

    private BigDecimal price;

    private Date appointmentTime;

    private Byte payType;

    private String goodsId;

    private Date createTime;

    private String updateTime;

    private Byte dl;

    private BigDecimal memberPrice;

    private Integer serviceLength;

    private BigDecimal originPrice;

    private BigDecimal totalDiscount;

    private Integer obtainIntegral;

    private String ticketId;

    private Byte suborderStatus;

    private String subTickets;


}