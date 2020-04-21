package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketStoredTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketStoredTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketStoredTicketMapper {
    int countByExample(MarketStoredTicketExample example);

    int deleteByExample(MarketStoredTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketStoredTicket record);

    int insertSelective(MarketStoredTicket record);

    List<MarketStoredTicket> selectByExample(MarketStoredTicketExample example);

    MarketStoredTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketStoredTicket record, @Param("example") MarketStoredTicketExample example);

    int updateByExample(@Param("record") MarketStoredTicket record, @Param("example") MarketStoredTicketExample example);

    int updateByPrimaryKeySelective(MarketStoredTicket record);

    int updateByPrimaryKey(MarketStoredTicket record);
}