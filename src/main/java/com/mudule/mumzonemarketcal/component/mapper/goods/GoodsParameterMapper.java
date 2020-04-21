package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsParameter;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsParameterMapper {
    int countByExample(GoodsParameterExample example);

    int deleteByExample(GoodsParameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsParameter record);

    int insertSelective(GoodsParameter record);

    List<GoodsParameter> selectByExample(GoodsParameterExample example);

    GoodsParameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsParameter record, @Param("example") GoodsParameterExample example);

    int updateByExample(@Param("record") GoodsParameter record, @Param("example") GoodsParameterExample example);

    int updateByPrimaryKeySelective(GoodsParameter record);

    int updateByPrimaryKey(GoodsParameter record);
}