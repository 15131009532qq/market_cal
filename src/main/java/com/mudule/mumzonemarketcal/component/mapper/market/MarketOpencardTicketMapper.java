package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketOpencardTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketOpencardTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketOpencardTicketMapper {
    int countByExample(MarketOpencardTicketExample example);

    int deleteByExample(MarketOpencardTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketOpencardTicket record);

    int insertSelective(MarketOpencardTicket record);

    List<MarketOpencardTicket> selectByExample(MarketOpencardTicketExample example);

    MarketOpencardTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketOpencardTicket record, @Param("example") MarketOpencardTicketExample example);

    int updateByExample(@Param("record") MarketOpencardTicket record, @Param("example") MarketOpencardTicketExample example);

    int updateByPrimaryKeySelective(MarketOpencardTicket record);

    int updateByPrimaryKey(MarketOpencardTicket record);
}