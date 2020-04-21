package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsUnit;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsUnitMapper {
    int countByExample(GoodsUnitExample example);

    int deleteByExample(GoodsUnitExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsUnit record);

    int insertSelective(GoodsUnit record);

    List<GoodsUnit> selectByExample(GoodsUnitExample example);

    GoodsUnit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsUnit record, @Param("example") GoodsUnitExample example);

    int updateByExample(@Param("record") GoodsUnit record, @Param("example") GoodsUnitExample example);

    int updateByPrimaryKeySelective(GoodsUnit record);

    int updateByPrimaryKey(GoodsUnit record);
}