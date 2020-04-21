package com.mudule.mumzonemarketcal.market.factory;

import com.mudule.mumzonemarketcal.market.base.MarketStrategyContext;

/**
 * @Description 不同策略不同执行结果
 * @ClassName MarketCal
 * @Autor DZT
 * @Date 2019/3/13 15:13
 * @Version 1.0
 */
public interface MarketCal {
    /**
     * 不同策略---->不同策略的执行上下文
     * @return
     */
    MarketStrategyContext getMarketStrategyContext(String code);
}
