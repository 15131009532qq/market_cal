package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberFeedback;
import com.mudule.mumzonemarketcal.component.po.member.MemberFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberFeedbackMapper {
    int countByExample(MemberFeedbackExample example);

    int deleteByExample(MemberFeedbackExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberFeedback record);

    int insertSelective(MemberFeedback record);

    List<MemberFeedback> selectByExample(MemberFeedbackExample example);

    MemberFeedback selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberFeedback record, @Param("example") MemberFeedbackExample example);

    int updateByExample(@Param("record") MemberFeedback record, @Param("example") MemberFeedbackExample example);

    int updateByPrimaryKeySelective(MemberFeedback record);

    int updateByPrimaryKey(MemberFeedback record);
}