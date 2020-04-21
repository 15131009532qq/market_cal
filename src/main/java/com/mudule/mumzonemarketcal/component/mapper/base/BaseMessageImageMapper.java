package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMessageImage;
import com.mudule.mumzonemarketcal.component.po.base.BaseMessageImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMessageImageMapper {
    int countByExample(BaseMessageImageExample example);

    int deleteByExample(BaseMessageImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseMessageImage record);

    int insertSelective(BaseMessageImage record);

    List<BaseMessageImage> selectByExample(BaseMessageImageExample example);

    BaseMessageImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseMessageImage record, @Param("example") BaseMessageImageExample example);

    int updateByExample(@Param("record") BaseMessageImage record, @Param("example") BaseMessageImageExample example);

    int updateByPrimaryKeySelective(BaseMessageImage record);

    int updateByPrimaryKey(BaseMessageImage record);
}