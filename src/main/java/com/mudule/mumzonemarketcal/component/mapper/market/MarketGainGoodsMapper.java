package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketGainGoods;
import com.mudule.mumzonemarketcal.component.po.market.MarketGainGoodsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface MarketGainGoodsMapper {
    int countByExample(MarketGainGoodsExample example);

    int deleteByExample(MarketGainGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketGainGoods record);

    int insertSelective(MarketGainGoods record);

    List<MarketGainGoods> selectByExample(MarketGainGoodsExample example);

    MarketGainGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketGainGoods record, @Param("example") MarketGainGoodsExample example);

    int updateByExample(@Param("record") MarketGainGoods record, @Param("example") MarketGainGoodsExample example);

    int updateByPrimaryKeySelective(MarketGainGoods record);

    int updateByPrimaryKey(MarketGainGoods record);
    // 查询当前规则下该商品获取的规则
    MarketGainGoods getGainGoodsByGoodsId(Map<String, String> map);
    //排除不参与积分商品 根据 积分规则ID 查询 积分获取商品换购表
    List<MarketGainGoods> getGainRuleGoods(MarketGainGoods param);
}