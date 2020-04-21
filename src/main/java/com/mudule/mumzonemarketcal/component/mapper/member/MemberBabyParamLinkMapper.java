package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberBabyParamLink;
import com.mudule.mumzonemarketcal.component.po.member.MemberBabyParamLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBabyParamLinkMapper {
    int countByExample(MemberBabyParamLinkExample example);

    int deleteByExample(MemberBabyParamLinkExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberBabyParamLink record);

    int insertSelective(MemberBabyParamLink record);

    List<MemberBabyParamLink> selectByExample(MemberBabyParamLinkExample example);

    MemberBabyParamLink selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberBabyParamLink record, @Param("example") MemberBabyParamLinkExample example);

    int updateByExample(@Param("record") MemberBabyParamLink record, @Param("example") MemberBabyParamLinkExample example);

    int updateByPrimaryKeySelective(MemberBabyParamLink record);

    int updateByPrimaryKey(MemberBabyParamLink record);
}