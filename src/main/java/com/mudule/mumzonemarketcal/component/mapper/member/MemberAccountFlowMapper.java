package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberAccountFlow;
import com.mudule.mumzonemarketcal.component.po.member.MemberAccountFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberAccountFlowMapper {
    int countByExample(MemberAccountFlowExample example);

    int deleteByExample(MemberAccountFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberAccountFlow record);

    int insertSelective(MemberAccountFlow record);

    List<MemberAccountFlow> selectByExample(MemberAccountFlowExample example);

    MemberAccountFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberAccountFlow record, @Param("example") MemberAccountFlowExample example);

    int updateByExample(@Param("record") MemberAccountFlow record, @Param("example") MemberAccountFlowExample example);

    int updateByPrimaryKeySelective(MemberAccountFlow record);

    int updateByPrimaryKey(MemberAccountFlow record);
}