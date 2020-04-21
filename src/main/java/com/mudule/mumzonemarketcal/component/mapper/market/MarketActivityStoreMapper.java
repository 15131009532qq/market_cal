package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketActivityStore;
import com.mudule.mumzonemarketcal.component.po.market.MarketActivityStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketActivityStoreMapper {
    int countByExample(MarketActivityStoreExample example);

    int deleteByExample(MarketActivityStoreExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketActivityStore record);

    int insertSelective(MarketActivityStore record);

    List<MarketActivityStore> selectByExample(MarketActivityStoreExample example);

    MarketActivityStore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketActivityStore record, @Param("example") MarketActivityStoreExample example);

    int updateByExample(@Param("record") MarketActivityStore record, @Param("example") MarketActivityStoreExample example);

    int updateByPrimaryKeySelective(MarketActivityStore record);

    int updateByPrimaryKey(MarketActivityStore record);
}