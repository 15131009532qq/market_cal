package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationAlipay;
import com.mudule.mumzonemarketcal.component.po.base.BaseOrganizationAlipayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizationAlipayMapper {
    int countByExample(BaseOrganizationAlipayExample example);

    int deleteByExample(BaseOrganizationAlipayExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizationAlipay record);

    int insertSelective(BaseOrganizationAlipay record);

    List<BaseOrganizationAlipay> selectByExample(BaseOrganizationAlipayExample example);

    BaseOrganizationAlipay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizationAlipay record, @Param("example") BaseOrganizationAlipayExample example);

    int updateByExample(@Param("record") BaseOrganizationAlipay record, @Param("example") BaseOrganizationAlipayExample example);

    int updateByPrimaryKeySelective(BaseOrganizationAlipay record);

    int updateByPrimaryKey(BaseOrganizationAlipay record);
}