package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationScheduleWork;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationScheduleWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationScheduleWorkMapper {
    int countByExample(BaseOrganizationScheduleWorkExample example);

    int deleteByExample(BaseOrganizationScheduleWorkExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationScheduleWork record);

    int insertSelective(BaseOrganizationScheduleWork record);

    List<BaseOrganizationScheduleWork> selectByExample(BaseOrganizationScheduleWorkExample example);

    BaseOrganizationScheduleWork selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationScheduleWork record, @Param("example") BaseOrganizationScheduleWorkExample example);

    int updateByExample(@Param("record") BaseOrganizationScheduleWork record, @Param("example") BaseOrganizationScheduleWorkExample example);

    int updateByPrimaryKeySelective(BaseOrganizationScheduleWork record);

    int updateByPrimaryKey(BaseOrganizationScheduleWork record);
}