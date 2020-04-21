package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantAuth;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseMerchantAuthMapper {
    int countByExample(ConfigBaseMerchantAuthExample example);

    int deleteByExample(ConfigBaseMerchantAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigBaseMerchantAuth record);

    int insertSelective(ConfigBaseMerchantAuth record);

    List<ConfigBaseMerchantAuth> selectByExample(ConfigBaseMerchantAuthExample example);

    ConfigBaseMerchantAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigBaseMerchantAuth record, @Param("example") ConfigBaseMerchantAuthExample example);

    int updateByExample(@Param("record") ConfigBaseMerchantAuth record, @Param("example") ConfigBaseMerchantAuthExample example);

    int updateByPrimaryKeySelective(ConfigBaseMerchantAuth record);

    int updateByPrimaryKey(ConfigBaseMerchantAuth record);
}