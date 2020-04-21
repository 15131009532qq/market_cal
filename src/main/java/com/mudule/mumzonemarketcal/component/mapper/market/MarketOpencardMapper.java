package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketOpencard;
import com.mudule.mumzonemarketcal.component.po.market.MarketOpencardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketOpencardMapper {
    int countByExample(MarketOpencardExample example);

    int deleteByExample(MarketOpencardExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketOpencard record);

    int insertSelective(MarketOpencard record);

    List<MarketOpencard> selectByExample(MarketOpencardExample example);

    MarketOpencard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketOpencard record, @Param("example") MarketOpencardExample example);

    int updateByExample(@Param("record") MarketOpencard record, @Param("example") MarketOpencardExample example);

    int updateByPrimaryKeySelective(MarketOpencard record);

    int updateByPrimaryKey(MarketOpencard record);
}