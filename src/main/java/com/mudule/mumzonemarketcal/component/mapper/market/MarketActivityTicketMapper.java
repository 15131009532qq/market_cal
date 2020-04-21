package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketActivityTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketActivityTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketActivityTicketMapper {
    int countByExample(MarketActivityTicketExample example);

    int deleteByExample(MarketActivityTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketActivityTicket record);

    int insertSelective(MarketActivityTicket record);

    List<MarketActivityTicket> selectByExample(MarketActivityTicketExample example);

    MarketActivityTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketActivityTicket record, @Param("example") MarketActivityTicketExample example);

    int updateByExample(@Param("record") MarketActivityTicket record, @Param("example") MarketActivityTicketExample example);

    int updateByPrimaryKeySelective(MarketActivityTicket record);

    int updateByPrimaryKey(MarketActivityTicket record);
}