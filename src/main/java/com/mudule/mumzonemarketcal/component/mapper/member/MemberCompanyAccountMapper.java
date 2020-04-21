package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberCompanyAccount;
import com.mudule.mumzonemarketcal.component.po.member.MemberCompanyAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCompanyAccountMapper {
    int countByExample(MemberCompanyAccountExample example);

    int deleteByExample(MemberCompanyAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberCompanyAccount record);

    int insertSelective(MemberCompanyAccount record);

    List<MemberCompanyAccount> selectByExample(MemberCompanyAccountExample example);

    MemberCompanyAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberCompanyAccount record, @Param("example") MemberCompanyAccountExample example);

    int updateByExample(@Param("record") MemberCompanyAccount record, @Param("example") MemberCompanyAccountExample example);

    int updateByPrimaryKeySelective(MemberCompanyAccount record);

    int updateByPrimaryKey(MemberCompanyAccount record);
}