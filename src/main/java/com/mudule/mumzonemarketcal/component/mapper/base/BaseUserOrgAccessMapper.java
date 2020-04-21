package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseUserOrgAccess;
import com.mudule.mumzonemarketcal.component.po.base.BaseUserOrgAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUserOrgAccessMapper {
    int countByExample(BaseUserOrgAccessExample example);

    int deleteByExample(BaseUserOrgAccessExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseUserOrgAccess record);

    int insertSelective(BaseUserOrgAccess record);

    List<BaseUserOrgAccess> selectByExample(BaseUserOrgAccessExample example);

    BaseUserOrgAccess selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseUserOrgAccess record, @Param("example") BaseUserOrgAccessExample example);

    int updateByExample(@Param("record") BaseUserOrgAccess record, @Param("example") BaseUserOrgAccessExample example);

    int updateByPrimaryKeySelective(BaseUserOrgAccess record);

    int updateByPrimaryKey(BaseUserOrgAccess record);
}