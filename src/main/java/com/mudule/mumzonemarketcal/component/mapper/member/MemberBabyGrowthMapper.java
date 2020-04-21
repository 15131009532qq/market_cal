package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberBabyGrowth;
import com.mudule.mumzonemarketcal.component.po.member.MemberBabyGrowthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBabyGrowthMapper {
    int countByExample(MemberBabyGrowthExample example);

    int deleteByExample(MemberBabyGrowthExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberBabyGrowth record);

    int insertSelective(MemberBabyGrowth record);

    List<MemberBabyGrowth> selectByExample(MemberBabyGrowthExample example);

    MemberBabyGrowth selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberBabyGrowth record, @Param("example") MemberBabyGrowthExample example);

    int updateByExample(@Param("record") MemberBabyGrowth record, @Param("example") MemberBabyGrowthExample example);

    int updateByPrimaryKeySelective(MemberBabyGrowth record);

    int updateByPrimaryKey(MemberBabyGrowth record);
}