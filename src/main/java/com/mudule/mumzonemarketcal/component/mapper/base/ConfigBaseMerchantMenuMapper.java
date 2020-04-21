package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantMenu;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseMerchantMenuMapper {
    int countByExample(ConfigBaseMerchantMenuExample example);

    int deleteByExample(ConfigBaseMerchantMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBaseMerchantMenu record);

    int insertSelective(ConfigBaseMerchantMenu record);

    List<ConfigBaseMerchantMenu> selectByExample(ConfigBaseMerchantMenuExample example);

    ConfigBaseMerchantMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBaseMerchantMenu record, @Param("example") ConfigBaseMerchantMenuExample example);

    int updateByExample(@Param("record") ConfigBaseMerchantMenu record, @Param("example") ConfigBaseMerchantMenuExample example);

    int updateByPrimaryKeySelective(ConfigBaseMerchantMenu record);

    int updateByPrimaryKey(ConfigBaseMerchantMenu record);
}