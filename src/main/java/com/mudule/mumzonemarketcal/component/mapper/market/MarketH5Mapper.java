package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketH5;
import com.mudule.mumzonemarketcal.component.po.market.MarketH5Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketH5Mapper {
    int countByExample(MarketH5Example example);

    int deleteByExample(MarketH5Example example);

    int deleteByPrimaryKey(String id);

    int insert(MarketH5 record);

    int insertSelective(MarketH5 record);

    List<MarketH5> selectByExample(MarketH5Example example);

    MarketH5 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketH5 record, @Param("example") MarketH5Example example);

    int updateByExample(@Param("record") MarketH5 record, @Param("example") MarketH5Example example);

    int updateByPrimaryKeySelective(MarketH5 record);

    int updateByPrimaryKey(MarketH5 record);
}