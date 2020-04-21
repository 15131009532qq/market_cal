package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsRelevanceLabel;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsRelevanceLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsRelevanceLabelMapper {
    int countByExample(GoodsRelevanceLabelExample example);

    int deleteByExample(GoodsRelevanceLabelExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsRelevanceLabel record);

    int insertSelective(GoodsRelevanceLabel record);

    List<GoodsRelevanceLabel> selectByExample(GoodsRelevanceLabelExample example);

    GoodsRelevanceLabel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsRelevanceLabel record, @Param("example") GoodsRelevanceLabelExample example);

    int updateByExample(@Param("record") GoodsRelevanceLabel record, @Param("example") GoodsRelevanceLabelExample example);

    int updateByPrimaryKeySelective(GoodsRelevanceLabel record);

    int updateByPrimaryKey(GoodsRelevanceLabel record);
}