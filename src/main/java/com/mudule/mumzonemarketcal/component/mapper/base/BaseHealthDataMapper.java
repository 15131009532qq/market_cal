package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseHealthData;
import com.mudule.mumzonemarketcal.component.po.base.BaseHealthDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseHealthDataMapper {
    int countByExample(BaseHealthDataExample example);

    int deleteByExample(BaseHealthDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseHealthData record);

    int insertSelective(BaseHealthData record);

    List<BaseHealthData> selectByExample(BaseHealthDataExample example);

    BaseHealthData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseHealthData record, @Param("example") BaseHealthDataExample example);

    int updateByExample(@Param("record") BaseHealthData record, @Param("example") BaseHealthDataExample example);

    int updateByPrimaryKeySelective(BaseHealthData record);

    int updateByPrimaryKey(BaseHealthData record);
}