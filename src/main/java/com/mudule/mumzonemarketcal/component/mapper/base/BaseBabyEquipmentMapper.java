package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseBabyEquipment;
import com.mudule.mumzonemarketcal.component.po.base.BaseBabyEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseBabyEquipmentMapper {
    int countByExample(BaseBabyEquipmentExample example);

    int deleteByExample(BaseBabyEquipmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseBabyEquipment record);

    int insertSelective(BaseBabyEquipment record);

    List<BaseBabyEquipment> selectByExample(BaseBabyEquipmentExample example);

    BaseBabyEquipment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseBabyEquipment record, @Param("example") BaseBabyEquipmentExample example);

    int updateByExample(@Param("record") BaseBabyEquipment record, @Param("example") BaseBabyEquipmentExample example);

    int updateByPrimaryKeySelective(BaseBabyEquipment record);

    int updateByPrimaryKey(BaseBabyEquipment record);
}