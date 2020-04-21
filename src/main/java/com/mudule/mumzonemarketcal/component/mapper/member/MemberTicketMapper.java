package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberTicket;
import com.mudule.mumzonemarketcal.component.po.member.MemberTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTicketMapper {
    int countByExample(MemberTicketExample example);

    int deleteByExample(MemberTicketExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberTicket record);

    int insertSelective(MemberTicket record);

    List<MemberTicket> selectByExample(MemberTicketExample example);

    MemberTicket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberTicket record, @Param("example") MemberTicketExample example);

    int updateByExample(@Param("record") MemberTicket record, @Param("example") MemberTicketExample example);

    int updateByPrimaryKeySelective(MemberTicket record);

    int updateByPrimaryKey(MemberTicket record);
}