package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketConsumptionRules;
import com.mudule.mumzonemarketcal.component.po.market.MarketConsumptionRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketConsumptionRulesMapper {
    int countByExample(MarketConsumptionRulesExample example);

    int deleteByExample(MarketConsumptionRulesExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketConsumptionRules record);

    int insertSelective(MarketConsumptionRules record);

    List<MarketConsumptionRules> selectByExample(MarketConsumptionRulesExample example);

    MarketConsumptionRules selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketConsumptionRules record, @Param("example") MarketConsumptionRulesExample example);

    int updateByExample(@Param("record") MarketConsumptionRules record, @Param("example") MarketConsumptionRulesExample example);

    int updateByPrimaryKeySelective(MarketConsumptionRules record);

    int updateByPrimaryKey(MarketConsumptionRules record);
}