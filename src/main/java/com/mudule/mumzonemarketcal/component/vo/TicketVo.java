package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description 优惠券实体
 *              优惠券种类:
 *                  满折劵、体验劵
 * @ClassName TicketVo
 * @Autor DZT
 * @Date 2019/3/14 14:48
 * @Version 1.0
 */
@Data
public class TicketVo {

    /**
     * 会员券表的id
     */

    private String id;
    /**
     * 用户使用优惠券的id  (用户使用优惠券的会员次卡表的ID) 会员活动ID
     */
    private String ticketId;
    /**
     * 优惠券金额
     */
    private BigDecimal ticketAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    /**
     * 优惠券名称 或者活动名称
     */
    private String ticketName;
    /**
     * 优惠券类别 包含组合支付类型【组合支付当做优惠的一种方式】 活动类型
     * 0-体验券，1-满减券，2-买折券，3-买赠券, 4-次卡，5-折扣劵 6-现金 7-余额支付 8-满减活动 9-满折活动 10 积分抵现
     */
    private String ticketType;

    /**
     * 次卡数量
     */
    private int cardNum;
    /**
     * 消费优先级 权重
     */
    private int index;
    /**
     * 次卡ID
     */
    private String goodsId;
    /**
     * 积分
     * 抵现积分
     * ...
     */
    private int integral;

}
