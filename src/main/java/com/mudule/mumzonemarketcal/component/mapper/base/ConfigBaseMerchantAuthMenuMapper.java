package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantAuthMenu;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantAuthMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseMerchantAuthMenuMapper {
    int countByExample(ConfigBaseMerchantAuthMenuExample example);

    int deleteByExample(ConfigBaseMerchantAuthMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBaseMerchantAuthMenu record);

    int insertSelective(ConfigBaseMerchantAuthMenu record);

    List<ConfigBaseMerchantAuthMenu> selectByExample(ConfigBaseMerchantAuthMenuExample example);

    ConfigBaseMerchantAuthMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBaseMerchantAuthMenu record, @Param("example") ConfigBaseMerchantAuthMenuExample example);

    int updateByExample(@Param("record") ConfigBaseMerchantAuthMenu record, @Param("example") ConfigBaseMerchantAuthMenuExample example);

    int updateByPrimaryKeySelective(ConfigBaseMerchantAuthMenu record);

    int updateByPrimaryKey(ConfigBaseMerchantAuthMenu record);
}