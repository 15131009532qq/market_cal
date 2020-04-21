package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberShare;
import com.mudule.mumzonemarketcal.component.po.member.MemberShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberShareMapper {
    int countByExample(MemberShareExample example);

    int deleteByExample(MemberShareExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberShare record);

    int insertSelective(MemberShare record);

    List<MemberShare> selectByExample(MemberShareExample example);

    MemberShare selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberShare record, @Param("example") MemberShareExample example);

    int updateByExample(@Param("record") MemberShare record, @Param("example") MemberShareExample example);

    int updateByPrimaryKeySelective(MemberShare record);

    int updateByPrimaryKey(MemberShare record);
}