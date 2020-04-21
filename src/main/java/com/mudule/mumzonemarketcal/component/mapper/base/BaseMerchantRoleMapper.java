package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantRole;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantRoleMapper {
    int countByExample(BaseMerchantRoleExample example);

    int deleteByExample(BaseMerchantRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseMerchantRole record);

    int insertSelective(BaseMerchantRole record);

    List<BaseMerchantRole> selectByExample(BaseMerchantRoleExample example);

    BaseMerchantRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseMerchantRole record, @Param("example") BaseMerchantRoleExample example);

    int updateByExample(@Param("record") BaseMerchantRole record, @Param("example") BaseMerchantRoleExample example);

    int updateByPrimaryKeySelective(BaseMerchantRole record);

    int updateByPrimaryKey(BaseMerchantRole record);
}