package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberParameter;
import com.mudule.mumzonemarketcal.component.po.member.MemberParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberParameterMapper {
    int countByExample(MemberParameterExample example);

    int deleteByExample(MemberParameterExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberParameter record);

    int insertSelective(MemberParameter record);

    List<MemberParameter> selectByExample(MemberParameterExample example);

    MemberParameter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberParameter record, @Param("example") MemberParameterExample example);

    int updateByExample(@Param("record") MemberParameter record, @Param("example") MemberParameterExample example);

    int updateByPrimaryKeySelective(MemberParameter record);

    int updateByPrimaryKey(MemberParameter record);
}