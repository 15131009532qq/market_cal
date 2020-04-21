package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformAuth;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBasePlatformAuthMapper {
    int countByExample(ConfigBasePlatformAuthExample example);

    int deleteByExample(ConfigBasePlatformAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBasePlatformAuth record);

    int insertSelective(ConfigBasePlatformAuth record);

    List<ConfigBasePlatformAuth> selectByExample(ConfigBasePlatformAuthExample example);

    ConfigBasePlatformAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBasePlatformAuth record, @Param("example") ConfigBasePlatformAuthExample example);

    int updateByExample(@Param("record") ConfigBasePlatformAuth record, @Param("example") ConfigBasePlatformAuthExample example);

    int updateByPrimaryKeySelective(ConfigBasePlatformAuth record);

    int updateByPrimaryKey(ConfigBasePlatformAuth record);
}