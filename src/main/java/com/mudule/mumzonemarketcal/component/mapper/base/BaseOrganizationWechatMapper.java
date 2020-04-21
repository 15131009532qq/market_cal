package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationWechat;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationWechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationWechatMapper {
    int countByExample(BaseOrganizationWechatExample example);

    int deleteByExample(BaseOrganizationWechatExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationWechat record);

    int insertSelective(BaseOrganizationWechat record);

    List<BaseOrganizationWechat> selectByExample(BaseOrganizationWechatExample example);

    BaseOrganizationWechat selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationWechat record, @Param("example") BaseOrganizationWechatExample example);

    int updateByExample(@Param("record") BaseOrganizationWechat record, @Param("example") BaseOrganizationWechatExample example);

    int updateByPrimaryKeySelective(BaseOrganizationWechat record);

    int updateByPrimaryKey(BaseOrganizationWechat record);
}