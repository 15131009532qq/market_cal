package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberTimesCard;
import com.mudule.mumzonemarketcal.component.po.member.MemberTimesCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface MemberTimesCardMapper {
    int countByExample(MemberTimesCardExample example);

    int deleteByExample(MemberTimesCardExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberTimesCard record);

    int insertSelective(MemberTimesCard record);

    List<MemberTimesCard> selectByExample(MemberTimesCardExample example);

    MemberTimesCard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberTimesCard record, @Param("example") MemberTimesCardExample example);

    int updateByExample(@Param("record") MemberTimesCard record, @Param("example") MemberTimesCardExample example);

    int updateByPrimaryKeySelective(MemberTimesCard record);

    int updateByPrimaryKey(MemberTimesCard record);
}