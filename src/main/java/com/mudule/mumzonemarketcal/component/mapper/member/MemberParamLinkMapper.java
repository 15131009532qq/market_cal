package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberParamLink;
import com.mudule.mumzonemarketcal.component.po.member.MemberParamLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberParamLinkMapper {
    int countByExample(MemberParamLinkExample example);

    int deleteByExample(MemberParamLinkExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberParamLink record);

    int insertSelective(MemberParamLink record);

    List<MemberParamLink> selectByExample(MemberParamLinkExample example);

    MemberParamLink selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberParamLink record, @Param("example") MemberParamLinkExample example);

    int updateByExample(@Param("record") MemberParamLink record, @Param("example") MemberParamLinkExample example);

    int updateByPrimaryKeySelective(MemberParamLink record);

    int updateByPrimaryKey(MemberParamLink record);
}