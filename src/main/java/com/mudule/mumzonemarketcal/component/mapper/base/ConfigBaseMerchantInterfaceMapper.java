package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantInterface;
import com.mudule.mumzonemarketcal.component.po.base.ConfigBaseMerchantInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigBaseMerchantInterfaceMapper {
    int countByExample(ConfigBaseMerchantInterfaceExample example);

    int deleteByExample(ConfigBaseMerchantInterfaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigBaseMerchantInterface record);

    int insertSelective(ConfigBaseMerchantInterface record);

    List<ConfigBaseMerchantInterface> selectByExample(ConfigBaseMerchantInterfaceExample example);

    ConfigBaseMerchantInterface selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigBaseMerchantInterface record, @Param("example") ConfigBaseMerchantInterfaceExample example);

    int updateByExample(@Param("record") ConfigBaseMerchantInterface record, @Param("example") ConfigBaseMerchantInterfaceExample example);

    int updateByPrimaryKeySelective(ConfigBaseMerchantInterface record);

    int updateByPrimaryKey(ConfigBaseMerchantInterface record);
}