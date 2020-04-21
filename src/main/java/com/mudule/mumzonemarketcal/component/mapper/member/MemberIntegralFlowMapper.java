package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberIntegralFlow;
import com.mudule.mumzonemarketcal.component.po.member.MemberIntegralFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberIntegralFlowMapper {
    int countByExample(MemberIntegralFlowExample example);

    int deleteByExample(MemberIntegralFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberIntegralFlow record);

    int insertSelective(MemberIntegralFlow record);

    List<MemberIntegralFlow> selectByExample(MemberIntegralFlowExample example);

    MemberIntegralFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberIntegralFlow record, @Param("example") MemberIntegralFlowExample example);

    int updateByExample(@Param("record") MemberIntegralFlow record, @Param("example") MemberIntegralFlowExample example);

    int updateByPrimaryKeySelective(MemberIntegralFlow record);

    int updateByPrimaryKey(MemberIntegralFlow record);
}