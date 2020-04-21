package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketPresent;
import com.mudule.mumzonemarketcal.component.po.market.MarketPresentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketPresentMapper {
    int countByExample(MarketPresentExample example);

    int deleteByExample(MarketPresentExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketPresent record);

    int insertSelective(MarketPresent record);

    List<MarketPresent> selectByExample(MarketPresentExample example);

    MarketPresent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketPresent record, @Param("example") MarketPresentExample example);

    int updateByExample(@Param("record") MarketPresent record, @Param("example") MarketPresentExample example);

    int updateByPrimaryKeySelective(MarketPresent record);

    int updateByPrimaryKey(MarketPresent record);
}