package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformInterface;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBasePlatformInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBasePlatformInterfaceMapper {
    int countByExample(ConfigBasePlatformInterfaceExample example);

    int deleteByExample(ConfigBasePlatformInterfaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBasePlatformInterface record);

    int insertSelective(ConfigBasePlatformInterface record);

    List<ConfigBasePlatformInterface> selectByExample(ConfigBasePlatformInterfaceExample example);

    ConfigBasePlatformInterface selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBasePlatformInterface record, @Param("example") ConfigBasePlatformInterfaceExample example);

    int updateByExample(@Param("record") ConfigBasePlatformInterface record, @Param("example") ConfigBasePlatformInterfaceExample example);

    int updateByPrimaryKeySelective(ConfigBasePlatformInterface record);

    int updateByPrimaryKey(ConfigBasePlatformInterface record);
}