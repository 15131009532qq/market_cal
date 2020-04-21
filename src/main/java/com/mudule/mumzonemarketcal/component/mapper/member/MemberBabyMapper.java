package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberBaby;
import com.mudule.mumzonemarketcal.component.po.member.MemberBabyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBabyMapper {
    int countByExample(MemberBabyExample example);

    int deleteByExample(MemberBabyExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberBaby record);

    int insertSelective(MemberBaby record);

    List<MemberBaby> selectByExample(MemberBabyExample example);

    MemberBaby selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberBaby record, @Param("example") MemberBabyExample example);

    int updateByExample(@Param("record") MemberBaby record, @Param("example") MemberBabyExample example);

    int updateByPrimaryKeySelective(MemberBaby record);

    int updateByPrimaryKey(MemberBaby record);
}