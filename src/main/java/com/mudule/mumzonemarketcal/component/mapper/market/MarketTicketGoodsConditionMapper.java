package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoodsCondition;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoodsConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketTicketGoodsConditionMapper {
    int countByExample(MarketTicketGoodsConditionExample example);

    int deleteByExample(MarketTicketGoodsConditionExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketTicketGoodsCondition record);

    int insertSelective(MarketTicketGoodsCondition record);

    List<MarketTicketGoodsCondition> selectByExample(MarketTicketGoodsConditionExample example);

    MarketTicketGoodsCondition selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketTicketGoodsCondition record, @Param("example") MarketTicketGoodsConditionExample example);

    int updateByExample(@Param("record") MarketTicketGoodsCondition record, @Param("example") MarketTicketGoodsConditionExample example);

    int updateByPrimaryKeySelective(MarketTicketGoodsCondition record);

    int updateByPrimaryKey(MarketTicketGoodsCondition record);
}