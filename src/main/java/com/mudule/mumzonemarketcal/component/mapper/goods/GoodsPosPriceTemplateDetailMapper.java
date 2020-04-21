package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsPosPriceTemplateDetail;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsPosPriceTemplateDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPosPriceTemplateDetailMapper {
    int countByExample(GoodsPosPriceTemplateDetailExample example);

    int deleteByExample(GoodsPosPriceTemplateDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsPosPriceTemplateDetail record);

    int insertSelective(GoodsPosPriceTemplateDetail record);

    List<GoodsPosPriceTemplateDetail> selectByExample(GoodsPosPriceTemplateDetailExample example);

    GoodsPosPriceTemplateDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsPosPriceTemplateDetail record, @Param("example") GoodsPosPriceTemplateDetailExample example);

    int updateByExample(@Param("record") GoodsPosPriceTemplateDetail record, @Param("example") GoodsPosPriceTemplateDetailExample example);

    int updateByPrimaryKeySelective(GoodsPosPriceTemplateDetail record);

    int updateByPrimaryKey(GoodsPosPriceTemplateDetail record);
}