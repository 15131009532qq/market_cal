package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberType;
import com.mudule.mumzonemarketcal.component.po.member.MemberTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTypeMapper {
    int countByExample(MemberTypeExample example);

    int deleteByExample(MemberTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberType record);

    int insertSelective(MemberType record);

    List<MemberType> selectByExample(MemberTypeExample example);

    MemberType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByPrimaryKeySelective(MemberType record);

    int updateByPrimaryKey(MemberType record);
}