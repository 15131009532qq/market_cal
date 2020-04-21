package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsLabel;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsLabelMapper {
    int countByExample(GoodsLabelExample example);

    int deleteByExample(GoodsLabelExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsLabel record);

    int insertSelective(GoodsLabel record);

    List<GoodsLabel> selectByExample(GoodsLabelExample example);

    GoodsLabel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsLabel record, @Param("example") GoodsLabelExample example);

    int updateByExample(@Param("record") GoodsLabel record, @Param("example") GoodsLabelExample example);

    int updateByPrimaryKeySelective(GoodsLabel record);

    int updateByPrimaryKey(GoodsLabel record);
}