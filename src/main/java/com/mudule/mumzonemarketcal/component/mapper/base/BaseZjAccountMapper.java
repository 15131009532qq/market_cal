package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseZjAccount;
import com.mudule.mumzonemarketcal.component.po.base.BaseZjAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseZjAccountMapper {
    int countByExample(BaseZjAccountExample example);

    int deleteByExample(BaseZjAccountExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseZjAccount record);

    int insertSelective(BaseZjAccount record);

    List<BaseZjAccount> selectByExample(BaseZjAccountExample example);

    BaseZjAccount selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseZjAccount record, @Param("example") BaseZjAccountExample example);

    int updateByExample(@Param("record") BaseZjAccount record, @Param("example") BaseZjAccountExample example);

    int updateByPrimaryKeySelective(BaseZjAccount record);

    int updateByPrimaryKey(BaseZjAccount record);
}