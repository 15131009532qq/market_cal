package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberMessageDetails;
import com.mudule.mumzonemarketcal.component.po.member.MemberMessageDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMessageDetailsMapper {
    int countByExample(MemberMessageDetailsExample example);

    int deleteByExample(MemberMessageDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberMessageDetails record);

    int insertSelective(MemberMessageDetails record);

    List<MemberMessageDetails> selectByExample(MemberMessageDetailsExample example);

    MemberMessageDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberMessageDetails record, @Param("example") MemberMessageDetailsExample example);

    int updateByExample(@Param("record") MemberMessageDetails record, @Param("example") MemberMessageDetailsExample example);

    int updateByPrimaryKeySelective(MemberMessageDetails record);

    int updateByPrimaryKey(MemberMessageDetails record);
}