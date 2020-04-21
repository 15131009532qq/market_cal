package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketExample;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface MarketTicketMapper {
    int countByExample(MarketTicketExample example);

    int deleteByExample(MarketTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketTicketWithBLOBs record);

    int insertSelective(MarketTicketWithBLOBs record);

    List<MarketTicketWithBLOBs> selectByExampleWithBLOBs(MarketTicketExample example);

    List<MarketTicket> selectByExample(MarketTicketExample example);

    MarketTicketWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketTicketWithBLOBs record, @Param("example") MarketTicketExample example);

    int updateByExampleWithBLOBs(@Param("record") MarketTicketWithBLOBs record, @Param("example") MarketTicketExample example);

    int updateByExample(@Param("record") MarketTicket record, @Param("example") MarketTicketExample example);

    int updateByPrimaryKeySelective(MarketTicketWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MarketTicketWithBLOBs record);

    int updateByPrimaryKey(MarketTicket record);

    MarketTicket selectById(String id);
}