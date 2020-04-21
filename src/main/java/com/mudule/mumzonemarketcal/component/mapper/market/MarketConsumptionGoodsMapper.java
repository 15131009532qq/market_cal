package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketConsumptionGoods;
import com.mudule.mumzonemarketcal.component.po.market.MarketConsumptionGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketConsumptionGoodsMapper {
    int countByExample(MarketConsumptionGoodsExample example);

    int deleteByExample(MarketConsumptionGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketConsumptionGoods record);

    int insertSelective(MarketConsumptionGoods record);

    List<MarketConsumptionGoods> selectByExample(MarketConsumptionGoodsExample example);

    MarketConsumptionGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketConsumptionGoods record, @Param("example") MarketConsumptionGoodsExample example);

    int updateByExample(@Param("record") MarketConsumptionGoods record, @Param("example") MarketConsumptionGoodsExample example);

    int updateByPrimaryKeySelective(MarketConsumptionGoods record);

    int updateByPrimaryKey(MarketConsumptionGoods record);
}