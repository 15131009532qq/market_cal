package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description 活动实体类
 * @ClassName ActivityVo
 * @Autor DZT
 * @Date 2019/3/14 14:59
 * @Version 1.0
 */
@Data
public class ActivityVo {
    /**
     * 活动id
     */
    private String activityId;
    /**
     * 活动折扣
     */
    private BigDecimal activityAmount=new BigDecimal("0.00").setScale(8, RoundingMode.DOWN);
    /**
     * 活动名称
     */
    private String activityName;
    /**
     * 活动类型
     */
    private String activityType;
}
