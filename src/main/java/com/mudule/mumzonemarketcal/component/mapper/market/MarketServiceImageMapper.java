package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketServiceImage;
import com.mudule.mumzonemarketcal.component.po.market.MarketServiceImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketServiceImageMapper {
    int countByExample(MarketServiceImageExample example);

    int deleteByExample(MarketServiceImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketServiceImage record);

    int insertSelective(MarketServiceImage record);

    List<MarketServiceImage> selectByExample(MarketServiceImageExample example);

    MarketServiceImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketServiceImage record, @Param("example") MarketServiceImageExample example);

    int updateByExample(@Param("record") MarketServiceImage record, @Param("example") MarketServiceImageExample example);

    int updateByPrimaryKeySelective(MarketServiceImage record);

    int updateByPrimaryKey(MarketServiceImage record);
}