package com.mudule.mumzonemarketcal.market.factory;

import com.mudule.mumzonemarketcal.enums.MarketStrategyEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategyContext;
import lombok.extern.slf4j.Slf4j;

/**
 * 获取不同执行策略的上下文
 * @author DZT
 * @since 2019/3/13 16:23
 * @version 1.0
 */
@Slf4j
public class MarketCalImpl implements MarketCal {

    @Override
    public MarketStrategyContext getMarketStrategyContext(String code) {
        log.info("获取不同执行策略的上下文");
        //获取策略执行上下文
        MarketStrategyEnum marketStrategyEnum=MarketStrategyEnum.getMarketStrategyEnum(code);
        log.info("执行策略编码[{}]-->[{}]",code,marketStrategyEnum.getMsg());
        return new MarketStrategyContext(marketStrategyEnum.getMarketStrategy());
    }
}
