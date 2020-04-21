package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseProduct;
import com.mudule.mumzonemarketcal.component.po.base.BaseProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseProductMapper {
    int countByExample(BaseProductExample example);

    int deleteByExample(BaseProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseProduct record);

    int insertSelective(BaseProduct record);

    List<BaseProduct> selectByExample(BaseProductExample example);

    BaseProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseProduct record, @Param("example") BaseProductExample example);

    int updateByExample(@Param("record") BaseProduct record, @Param("example") BaseProductExample example);

    int updateByPrimaryKeySelective(BaseProduct record);

    int updateByPrimaryKey(BaseProduct record);
}