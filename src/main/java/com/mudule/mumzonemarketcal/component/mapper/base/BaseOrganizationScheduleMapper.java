package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationSchedule;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationScheduleMapper {
    int countByExample(BaseOrganizationScheduleExample example);

    int deleteByExample(BaseOrganizationScheduleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationSchedule record);

    int insertSelective(BaseOrganizationSchedule record);

    List<BaseOrganizationSchedule> selectByExample(BaseOrganizationScheduleExample example);

    BaseOrganizationSchedule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationSchedule record, @Param("example") BaseOrganizationScheduleExample example);

    int updateByExample(@Param("record") BaseOrganizationSchedule record, @Param("example") BaseOrganizationScheduleExample example);

    int updateByPrimaryKeySelective(BaseOrganizationSchedule record);

    int updateByPrimaryKey(BaseOrganizationSchedule record);
}