package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseBossMenuAuth;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseBossMenuAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseBossMenuAuthMapper {
    int countByExample(ConfigBaseBossMenuAuthExample example);

    int deleteByExample(ConfigBaseBossMenuAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBaseBossMenuAuth record);

    int insertSelective(ConfigBaseBossMenuAuth record);

    List<ConfigBaseBossMenuAuth> selectByExample(ConfigBaseBossMenuAuthExample example);

    ConfigBaseBossMenuAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBaseBossMenuAuth record, @Param("example") ConfigBaseBossMenuAuthExample example);

    int updateByExample(@Param("record") ConfigBaseBossMenuAuth record, @Param("example") ConfigBaseBossMenuAuthExample example);

    int updateByPrimaryKeySelective(ConfigBaseBossMenuAuth record);

    int updateByPrimaryKey(ConfigBaseBossMenuAuth record);
}