package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberSearchKeyword;
import com.mudule.mumzonemarketcal.component.po.member.MemberSearchKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberSearchKeywordMapper {
    int countByExample(MemberSearchKeywordExample example);

    int deleteByExample(MemberSearchKeywordExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberSearchKeyword record);

    int insertSelective(MemberSearchKeyword record);

    List<MemberSearchKeyword> selectByExample(MemberSearchKeywordExample example);

    MemberSearchKeyword selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberSearchKeyword record, @Param("example") MemberSearchKeywordExample example);

    int updateByExample(@Param("record") MemberSearchKeyword record, @Param("example") MemberSearchKeywordExample example);

    int updateByPrimaryKeySelective(MemberSearchKeyword record);

    int updateByPrimaryKey(MemberSearchKeyword record);
}