package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberBabyInvitationRelation;
import com.mudule.mumzonemarketcal.component.po.member.MemberBabyInvitationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBabyInvitationRelationMapper {
    int countByExample(MemberBabyInvitationRelationExample example);

    int deleteByExample(MemberBabyInvitationRelationExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberBabyInvitationRelation record);

    int insertSelective(MemberBabyInvitationRelation record);

    List<MemberBabyInvitationRelation> selectByExample(MemberBabyInvitationRelationExample example);

    MemberBabyInvitationRelation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberBabyInvitationRelation record, @Param("example") MemberBabyInvitationRelationExample example);

    int updateByExample(@Param("record") MemberBabyInvitationRelation record, @Param("example") MemberBabyInvitationRelationExample example);

    int updateByPrimaryKeySelective(MemberBabyInvitationRelation record);

    int updateByPrimaryKey(MemberBabyInvitationRelation record);
}