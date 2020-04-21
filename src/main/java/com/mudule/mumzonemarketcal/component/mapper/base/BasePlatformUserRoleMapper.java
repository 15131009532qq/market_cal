package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BasePlatformUserRole;
import com.mudule.mumzonemarketcal.component.po.base.BasePlatformUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePlatformUserRoleMapper {
    int countByExample(BasePlatformUserRoleExample example);

    int deleteByExample(BasePlatformUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasePlatformUserRole record);

    int insertSelective(BasePlatformUserRole record);

    List<BasePlatformUserRole> selectByExample(BasePlatformUserRoleExample example);

    BasePlatformUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasePlatformUserRole record, @Param("example") BasePlatformUserRoleExample example);

    int updateByExample(@Param("record") BasePlatformUserRole record, @Param("example") BasePlatformUserRoleExample example);

    int updateByPrimaryKeySelective(BasePlatformUserRole record);

    int updateByPrimaryKey(BasePlatformUserRole record);
}