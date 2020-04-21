package com.mudule.mumzonemarketcal.service;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;

/**
 * @Description 规则执行服务类
 * @ClassName RuleExecuteService
 * @Autor DZT
 * @Date 2019/7/10 15:07
 * @Version 1.0
 */
public interface RuleExecuteService {
    /**
     * 抹零均摊
     * @param orderVo
     * @return
     */
    ResponseDiscountVo mlPriceDiscount(OrderVo orderVo);

    /**
     * 议价折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo bargainDiscount(OrderVo orderVo);

    /**
     * 体验劵折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo experienceSecuritiesDiscount(OrderVo orderVo);

    /**
     * 积分均摊
     * @param orderVo
     * @return
     */
    ResponseDiscountVo integralShare(OrderVo orderVo);

    /**
     * 营销活动折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo marketActivityDiscount(OrderVo orderVo);

    /**
     * 会员折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo memberDiscount(OrderVo orderVo);

    /**
     * 计次卡支付
     * @param orderVo
     * @return
     */
    ResponseDiscountVo timesCardPayDiscount(OrderVo orderVo);

    /**
     * 满减劵折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo withReducedSecuritiesDisocunt(OrderVo orderVo);

    /**
     * 积分抵现折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo integralToPayDiscount(OrderVo orderVo);

    /**
     * 折扣劵优惠折扣
     * @param orderVo
     * @return
     */
    ResponseDiscountVo discountCouponDiscount(OrderVo orderVo);

    /**
     * 组合支付计算
     * @param orderVo
     * @return
     */
    ResponseDiscountVo combinationPay(OrderVo orderVo);

    /**
     * 商品折扣优惠
     * @param orderVo
     * @return
     */
    ResponseDiscountVo goodsDiscount(OrderVo orderVo);
}
