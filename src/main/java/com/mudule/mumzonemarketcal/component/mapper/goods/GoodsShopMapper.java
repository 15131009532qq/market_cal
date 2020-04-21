package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsShop;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface GoodsShopMapper {
    int countByExample(GoodsShopExample example);

    int deleteByExample(GoodsShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsShop record);

    int insertSelective(GoodsShop record);

    List<GoodsShop> selectByExample(GoodsShopExample example);

    GoodsShop selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsShop record, @Param("example") GoodsShopExample example);

    int updateByExample(@Param("record") GoodsShop record, @Param("example") GoodsShopExample example);

    int updateByPrimaryKeySelective(GoodsShop record);

    int updateByPrimaryKey(GoodsShop record);
    // 查询商品列表
    List<GoodsShop> selectByPrimaryKeys(List<String> list);
}