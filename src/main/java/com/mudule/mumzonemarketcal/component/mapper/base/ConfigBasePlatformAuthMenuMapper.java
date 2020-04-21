package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformAuthMenu;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformAuthMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBasePlatformAuthMenuMapper {
    int countByExample(ConfigBasePlatformAuthMenuExample example);

    int deleteByExample(ConfigBasePlatformAuthMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBasePlatformAuthMenu record);

    int insertSelective(ConfigBasePlatformAuthMenu record);

    List<ConfigBasePlatformAuthMenu> selectByExample(ConfigBasePlatformAuthMenuExample example);

    ConfigBasePlatformAuthMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBasePlatformAuthMenu record, @Param("example") ConfigBasePlatformAuthMenuExample example);

    int updateByExample(@Param("record") ConfigBasePlatformAuthMenu record, @Param("example") ConfigBasePlatformAuthMenuExample example);

    int updateByPrimaryKeySelective(ConfigBasePlatformAuthMenu record);

    int updateByPrimaryKey(ConfigBasePlatformAuthMenu record);
}