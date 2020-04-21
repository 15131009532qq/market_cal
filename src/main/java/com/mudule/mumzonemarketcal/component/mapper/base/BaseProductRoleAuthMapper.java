package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseProductRoleAuth;
import com.mudule.mumzonemarketcal.component.po.base.BaseProductRoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseProductRoleAuthMapper {
    int countByExample(BaseProductRoleAuthExample example);

    int deleteByExample(BaseProductRoleAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseProductRoleAuth record);

    int insertSelective(BaseProductRoleAuth record);

    List<BaseProductRoleAuth> selectByExample(BaseProductRoleAuthExample example);

    BaseProductRoleAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseProductRoleAuth record, @Param("example") BaseProductRoleAuthExample example);

    int updateByExample(@Param("record") BaseProductRoleAuth record, @Param("example") BaseProductRoleAuthExample example);

    int updateByPrimaryKeySelective(BaseProductRoleAuth record);

    int updateByPrimaryKey(BaseProductRoleAuth record);
}