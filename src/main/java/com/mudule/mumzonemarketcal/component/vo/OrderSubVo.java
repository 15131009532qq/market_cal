package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author wangjingjing
 * @date 2019-03-13
 */
@Data
public class OrderSubVo extends BaseOrderSubVo {
    //预约子单ID
    private String id;
    //预约单Id
    private String appointmentId;
    //服务ID
    private String serviceId;
    //服务名称
    private String serviceName;
    //技师ID
    private String technicianId;
    //技师名称
    private String technicianName;
    //价格
    private BigDecimal price=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //预约时间
    private String appointmentTime;
    //支付方式
    private Byte payType;
    //次卡ID (商品ID)
    private String goodsId;
    //会员价格
    private BigDecimal memberPrice=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //服务时长
    private Integer serviceLength=0;
    //服务原价
    private BigDecimal originPrice=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //优惠均摊
    private BigDecimal totalDiscount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //获得积分
    private Integer obtainIntegral=0;
    //商品名称
    private String goodsName;
    //商品skuId
    private String goodsSkuId;
    //商品数量 默认为1
    private Integer goodsCount=1;
    //议价金额
    private BigDecimal bargainPrice=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //是否次卡 0:不是次卡 1:是次卡
    private Byte isTimerCard;
    //商品类型：0-普通商品，1-赠品，2-换购商品，3-优惠券商品，4-整单满减，5-整单折扣,6-单品变价
    private Byte goodsType;
    //优惠券集合 包含优惠券和体验劵等各种类型
    private List<TicketVo> ticketVoList;
    //实付金额
    private BigDecimal goodsAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //所需积分
    private Integer integral=0;
    //是否寄存商品
    private Byte isConsign;
    //寄存数量
    private Integer consignNum=0;
    //商品规格
    private String goodsSpec;
    //单位ID
    private String goodsUnit;
    //单位名称
    private String unitName;
    //商品公司ID
    private String goodsCompanyId;
    //赠品数量 默认为0
    private Integer presentNum=0;
    //商品自身承载积分
    private Integer soldIntegral=0;
    //商品变价 变价金额
    private String secondPrice;
    //商品折扣
    private BigDecimal goodsDiscount;
    //价格类型 0：原价 1：会员价 2:议价 3:单品变价 4:会员折扣价(原价或变价基础之上)
    private String priceType;
    //会员折扣
    private BigDecimal memberDiscountRatio=new BigDecimal("0.00").setScale(2,BigDecimal.ROUND_DOWN);
    //积分抵现均摊
    private BigDecimal integralDiscount=new BigDecimal("0.00").setScale(2,BigDecimal.ROUND_DOWN);
    //多少金额抵现一积分：金额积分
    private BigDecimal integralDiscountAmount=new BigDecimal("0.00").setScale(2, RoundingMode.DOWN);

}
