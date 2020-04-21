package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigMerchantFunctionAuth;
import com.mudule.mumzonemarketcal.component.po.base.ConfigMerchantFunctionAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMerchantFunctionAuthMapper {
    int countByExample(ConfigMerchantFunctionAuthExample example);

    int deleteByExample(ConfigMerchantFunctionAuthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigMerchantFunctionAuth record);

    int insertSelective(ConfigMerchantFunctionAuth record);

    List<ConfigMerchantFunctionAuth> selectByExample(ConfigMerchantFunctionAuthExample example);

    ConfigMerchantFunctionAuth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigMerchantFunctionAuth record, @Param("example") ConfigMerchantFunctionAuthExample example);

    int updateByExample(@Param("record") ConfigMerchantFunctionAuth record, @Param("example") ConfigMerchantFunctionAuthExample example);

    int updateByPrimaryKeySelective(ConfigMerchantFunctionAuth record);

    int updateByPrimaryKey(ConfigMerchantFunctionAuth record);
}