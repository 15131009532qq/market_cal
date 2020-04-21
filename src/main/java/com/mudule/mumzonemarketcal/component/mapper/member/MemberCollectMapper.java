package com.mudule.mumzonemarketcal.component.mapper.member;

import com.mudule.mumzonemarketcal.component.po.member.MemberCollect;
import com.mudule.mumzonemarketcal.component.po.member.MemberCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberCollectMapper {
    int countByExample(MemberCollectExample example);

    int deleteByExample(MemberCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberCollect record);

    int insertSelective(MemberCollect record);

    List<MemberCollect> selectByExample(MemberCollectExample example);

    MemberCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberCollect record, @Param("example") MemberCollectExample example);

    int updateByExample(@Param("record") MemberCollect record, @Param("example") MemberCollectExample example);

    int updateByPrimaryKeySelective(MemberCollect record);

    int updateByPrimaryKey(MemberCollect record);
}