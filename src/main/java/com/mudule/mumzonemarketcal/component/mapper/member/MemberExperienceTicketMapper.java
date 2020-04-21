package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberExperienceTicket;
import com.mudule.mumzonemarketcal.component.po.member.MemberExperienceTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberExperienceTicketMapper {
    int countByExample(MemberExperienceTicketExample example);

    int deleteByExample(MemberExperienceTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberExperienceTicket record);

    int insertSelective(MemberExperienceTicket record);

    List<MemberExperienceTicket> selectByExample(MemberExperienceTicketExample example);

    MemberExperienceTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberExperienceTicket record, @Param("example") MemberExperienceTicketExample example);

    int updateByExample(@Param("record") MemberExperienceTicket record, @Param("example") MemberExperienceTicketExample example);

    int updateByPrimaryKeySelective(MemberExperienceTicket record);

    int updateByPrimaryKey(MemberExperienceTicket record);
}