package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BasePlatformRoleAuth;
import com.mudule.mumzonemarketcal.component.po.base.BasePlatformRoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePlatformRoleAuthMapper {
    int countByExample(BasePlatformRoleAuthExample example);

    int deleteByExample(BasePlatformRoleAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasePlatformRoleAuth record);

    int insertSelective(BasePlatformRoleAuth record);

    List<BasePlatformRoleAuth> selectByExample(BasePlatformRoleAuthExample example);

    BasePlatformRoleAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasePlatformRoleAuth record, @Param("example") BasePlatformRoleAuthExample example);

    int updateByExample(@Param("record") BasePlatformRoleAuth record, @Param("example") BasePlatformRoleAuthExample example);

    int updateByPrimaryKeySelective(BasePlatformRoleAuth record);

    int updateByPrimaryKey(BasePlatformRoleAuth record);
}