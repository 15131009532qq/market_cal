package com.mudule.mumzonemarketcal.market.factory;

import com.mudule.mumzonemarketcal.enums.MarketStrategyEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategyContext;

/**
 * @Description 策略工厂
 * @ClassName MarketStrategyFactory
 * @Autor DZT
 * @Date 2019/3/13 15:12
 * @Version 1.0
 */
public interface MarketStrategyFactory {
    /**
     * 获取营销策略执行上下文
     * @param marketStrategyEnum
     * @return
     */
    MarketStrategyContext getMarketCal(MarketStrategyEnum marketStrategyEnum);
}
