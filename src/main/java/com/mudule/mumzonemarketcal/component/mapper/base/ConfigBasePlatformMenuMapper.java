package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformMenu;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBasePlatformMenuMapper {
    int countByExample(ConfigBasePlatformMenuExample example);

    int deleteByExample(ConfigBasePlatformMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBasePlatformMenu record);

    int insertSelective(ConfigBasePlatformMenu record);

    List<ConfigBasePlatformMenu> selectByExample(ConfigBasePlatformMenuExample example);

    ConfigBasePlatformMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBasePlatformMenu record, @Param("example") ConfigBasePlatformMenuExample example);

    int updateByExample(@Param("record") ConfigBasePlatformMenu record, @Param("example") ConfigBasePlatformMenuExample example);

    int updateByPrimaryKeySelective(ConfigBasePlatformMenu record);

    int updateByPrimaryKey(ConfigBasePlatformMenu record);
}