package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoods;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface MarketTicketGoodsMapper {
    int countByExample(MarketTicketGoodsExample example);

    int deleteByExample(MarketTicketGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketTicketGoods record);

    int insertSelective(MarketTicketGoods record);

    List<MarketTicketGoods> selectByExample(MarketTicketGoodsExample example);

    MarketTicketGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketTicketGoods record, @Param("example") MarketTicketGoodsExample example);

    int updateByExample(@Param("record") MarketTicketGoods record, @Param("example") MarketTicketGoodsExample example);

    int updateByPrimaryKeySelective(MarketTicketGoods record);

    int updateByPrimaryKey(MarketTicketGoods record);

    List<MarketTicketGoods> selectByTicketId(String id);
}