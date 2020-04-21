package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMessage;
import com.mudule.mumzonemarketcal.component.po.base.BaseMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMessageMapper {
    int countByExample(BaseMessageExample example);

    int deleteByExample(BaseMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseMessage record);

    int insertSelective(BaseMessage record);

    List<BaseMessage> selectByExampleWithBLOBs(BaseMessageExample example);

    List<BaseMessage> selectByExample(BaseMessageExample example);

    BaseMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseMessage record, @Param("example") BaseMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") BaseMessage record, @Param("example") BaseMessageExample example);

    int updateByExample(@Param("record") BaseMessage record, @Param("example") BaseMessageExample example);

    int updateByPrimaryKeySelective(BaseMessage record);

    int updateByPrimaryKeyWithBLOBs(BaseMessage record);

    int updateByPrimaryKey(BaseMessage record);
}