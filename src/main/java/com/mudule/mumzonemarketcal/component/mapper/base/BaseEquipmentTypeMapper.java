package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseEquipmentType;
import com.mudule.mumzonemarketcal.component.po.base.BaseEquipmentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseEquipmentTypeMapper {
    int countByExample(BaseEquipmentTypeExample example);

    int deleteByExample(BaseEquipmentTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseEquipmentType record);

    int insertSelective(BaseEquipmentType record);

    List<BaseEquipmentType> selectByExample(BaseEquipmentTypeExample example);

    BaseEquipmentType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseEquipmentType record, @Param("example") BaseEquipmentTypeExample example);

    int updateByExample(@Param("record") BaseEquipmentType record, @Param("example") BaseEquipmentTypeExample example);

    int updateByPrimaryKeySelective(BaseEquipmentType record);

    int updateByPrimaryKey(BaseEquipmentType record);
}