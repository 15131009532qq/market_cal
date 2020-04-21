package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsClassify;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsClassifyMapper {
    int countByExample(GoodsClassifyExample example);

    int deleteByExample(GoodsClassifyExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsClassify record);

    int insertSelective(GoodsClassify record);

    List<GoodsClassify> selectByExample(GoodsClassifyExample example);

    GoodsClassify selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsClassify record, @Param("example") GoodsClassifyExample example);

    int updateByExample(@Param("record") GoodsClassify record, @Param("example") GoodsClassifyExample example);

    int updateByPrimaryKeySelective(GoodsClassify record);

    int updateByPrimaryKey(GoodsClassify record);
}