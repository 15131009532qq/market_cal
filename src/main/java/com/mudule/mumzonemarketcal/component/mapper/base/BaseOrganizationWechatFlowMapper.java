package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationWechatFlow;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationWechatFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationWechatFlowMapper {
    int countByExample(BaseOrganizationWechatFlowExample example);

    int deleteByExample(BaseOrganizationWechatFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationWechatFlow record);

    int insertSelective(BaseOrganizationWechatFlow record);

    List<BaseOrganizationWechatFlow> selectByExample(BaseOrganizationWechatFlowExample example);

    BaseOrganizationWechatFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationWechatFlow record, @Param("example") BaseOrganizationWechatFlowExample example);

    int updateByExample(@Param("record") BaseOrganizationWechatFlow record, @Param("example") BaseOrganizationWechatFlowExample example);

    int updateByPrimaryKeySelective(BaseOrganizationWechatFlow record);

    int updateByPrimaryKey(BaseOrganizationWechatFlow record);
}