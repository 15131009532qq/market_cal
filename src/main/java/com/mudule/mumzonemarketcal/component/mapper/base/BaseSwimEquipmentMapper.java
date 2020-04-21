package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseSwimEquipment;
import com.mudule.mumzonemarketcal.component.po.base.BaseSwimEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSwimEquipmentMapper {
    int countByExample(BaseSwimEquipmentExample example);

    int deleteByExample(BaseSwimEquipmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseSwimEquipment record);

    int insertSelective(BaseSwimEquipment record);

    List<BaseSwimEquipment> selectByExample(BaseSwimEquipmentExample example);

    BaseSwimEquipment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseSwimEquipment record, @Param("example") BaseSwimEquipmentExample example);

    int updateByExample(@Param("record") BaseSwimEquipment record, @Param("example") BaseSwimEquipmentExample example);

    int updateByPrimaryKeySelective(BaseSwimEquipment record);

    int updateByPrimaryKey(BaseSwimEquipment record);
}