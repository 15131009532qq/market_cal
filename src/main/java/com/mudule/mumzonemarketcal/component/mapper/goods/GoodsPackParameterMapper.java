package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsPackParameter;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsPackParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPackParameterMapper {
    int countByExample(GoodsPackParameterExample example);

    int deleteByExample(GoodsPackParameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsPackParameter record);

    int insertSelective(GoodsPackParameter record);

    List<GoodsPackParameter> selectByExample(GoodsPackParameterExample example);

    GoodsPackParameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsPackParameter record, @Param("example") GoodsPackParameterExample example);

    int updateByExample(@Param("record") GoodsPackParameter record, @Param("example") GoodsPackParameterExample example);

    int updateByPrimaryKeySelective(GoodsPackParameter record);

    int updateByPrimaryKey(GoodsPackParameter record);
}