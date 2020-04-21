package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsParameterDetail;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsParameterDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsParameterDetailMapper {
    int countByExample(GoodsParameterDetailExample example);

    int deleteByExample(GoodsParameterDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsParameterDetail record);

    int insertSelective(GoodsParameterDetail record);

    List<GoodsParameterDetail> selectByExample(GoodsParameterDetailExample example);

    GoodsParameterDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsParameterDetail record, @Param("example") GoodsParameterDetailExample example);

    int updateByExample(@Param("record") GoodsParameterDetail record, @Param("example") GoodsParameterDetailExample example);

    int updateByPrimaryKeySelective(GoodsParameterDetail record);

    int updateByPrimaryKey(GoodsParameterDetail record);
}