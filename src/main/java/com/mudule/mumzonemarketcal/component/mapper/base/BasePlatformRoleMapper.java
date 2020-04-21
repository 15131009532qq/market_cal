package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BasePlatformRole;
import com.mudule.mumzonemarketcal.component.po.base.BasePlatformRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePlatformRoleMapper {
    int countByExample(BasePlatformRoleExample example);

    int deleteByExample(BasePlatformRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BasePlatformRole record);

    int insertSelective(BasePlatformRole record);

    List<BasePlatformRole> selectByExample(BasePlatformRoleExample example);

    BasePlatformRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BasePlatformRole record, @Param("example") BasePlatformRoleExample example);

    int updateByExample(@Param("record") BasePlatformRole record, @Param("example") BasePlatformRoleExample example);

    int updateByPrimaryKeySelective(BasePlatformRole record);

    int updateByPrimaryKey(BasePlatformRole record);
}