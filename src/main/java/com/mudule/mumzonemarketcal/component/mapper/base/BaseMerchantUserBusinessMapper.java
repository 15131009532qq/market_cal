package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantUserBusiness;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantUserBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantUserBusinessMapper {
    int countByExample(BaseMerchantUserBusinessExample example);

    int deleteByExample(BaseMerchantUserBusinessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseMerchantUserBusiness record);

    int insertSelective(BaseMerchantUserBusiness record);

    List<BaseMerchantUserBusiness> selectByExample(BaseMerchantUserBusinessExample example);

    BaseMerchantUserBusiness selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseMerchantUserBusiness record, @Param("example") BaseMerchantUserBusinessExample example);

    int updateByExample(@Param("record") BaseMerchantUserBusiness record, @Param("example") BaseMerchantUserBusinessExample example);

    int updateByPrimaryKeySelective(BaseMerchantUserBusiness record);

    int updateByPrimaryKey(BaseMerchantUserBusiness record);
}