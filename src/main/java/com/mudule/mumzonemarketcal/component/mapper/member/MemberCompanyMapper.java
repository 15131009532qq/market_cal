package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberCompany;
import com.mudule.mumzonemarketcal.component.po.member.MemberCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCompanyMapper {
    int countByExample(MemberCompanyExample example);

    int deleteByExample(MemberCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberCompany record);

    int insertSelective(MemberCompany record);

    List<MemberCompany> selectByExample(MemberCompanyExample example);

    MemberCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberCompany record, @Param("example") MemberCompanyExample example);

    int updateByExample(@Param("record") MemberCompany record, @Param("example") MemberCompanyExample example);

    int updateByPrimaryKeySelective(MemberCompany record);

    int updateByPrimaryKey(MemberCompany record);
}