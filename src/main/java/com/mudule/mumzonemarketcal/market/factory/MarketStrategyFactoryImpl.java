package com.mudule.mumzonemarketcal.market.factory;

import com.mudule.mumzonemarketcal.enums.MarketStrategyCodeEnum;
import com.mudule.mumzonemarketcal.enums.MarketStrategyEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategyContext;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 营销策略工厂实现类
 * @ClassName MarketStrategyFactoryImpl
 * @Autor DZT
 * @Date 2019/3/13 15:52
 * @Version 1.0
 */
@Slf4j
public class MarketStrategyFactoryImpl implements MarketStrategyFactory{


    private MarketCal marketCal=new MarketCalImpl();

    /**
     * 享元模式中的缓存池-->保存策略
     */
    private Map<String, MarketStrategyContext> payWayMap = new HashMap<>();

    /**
     * 无参数构造参数
     */
    public MarketStrategyFactoryImpl(){
        if (this.payWayMap.size()<=0){
            log.info("加载执行策略进入缓存池...");
            this.payWayMap.put(MarketStrategyCodeEnum.ONE.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.ONE.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.TWO.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.TWO.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.THREE.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.THREE.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.FOUR.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.FOUR.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.FIVE.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.FIVE.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.SIX.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.SIX.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.SEVEN.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.SEVEN.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.EIGHT.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.EIGHT.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.NINE.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.NINE.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.TEN.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.TEN.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.ELEVEN.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.ELEVEN.getCode()));
            this.payWayMap.put(MarketStrategyCodeEnum.TWELVE.getCode(),this.marketCal.getMarketStrategyContext(MarketStrategyCodeEnum.TWELVE.getCode()));
        }
    }

    /**
     * 获取缓存的执行策略
     * @param marketStrategyEnum
     * @return
     */
    @Override
    public MarketStrategyContext getMarketCal(MarketStrategyEnum marketStrategyEnum) {
        return payWayMap.get(marketStrategyEnum.getCode());
    }
}
