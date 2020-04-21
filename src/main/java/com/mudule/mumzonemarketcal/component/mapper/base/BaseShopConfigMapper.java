package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopConfig;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopConfigMapper {
    int countByExample(BaseShopConfigExample example);

    int deleteByExample(BaseShopConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopConfig record);

    int insertSelective(BaseShopConfig record);

    List<BaseShopConfig> selectByExample(BaseShopConfigExample example);

    BaseShopConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopConfig record, @Param("example") BaseShopConfigExample example);

    int updateByExample(@Param("record") BaseShopConfig record, @Param("example") BaseShopConfigExample example);

    int updateByPrimaryKeySelective(BaseShopConfig record);

    int updateByPrimaryKey(BaseShopConfig record);
}