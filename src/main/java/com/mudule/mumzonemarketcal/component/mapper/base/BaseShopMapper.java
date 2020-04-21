package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShop;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseShopMapper {
    int countByExample(BaseShopExample example);

    int deleteByExample(BaseShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShop record);

    int insertSelective(BaseShop record);

    List<BaseShop> selectByExample(BaseShopExample example);

    BaseShop selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShop record, @Param("example") BaseShopExample example);

    int updateByExample(@Param("record") BaseShop record, @Param("example") BaseShopExample example);

    int updateByPrimaryKeySelective(BaseShop record);

    int updateByPrimaryKey(BaseShop record);
}