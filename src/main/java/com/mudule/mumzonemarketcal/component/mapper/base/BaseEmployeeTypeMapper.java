package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseEmployeeType;
import com.mudule.mumzonemarketcal.component.po.base.BaseEmployeeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseEmployeeTypeMapper {
    int countByExample(BaseEmployeeTypeExample example);

    int deleteByExample(BaseEmployeeTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseEmployeeType record);

    int insertSelective(BaseEmployeeType record);

    List<BaseEmployeeType> selectByExample(BaseEmployeeTypeExample example);

    BaseEmployeeType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseEmployeeType record, @Param("example") BaseEmployeeTypeExample example);

    int updateByExample(@Param("record") BaseEmployeeType record, @Param("example") BaseEmployeeTypeExample example);

    int updateByPrimaryKeySelective(BaseEmployeeType record);

    int updateByPrimaryKey(BaseEmployeeType record);
}