package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseQuickPaymenLimit;
import com.mudule.mumzonemarketcal.component.po.base.BaseQuickPaymenLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseQuickPaymenLimitMapper {
    int countByExample(BaseQuickPaymenLimitExample example);

    int deleteByExample(BaseQuickPaymenLimitExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseQuickPaymenLimit record);

    int insertSelective(BaseQuickPaymenLimit record);

    List<BaseQuickPaymenLimit> selectByExample(BaseQuickPaymenLimitExample example);

    BaseQuickPaymenLimit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseQuickPaymenLimit record, @Param("example") BaseQuickPaymenLimitExample example);

    int updateByExample(@Param("record") BaseQuickPaymenLimit record, @Param("example") BaseQuickPaymenLimitExample example);

    int updateByPrimaryKeySelective(BaseQuickPaymenLimit record);

    int updateByPrimaryKey(BaseQuickPaymenLimit record);
}