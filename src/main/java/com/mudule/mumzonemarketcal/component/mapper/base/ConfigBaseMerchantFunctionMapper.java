package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantFunction;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseMerchantFunctionMapper {
    int countByExample(ConfigBaseMerchantFunctionExample example);

    int deleteByExample(ConfigBaseMerchantFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBaseMerchantFunction record);

    int insertSelective(ConfigBaseMerchantFunction record);

    List<ConfigBaseMerchantFunction> selectByExample(ConfigBaseMerchantFunctionExample example);

    ConfigBaseMerchantFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBaseMerchantFunction record, @Param("example") ConfigBaseMerchantFunctionExample example);

    int updateByExample(@Param("record") ConfigBaseMerchantFunction record, @Param("example") ConfigBaseMerchantFunctionExample example);

    int updateByPrimaryKeySelective(ConfigBaseMerchantFunction record);

    int updateByPrimaryKey(ConfigBaseMerchantFunction record);
}