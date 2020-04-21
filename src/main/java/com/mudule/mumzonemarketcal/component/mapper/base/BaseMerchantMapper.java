package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchant;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantMapper {
    int countByExample(BaseMerchantExample example);

    int deleteByExample(BaseMerchantExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseMerchant record);

    int insertSelective(BaseMerchant record);

    List<BaseMerchant> selectByExample(BaseMerchantExample example);

    BaseMerchant selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseMerchant record, @Param("example") BaseMerchantExample example);

    int updateByExample(@Param("record") BaseMerchant record, @Param("example") BaseMerchantExample example);

    int updateByPrimaryKeySelective(BaseMerchant record);

    int updateByPrimaryKey(BaseMerchant record);
}