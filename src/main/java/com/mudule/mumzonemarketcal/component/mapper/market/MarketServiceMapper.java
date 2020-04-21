package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketService;
import com.mudule.mumzonemarketcal.component.po.market.MarketServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketServiceMapper {
    int countByExample(MarketServiceExample example);

    int deleteByExample(MarketServiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketService record);

    int insertSelective(MarketService record);

    List<MarketService> selectByExampleWithBLOBs(MarketServiceExample example);

    List<MarketService> selectByExample(MarketServiceExample example);

    MarketService selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketService record, @Param("example") MarketServiceExample example);

    int updateByExampleWithBLOBs(@Param("record") MarketService record, @Param("example") MarketServiceExample example);

    int updateByExample(@Param("record") MarketService record, @Param("example") MarketServiceExample example);

    int updateByPrimaryKeySelective(MarketService record);

    int updateByPrimaryKeyWithBLOBs(MarketService record);

    int updateByPrimaryKey(MarketService record);
}