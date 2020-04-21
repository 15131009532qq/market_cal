package com.mudule.mumzonemarketcal.component.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description 折扣实体
 * @ClassName DiscountItem
 * @Autor DZT
 * @Date 2019/3/14 15:52
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class DiscountItem {
    /**
     * 优惠类型id 可包含 0-优惠活动 1-优惠券 2-体验券 3-抹零 4-次卡
     */
    private String id;
    /**
     * 优惠类型名称 可包含 0-优惠活动 1-优惠券 2-体验券 3-抹零 4-次卡
     */
    private String name;
    /**
     * 折扣金额 可包含 0-优惠活动 1-优惠券 2-体验券 3-抹零 4-次卡
     */
    private BigDecimal discount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    /**
     * 折扣类型 0-优惠活动 1-优惠券 2-体验券 3-抹零 4-次卡
     */
    private String discountType;
    /**
     * 数量
     */
    private int cardNum;
    /**
     * 数量
     */
    private int integral;
}
