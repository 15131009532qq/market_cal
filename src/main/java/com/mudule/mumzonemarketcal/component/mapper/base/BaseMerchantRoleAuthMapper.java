package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantRoleAuth;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantRoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantRoleAuthMapper {
    int countByExample(BaseMerchantRoleAuthExample example);

    int deleteByExample(BaseMerchantRoleAuthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseMerchantRoleAuth record);

    int insertSelective(BaseMerchantRoleAuth record);

    List<BaseMerchantRoleAuth> selectByExample(BaseMerchantRoleAuthExample example);

    BaseMerchantRoleAuth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseMerchantRoleAuth record, @Param("example") BaseMerchantRoleAuthExample example);

    int updateByExample(@Param("record") BaseMerchantRoleAuth record, @Param("example") BaseMerchantRoleAuthExample example);

    int updateByPrimaryKeySelective(BaseMerchantRoleAuth record);

    int updateByPrimaryKey(BaseMerchantRoleAuth record);
}