package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsPosPriceTemplate;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsPosPriceTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPosPriceTemplateMapper {
    int countByExample(GoodsPosPriceTemplateExample example);

    int deleteByExample(GoodsPosPriceTemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsPosPriceTemplate record);

    int insertSelective(GoodsPosPriceTemplate record);

    List<GoodsPosPriceTemplate> selectByExample(GoodsPosPriceTemplateExample example);

    GoodsPosPriceTemplate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsPosPriceTemplate record, @Param("example") GoodsPosPriceTemplateExample example);

    int updateByExample(@Param("record") GoodsPosPriceTemplate record, @Param("example") GoodsPosPriceTemplateExample example);

    int updateByPrimaryKeySelective(GoodsPosPriceTemplate record);

    int updateByPrimaryKey(GoodsPosPriceTemplate record);
}