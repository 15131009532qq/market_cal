package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseTechnicianImage;
import com.mudule.mumzonemarketcal.component.po.base.BaseTechnicianImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTechnicianImageMapper {
    int countByExample(BaseTechnicianImageExample example);

    int deleteByExample(BaseTechnicianImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseTechnicianImage record);

    int insertSelective(BaseTechnicianImage record);

    List<BaseTechnicianImage> selectByExample(BaseTechnicianImageExample example);

    BaseTechnicianImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseTechnicianImage record, @Param("example") BaseTechnicianImageExample example);

    int updateByExample(@Param("record") BaseTechnicianImage record, @Param("example") BaseTechnicianImageExample example);

    int updateByPrimaryKeySelective(BaseTechnicianImage record);

    int updateByPrimaryKey(BaseTechnicianImage record);
}