package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationImage;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationImageMapper {
    int countByExample(BaseOrganizationImageExample example);

    int deleteByExample(BaseOrganizationImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationImage record);

    int insertSelective(BaseOrganizationImage record);

    List<BaseOrganizationImage> selectByExample(BaseOrganizationImageExample example);

    BaseOrganizationImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationImage record, @Param("example") BaseOrganizationImageExample example);

    int updateByExample(@Param("record") BaseOrganizationImage record, @Param("example") BaseOrganizationImageExample example);

    int updateByPrimaryKeySelective(BaseOrganizationImage record);

    int updateByPrimaryKey(BaseOrganizationImage record);
}