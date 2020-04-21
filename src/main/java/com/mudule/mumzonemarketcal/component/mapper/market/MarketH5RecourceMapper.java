package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketH5Recource;
import com.mudule.mumzonemarketcal.component.po.market.MarketH5RecourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketH5RecourceMapper {
    int countByExample(MarketH5RecourceExample example);

    int deleteByExample(MarketH5RecourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketH5Recource record);

    int insertSelective(MarketH5Recource record);

    List<MarketH5Recource> selectByExample(MarketH5RecourceExample example);

    MarketH5Recource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketH5Recource record, @Param("example") MarketH5RecourceExample example);

    int updateByExample(@Param("record") MarketH5Recource record, @Param("example") MarketH5RecourceExample example);

    int updateByPrimaryKeySelective(MarketH5Recource record);

    int updateByPrimaryKey(MarketH5Recource record);
}