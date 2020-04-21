package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketActivityGoods;
import com.mudule.mumzonemarketcal.component.po.market.MarketActivityGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketActivityGoodsMapper {
    int countByExample(MarketActivityGoodsExample example);

    int deleteByExample(MarketActivityGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketActivityGoods record);

    int insertSelective(MarketActivityGoods record);

    List<MarketActivityGoods> selectByExample(MarketActivityGoodsExample example);

    MarketActivityGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketActivityGoods record, @Param("example") MarketActivityGoodsExample example);

    int updateByExample(@Param("record") MarketActivityGoods record, @Param("example") MarketActivityGoodsExample example);

    int updateByPrimaryKeySelective(MarketActivityGoods record);

    int updateByPrimaryKey(MarketActivityGoods record);
}