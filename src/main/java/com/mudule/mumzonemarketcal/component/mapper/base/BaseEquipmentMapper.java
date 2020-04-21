package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseEquipment;
import com.mudule.mumzonemarketcal.component.po.base.BaseEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseEquipmentMapper {
    int countByExample(BaseEquipmentExample example);

    int deleteByExample(BaseEquipmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseEquipment record);

    int insertSelective(BaseEquipment record);

    List<BaseEquipment> selectByExample(BaseEquipmentExample example);

    BaseEquipment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseEquipment record, @Param("example") BaseEquipmentExample example);

    int updateByExample(@Param("record") BaseEquipment record, @Param("example") BaseEquipmentExample example);

    int updateByPrimaryKeySelective(BaseEquipment record);

    int updateByPrimaryKey(BaseEquipment record);
}