package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsRelevanceParameter;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsRelevanceParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsRelevanceParameterMapper {
    int countByExample(GoodsRelevanceParameterExample example);

    int deleteByExample(GoodsRelevanceParameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsRelevanceParameter record);

    int insertSelective(GoodsRelevanceParameter record);

    List<GoodsRelevanceParameter> selectByExample(GoodsRelevanceParameterExample example);

    GoodsRelevanceParameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsRelevanceParameter record, @Param("example") GoodsRelevanceParameterExample example);

    int updateByExample(@Param("record") GoodsRelevanceParameter record, @Param("example") GoodsRelevanceParameterExample example);

    int updateByPrimaryKeySelective(GoodsRelevanceParameter record);

    int updateByPrimaryKey(GoodsRelevanceParameter record);
}