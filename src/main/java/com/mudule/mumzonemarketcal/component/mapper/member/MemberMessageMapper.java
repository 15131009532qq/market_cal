package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberMessage;
import com.mudule.mumzonemarketcal.component.po.member.MemberMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMessageMapper {
    int countByExample(MemberMessageExample example);

    int deleteByExample(MemberMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberMessage record);

    int insertSelective(MemberMessage record);

    List<MemberMessage> selectByExample(MemberMessageExample example);

    MemberMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberMessage record, @Param("example") MemberMessageExample example);

    int updateByExample(@Param("record") MemberMessage record, @Param("example") MemberMessageExample example);

    int updateByPrimaryKeySelective(MemberMessage record);

    int updateByPrimaryKey(MemberMessage record);
}