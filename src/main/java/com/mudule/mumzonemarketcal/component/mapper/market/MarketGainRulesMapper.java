package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketGainRules;
import com.mudule.mumzonemarketcal.component.po.market.MarketGainRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface MarketGainRulesMapper {
    int countByExample(MarketGainRulesExample example);

    int deleteByExample(MarketGainRulesExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketGainRules record);

    int insertSelective(MarketGainRules record);

    List<MarketGainRules> selectByExample(MarketGainRulesExample example);

    MarketGainRules selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketGainRules record, @Param("example") MarketGainRulesExample example);

    int updateByExample(@Param("record") MarketGainRules record, @Param("example") MarketGainRulesExample example);

    int updateByPrimaryKeySelective(MarketGainRules record);

    int updateByPrimaryKey(MarketGainRules record);

    MarketGainRules selectByCompanyId(String companyId);
}