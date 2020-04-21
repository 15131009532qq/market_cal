package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseProductPrefabricateRole;
import com.mudule.mumzonemarketcal.component.po.base.BaseProductPrefabricateRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseProductPrefabricateRoleMapper {
    int countByExample(BaseProductPrefabricateRoleExample example);

    int deleteByExample(BaseProductPrefabricateRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseProductPrefabricateRole record);

    int insertSelective(BaseProductPrefabricateRole record);

    List<BaseProductPrefabricateRole> selectByExample(BaseProductPrefabricateRoleExample example);

    BaseProductPrefabricateRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseProductPrefabricateRole record, @Param("example") BaseProductPrefabricateRoleExample example);

    int updateByExample(@Param("record") BaseProductPrefabricateRole record, @Param("example") BaseProductPrefabricateRoleExample example);

    int updateByPrimaryKeySelective(BaseProductPrefabricateRole record);

    int updateByPrimaryKey(BaseProductPrefabricateRole record);
}