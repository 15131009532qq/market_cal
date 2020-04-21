package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantUser;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantUserMapper {
    int countByExample(BaseMerchantUserExample example);

    int deleteByExample(BaseMerchantUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseMerchantUser record);

    int insertSelective(BaseMerchantUser record);

    List<BaseMerchantUser> selectByExample(BaseMerchantUserExample example);

    BaseMerchantUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseMerchantUser record, @Param("example") BaseMerchantUserExample example);

    int updateByExample(@Param("record") BaseMerchantUser record, @Param("example") BaseMerchantUserExample example);

    int updateByPrimaryKeySelective(BaseMerchantUser record);

    int updateByPrimaryKey(BaseMerchantUser record);
}