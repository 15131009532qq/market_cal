package com.mudule.mumzonemarketcal.market.base;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;

/**
 * @Description 营销策略上下文 --->暂时不用
 * @ClassName MarketStrategyContext
 * @Autor DZT
 * @Date 2019/3/13 14:38
 * @Version 1.0
 */
public class MarketStrategyContext {
    /**
     * 营销策略上下文中持有一个策略的引用
     */
    private MarketStrategy marketStrategy;

    /**
     * 有参数构造函数
     * @param marketStrategy 策略参数对象
     */
    public MarketStrategyContext(MarketStrategy marketStrategy){
        this.marketStrategy=marketStrategy;
    }

    /**
     * 营销策略的执行策略方法
     * @param orderVo
     * @return
     */
    public ResponseDiscountVo calMarketContext(OrderVo orderVo){
      return marketStrategy.calMarket(orderVo);
    }

}
