package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BasePlatformUser;
import com.mudule.mumzonemarketcal.component.po.base.BasePlatformUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePlatformUserMapper {
    int countByExample(BasePlatformUserExample example);

    int deleteByExample(BasePlatformUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(BasePlatformUser record);

    int insertSelective(BasePlatformUser record);

    List<BasePlatformUser> selectByExample(BasePlatformUserExample example);

    BasePlatformUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BasePlatformUser record, @Param("example") BasePlatformUserExample example);

    int updateByExample(@Param("record") BasePlatformUser record, @Param("example") BasePlatformUserExample example);

    int updateByPrimaryKeySelective(BasePlatformUser record);

    int updateByPrimaryKey(BasePlatformUser record);
}