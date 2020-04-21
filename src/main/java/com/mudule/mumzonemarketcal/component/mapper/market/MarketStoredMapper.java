package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketStored;
import com.mudule.mumzonemarketcal.component.po.market.MarketStoredExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketStoredMapper {
    int countByExample(MarketStoredExample example);

    int deleteByExample(MarketStoredExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketStored record);

    int insertSelective(MarketStored record);

    List<MarketStored> selectByExample(MarketStoredExample example);

    MarketStored selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketStored record, @Param("example") MarketStoredExample example);

    int updateByExample(@Param("record") MarketStored record, @Param("example") MarketStoredExample example);

    int updateByPrimaryKeySelective(MarketStored record);

    int updateByPrimaryKey(MarketStored record);
}