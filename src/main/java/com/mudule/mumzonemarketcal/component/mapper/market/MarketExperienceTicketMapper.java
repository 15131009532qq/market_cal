package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketExperienceTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketExperienceTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketExperienceTicketMapper {
    int countByExample(MarketExperienceTicketExample example);

    int deleteByExample(MarketExperienceTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketExperienceTicket record);

    int insertSelective(MarketExperienceTicket record);

    List<MarketExperienceTicket> selectByExample(MarketExperienceTicketExample example);

    MarketExperienceTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketExperienceTicket record, @Param("example") MarketExperienceTicketExample example);

    int updateByExample(@Param("record") MarketExperienceTicket record, @Param("example") MarketExperienceTicketExample example);

    int updateByPrimaryKeySelective(MarketExperienceTicket record);

    int updateByPrimaryKey(MarketExperienceTicket record);
}