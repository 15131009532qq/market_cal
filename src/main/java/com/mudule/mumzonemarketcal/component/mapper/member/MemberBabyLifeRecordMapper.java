package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberBabyLifeRecord;
import com.mudule.mumzonemarketcal.component.po.member.MemberBabyLifeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBabyLifeRecordMapper {
    int countByExample(MemberBabyLifeRecordExample example);

    int deleteByExample(MemberBabyLifeRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberBabyLifeRecord record);

    int insertSelective(MemberBabyLifeRecord record);

    List<MemberBabyLifeRecord> selectByExample(MemberBabyLifeRecordExample example);

    MemberBabyLifeRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberBabyLifeRecord record, @Param("example") MemberBabyLifeRecordExample example);

    int updateByExample(@Param("record") MemberBabyLifeRecord record, @Param("example") MemberBabyLifeRecordExample example);

    int updateByPrimaryKeySelective(MemberBabyLifeRecord record);

    int updateByPrimaryKey(MemberBabyLifeRecord record);
}