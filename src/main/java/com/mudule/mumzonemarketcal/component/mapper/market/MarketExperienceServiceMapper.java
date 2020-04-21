package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketExperienceService;
import com.mudule.mumzonemarketcal.component.po.market.MarketExperienceServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketExperienceServiceMapper {
    int countByExample(MarketExperienceServiceExample example);

    int deleteByExample(MarketExperienceServiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketExperienceService record);

    int insertSelective(MarketExperienceService record);

    List<MarketExperienceService> selectByExample(MarketExperienceServiceExample example);

    MarketExperienceService selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketExperienceService record, @Param("example") MarketExperienceServiceExample example);

    int updateByExample(@Param("record") MarketExperienceService record, @Param("example") MarketExperienceServiceExample example);

    int updateByPrimaryKeySelective(MarketExperienceService record);

    int updateByPrimaryKey(MarketExperienceService record);
}