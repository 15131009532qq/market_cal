package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseProductFunction;
import com.mudule.mumzonemarketcal.component.po.base.BaseProductFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseProductFunctionMapper {
    int countByExample(BaseProductFunctionExample example);

    int deleteByExample(BaseProductFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseProductFunction record);

    int insertSelective(BaseProductFunction record);

    List<BaseProductFunction> selectByExample(BaseProductFunctionExample example);

    BaseProductFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseProductFunction record, @Param("example") BaseProductFunctionExample example);

    int updateByExample(@Param("record") BaseProductFunction record, @Param("example") BaseProductFunctionExample example);

    int updateByPrimaryKeySelective(BaseProductFunction record);

    int updateByPrimaryKey(BaseProductFunction record);
}