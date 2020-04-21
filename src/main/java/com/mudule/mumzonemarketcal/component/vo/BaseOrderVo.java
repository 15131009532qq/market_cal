package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description 总订单Base
 * @ClassName BaseOrderVo
 * @Autor DZT
 * @Date 2019/3/14 15:22
 * @Version 1.0
 */
@Data
public class BaseOrderVo {
    //总订单ID
    private String orderId;
    //公司会员ID
    private String memberCompanyId;
    //公司ID
    private String companyId;
    //门店ID
    private String shopId;
    //总订单编号
    private String orderCode;
    //总订单金额
    private BigDecimal totalAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //结账用户
    private String billingUser;
    //订单渠道:POS、APP、WEB
    private String cnl;
    //订单创建时间
    private String createTime;
    //抹零金额
    private BigDecimal mlPrice=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //订单获得总积分
    private Integer totalGain=0;
    //订单类型：不能默认0，需要判空 0->普通商品1->服务类2->计次卡...
    private String orderType;
    //订单状态：不能默认0状态，如要判null
    private String orderStatus;
    //实际支付金额
    private BigDecimal payAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //订单渠道:0原生 1：中金 2：商米
    private String payCnl;
}
