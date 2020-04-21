package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsCardService;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsCardServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface GoodsCardServiceMapper {
    int countByExample(GoodsCardServiceExample example);

    int deleteByExample(GoodsCardServiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsCardService record);

    int insertSelective(GoodsCardService record);

    List<GoodsCardService> selectByExample(GoodsCardServiceExample example);

    GoodsCardService selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsCardService record, @Param("example") GoodsCardServiceExample example);

    int updateByExample(@Param("record") GoodsCardService record, @Param("example") GoodsCardServiceExample example);

    int updateByPrimaryKeySelective(GoodsCardService record);

    int updateByPrimaryKey(GoodsCardService record);

    GoodsCardService selectByCardId(String carId);

}