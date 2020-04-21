package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketServiceShop;
import com.mudule.mumzonemarketcal.component.po.market.MarketServiceShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketServiceShopMapper {
    int countByExample(MarketServiceShopExample example);

    int deleteByExample(MarketServiceShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketServiceShop record);

    int insertSelective(MarketServiceShop record);

    List<MarketServiceShop> selectByExample(MarketServiceShopExample example);

    MarketServiceShop selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketServiceShop record, @Param("example") MarketServiceShopExample example);

    int updateByExample(@Param("record") MarketServiceShop record, @Param("example") MarketServiceShopExample example);

    int updateByPrimaryKeySelective(MarketServiceShop record);

    int updateByPrimaryKey(MarketServiceShop record);
}