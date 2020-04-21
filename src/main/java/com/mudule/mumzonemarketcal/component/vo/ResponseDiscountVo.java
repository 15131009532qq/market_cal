package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description 响应折扣类实体
 * @ClassName ResponseDiscountVo
 * @Autor DZT
 * @Date 2019/3/14 15:41
 * @Version 1.0
 */
@Data
public class ResponseDiscountVo {
    /**
     * 总金额
     */
    private BigDecimal totalAmount=new BigDecimal("0.00");
    /**
     * 商品折扣
     */
    private BigDecimal goodsDiscount=new BigDecimal("0.00");
    /**
     *议价折扣
     */
    private BigDecimal bargainDiscount=new BigDecimal("0.00");
    /**
     * 会员折扣
     */
    private BigDecimal memberDiscount=new BigDecimal("0.00");
    /**
     * 折扣列表
     */
    private List<DiscountItem> discountItem;
    /**
     *待支付金额
     */
    private BigDecimal toPayAmount=new BigDecimal("0.00");
    /**
     * 总订单
     */
    private OrderVo orderVo;
    /**
     * 结果信息
     */
    private String msg;
    /**
     * 计算是否成功 FAIL SUCCESS
     */
    private String code = "SUCCESS";
    /**
     * 异常信息码
     *  默认是401 提示所有异常信息
     *  405 计次卡异常使用
     *  406 优惠券异常使用
     *  407 体验劵异常使用
     */
    private Integer errCode;

    /**
     * 赠品价格
     */
    private BigDecimal presentDiscount = BigDecimal.ZERO;

    /**
     * 标识规则是否继续执行 默认是true
     */
    private boolean ruleFlag=true;
}
