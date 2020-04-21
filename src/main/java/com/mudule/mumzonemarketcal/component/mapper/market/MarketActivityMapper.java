package com.mudule.mumzonemarketcal.component.mapper.market;

import com.mudule.mumzonemarketcal.component.po.market.MarketActivity;
import com.mudule.mumzonemarketcal.component.po.market.MarketActivityExample;
import com.mudule.mumzonemarketcal.component.po.market.MarketActivityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketActivityMapper {
    int countByExample(MarketActivityExample example);

    int deleteByExample(MarketActivityExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketActivityWithBLOBs record);

    int insertSelective(MarketActivityWithBLOBs record);

    List<MarketActivityWithBLOBs> selectByExampleWithBLOBs(MarketActivityExample example);

    List<MarketActivity> selectByExample(MarketActivityExample example);

    MarketActivityWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketActivityWithBLOBs record, @Param("example") MarketActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") MarketActivityWithBLOBs record, @Param("example") MarketActivityExample example);

    int updateByExample(@Param("record") MarketActivity record, @Param("example") MarketActivityExample example);

    int updateByPrimaryKeySelective(MarketActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MarketActivityWithBLOBs record);

    int updateByPrimaryKey(MarketActivity record);
}