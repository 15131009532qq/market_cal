package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseUserLoginLog;
import com.mudule.mumzonemarketcal.component.po.base.BaseUserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUserLoginLogMapper {
    int countByExample(BaseUserLoginLogExample example);

    int deleteByExample(BaseUserLoginLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseUserLoginLog record);

    int insertSelective(BaseUserLoginLog record);

    List<BaseUserLoginLog> selectByExample(BaseUserLoginLogExample example);

    BaseUserLoginLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseUserLoginLog record, @Param("example") BaseUserLoginLogExample example);

    int updateByExample(@Param("record") BaseUserLoginLog record, @Param("example") BaseUserLoginLogExample example);

    int updateByPrimaryKeySelective(BaseUserLoginLog record);

    int updateByPrimaryKey(BaseUserLoginLog record);
}