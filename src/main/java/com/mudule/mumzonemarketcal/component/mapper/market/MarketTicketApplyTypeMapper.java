package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketTicketApplyType;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketApplyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketTicketApplyTypeMapper {
    int countByExample(MarketTicketApplyTypeExample example);

    int deleteByExample(MarketTicketApplyTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketTicketApplyType record);

    int insertSelective(MarketTicketApplyType record);

    List<MarketTicketApplyType> selectByExample(MarketTicketApplyTypeExample example);

    MarketTicketApplyType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketTicketApplyType record, @Param("example") MarketTicketApplyTypeExample example);

    int updateByExample(@Param("record") MarketTicketApplyType record, @Param("example") MarketTicketApplyTypeExample example);

    int updateByPrimaryKeySelective(MarketTicketApplyType record);

    int updateByPrimaryKey(MarketTicketApplyType record);
}