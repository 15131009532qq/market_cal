package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantProduct;
import com.mudule.mumzonemarketcal.component.po.base.BaseMerchantProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantProductMapper {
    int countByExample(BaseMerchantProductExample example);

    int deleteByExample(BaseMerchantProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseMerchantProduct record);

    int insertSelective(BaseMerchantProduct record);

    List<BaseMerchantProduct> selectByExample(BaseMerchantProductExample example);

    BaseMerchantProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseMerchantProduct record, @Param("example") BaseMerchantProductExample example);

    int updateByExample(@Param("record") BaseMerchantProduct record, @Param("example") BaseMerchantProductExample example);

    int updateByPrimaryKeySelective(BaseMerchantProduct record);

    int updateByPrimaryKey(BaseMerchantProduct record);
}