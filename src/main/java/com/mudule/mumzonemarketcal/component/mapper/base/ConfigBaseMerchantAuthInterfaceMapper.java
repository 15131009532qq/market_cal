package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantAuthInterface;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantAuthInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseMerchantAuthInterfaceMapper {
    int countByExample(ConfigBaseMerchantAuthInterfaceExample example);

    int deleteByExample(ConfigBaseMerchantAuthInterfaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBaseMerchantAuthInterface record);

    int insertSelective(ConfigBaseMerchantAuthInterface record);

    List<ConfigBaseMerchantAuthInterface> selectByExample(ConfigBaseMerchantAuthInterfaceExample example);

    ConfigBaseMerchantAuthInterface selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBaseMerchantAuthInterface record, @Param("example") ConfigBaseMerchantAuthInterfaceExample example);

    int updateByExample(@Param("record") ConfigBaseMerchantAuthInterface record, @Param("example") ConfigBaseMerchantAuthInterfaceExample example);

    int updateByPrimaryKeySelective(ConfigBaseMerchantAuthInterface record);

    int updateByPrimaryKey(ConfigBaseMerchantAuthInterface record);
}