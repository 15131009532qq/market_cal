package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationAlipayFlow;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationAlipayFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationAlipayFlowMapper {
    int countByExample(BaseOrganizationAlipayFlowExample example);

    int deleteByExample(BaseOrganizationAlipayFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationAlipayFlow record);

    int insertSelective(BaseOrganizationAlipayFlow record);

    List<BaseOrganizationAlipayFlow> selectByExample(BaseOrganizationAlipayFlowExample example);

    BaseOrganizationAlipayFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationAlipayFlow record, @Param("example") BaseOrganizationAlipayFlowExample example);

    int updateByExample(@Param("record") BaseOrganizationAlipayFlow record, @Param("example") BaseOrganizationAlipayFlowExample example);

    int updateByPrimaryKeySelective(BaseOrganizationAlipayFlow record);

    int updateByPrimaryKey(BaseOrganizationAlipayFlow record);
}