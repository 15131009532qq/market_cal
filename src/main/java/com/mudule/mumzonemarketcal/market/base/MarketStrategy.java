package com.mudule.mumzonemarketcal.market.base;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;

import java.text.ParseException;

/**
 * @Description 营销策略接口
 * @ClassName MarketStrategy
 * @Autor DZT
 * @Date 2019/3/13 14:39
 * @Version 1.0
 */
public interface MarketStrategy {
    /**
     * 计算订单的营销
     * @param orderVo
     * @return
     */
    ResponseDiscountVo calMarket(OrderVo orderVo);

}
