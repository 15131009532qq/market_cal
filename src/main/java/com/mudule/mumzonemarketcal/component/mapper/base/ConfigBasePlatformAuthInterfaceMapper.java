package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformAuthInterface;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformAuthInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBasePlatformAuthInterfaceMapper {
    int countByExample(ConfigBasePlatformAuthInterfaceExample example);

    int deleteByExample(ConfigBasePlatformAuthInterfaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBasePlatformAuthInterface record);

    int insertSelective(ConfigBasePlatformAuthInterface record);

    List<ConfigBasePlatformAuthInterface> selectByExample(ConfigBasePlatformAuthInterfaceExample example);

    ConfigBasePlatformAuthInterface selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBasePlatformAuthInterface record, @Param("example") ConfigBasePlatformAuthInterfaceExample example);

    int updateByExample(@Param("record") ConfigBasePlatformAuthInterface record, @Param("example") ConfigBasePlatformAuthInterfaceExample example);

    int updateByPrimaryKeySelective(ConfigBasePlatformAuthInterface record);

    int updateByPrimaryKey(ConfigBasePlatformAuthInterface record);
}