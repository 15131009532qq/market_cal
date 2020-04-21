package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseEmployee;
import com.mudule.mumzonemarketcal.component.po.base.BaseEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseEmployeeMapper {
    int countByExample(BaseEmployeeExample example);

    int deleteByExample(BaseEmployeeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseEmployee record);

    int insertSelective(BaseEmployee record);

    List<BaseEmployee> selectByExample(BaseEmployeeExample example);

    BaseEmployee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseEmployee record, @Param("example") BaseEmployeeExample example);

    int updateByExample(@Param("record") BaseEmployee record, @Param("example") BaseEmployeeExample example);

    int updateByPrimaryKeySelective(BaseEmployee record);

    int updateByPrimaryKey(BaseEmployee record);
}