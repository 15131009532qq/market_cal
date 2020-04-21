package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopCount;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopCountMapper {
    int countByExample(BaseShopCountExample example);

    int deleteByExample(BaseShopCountExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopCount record);

    int insertSelective(BaseShopCount record);

    List<BaseShopCount> selectByExample(BaseShopCountExample example);

    BaseShopCount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopCount record, @Param("example") BaseShopCountExample example);

    int updateByExample(@Param("record") BaseShopCount record, @Param("example") BaseShopCountExample example);

    int updateByPrimaryKeySelective(BaseShopCount record);

    int updateByPrimaryKey(BaseShopCount record);
}