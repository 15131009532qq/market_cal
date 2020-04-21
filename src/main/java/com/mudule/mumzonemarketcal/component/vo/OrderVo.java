package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

/**
 * @author wangjingjing
 * @date 2019-03-13
 */
@Data
public class OrderVo  extends BaseOrderVo{
    //商品订单会员手机号
    private String phone;
    //现金实收
    private BigDecimal cashCollection=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //现金找零
    private BigDecimal cashChange=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //商品数量
    private Integer goodsCount=0;
    //议价总金额
    private BigDecimal bargainingAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //抵现积分数量
    private Integer integralCount=0;
    //积分抵现金额
    private BigDecimal integralAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    //子订单集合
    private List<OrderSubVo> goods;
    //最后一次支付抵现积分数量
    private Integer integralNum;
    //活动
    private List<ActivityVo> activityVoList;
    //优惠劵集合
    private List<TicketVo> ticketVoList;
    //次卡集合
    private List<TimesCardVo> memberTimesCardArray;
    //当前计算的优惠信息
    private TicketVo ticketVo;
    //会员注册时间
    private Date memberRegisterDate;
    //会员生日
    private Date memberBirthdy;
    //商品折扣
    private BigDecimal goodsDiscount;
    //支付方式
    private String payType;
    //会员等级
    private String levelId;
    //是否使用会员价计算 0 会员折扣 1会员价 2 不优惠
    private String memberDiscountType;
    //积分抵现均摊
    private String integralDiscount;
    //多少钱兑换一积分:金额积分
    private String integralDiscountAmount;
    //会员价等级
    private String memberRank;
}
