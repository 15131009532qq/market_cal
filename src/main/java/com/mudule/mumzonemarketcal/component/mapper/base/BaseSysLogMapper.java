package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseSysLog;
import com.mudule.mumzonemarketcal.component.po.base.BaseSysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSysLogMapper {
    int countByExample(BaseSysLogExample example);

    int deleteByExample(BaseSysLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseSysLog record);

    int insertSelective(BaseSysLog record);

    List<BaseSysLog> selectByExample(BaseSysLogExample example);

    BaseSysLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseSysLog record, @Param("example") BaseSysLogExample example);

    int updateByExample(@Param("record") BaseSysLog record, @Param("example") BaseSysLogExample example);

    int updateByPrimaryKeySelective(BaseSysLog record);

    int updateByPrimaryKey(BaseSysLog record);
}