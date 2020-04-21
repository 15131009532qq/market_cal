package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopSchedule;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopScheduleMapper {
    int countByExample(BaseShopScheduleExample example);

    int deleteByExample(BaseShopScheduleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopSchedule record);

    int insertSelective(BaseShopSchedule record);

    List<BaseShopSchedule> selectByExample(BaseShopScheduleExample example);

    BaseShopSchedule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopSchedule record, @Param("example") BaseShopScheduleExample example);

    int updateByExample(@Param("record") BaseShopSchedule record, @Param("example") BaseShopScheduleExample example);

    int updateByPrimaryKeySelective(BaseShopSchedule record);

    int updateByPrimaryKey(BaseShopSchedule record);
}