package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberMarketCard;
import com.mudule.mumzonemarketcal.component.po.member.MemberMarketCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMarketCardMapper {
    int countByExample(MemberMarketCardExample example);

    int deleteByExample(MemberMarketCardExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberMarketCard record);

    int insertSelective(MemberMarketCard record);

    List<MemberMarketCard> selectByExample(MemberMarketCardExample example);

    MemberMarketCard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberMarketCard record, @Param("example") MemberMarketCardExample example);

    int updateByExample(@Param("record") MemberMarketCard record, @Param("example") MemberMarketCardExample example);

    int updateByPrimaryKeySelective(MemberMarketCard record);

    int updateByPrimaryKey(MemberMarketCard record);
}