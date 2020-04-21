package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseBusinessConfig;
import com.mudule.mumzonemarketcal.component.po.base.BaseBusinessConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBusinessConfigMapper {
    int countByExample(BaseBusinessConfigExample example);

    int deleteByExample(BaseBusinessConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseBusinessConfig record);

    int insertSelective(BaseBusinessConfig record);

    List<BaseBusinessConfig> selectByExample(BaseBusinessConfigExample example);

    BaseBusinessConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseBusinessConfig record, @Param("example") BaseBusinessConfigExample example);

    int updateByExample(@Param("record") BaseBusinessConfig record, @Param("example") BaseBusinessConfigExample example);

    int updateByPrimaryKeySelective(BaseBusinessConfig record);

    int updateByPrimaryKey(BaseBusinessConfig record);
}