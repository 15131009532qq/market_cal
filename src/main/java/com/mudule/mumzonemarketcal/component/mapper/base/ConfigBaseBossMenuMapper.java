package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseBossMenu;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseBossMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseBossMenuMapper {
    int countByExample(ConfigBaseBossMenuExample example);

    int deleteByExample(ConfigBaseBossMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBaseBossMenu record);

    int insertSelective(ConfigBaseBossMenu record);

    List<ConfigBaseBossMenu> selectByExample(ConfigBaseBossMenuExample example);

    ConfigBaseBossMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBaseBossMenu record, @Param("example") ConfigBaseBossMenuExample example);

    int updateByExample(@Param("record") ConfigBaseBossMenu record, @Param("example") ConfigBaseBossMenuExample example);

    int updateByPrimaryKeySelective(ConfigBaseBossMenu record);

    int updateByPrimaryKey(ConfigBaseBossMenu record);
}