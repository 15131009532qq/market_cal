package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantUserRole;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantUserRoleMapper {
    int countByExample(BaseMerchantUserRoleExample example);

    int deleteByExample(BaseMerchantUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseMerchantUserRole record);

    int insertSelective(BaseMerchantUserRole record);

    List<BaseMerchantUserRole> selectByExample(BaseMerchantUserRoleExample example);

    BaseMerchantUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseMerchantUserRole record, @Param("example") BaseMerchantUserRoleExample example);

    int updateByExample(@Param("record") BaseMerchantUserRole record, @Param("example") BaseMerchantUserRoleExample example);

    int updateByPrimaryKeySelective(BaseMerchantUserRole record);

    int updateByPrimaryKey(BaseMerchantUserRole record);
}