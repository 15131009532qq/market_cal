package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseAssetsIn;
import com.mudule.mumzonemarketcal.component.po.base.BaseAssetsInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseAssetsInMapper {
    int countByExample(BaseAssetsInExample example);

    int deleteByExample(BaseAssetsInExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseAssetsIn record);

    int insertSelective(BaseAssetsIn record);

    List<BaseAssetsIn> selectByExample(BaseAssetsInExample example);

    BaseAssetsIn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseAssetsIn record, @Param("example") BaseAssetsInExample example);

    int updateByExample(@Param("record") BaseAssetsIn record, @Param("example") BaseAssetsInExample example);

    int updateByPrimaryKeySelective(BaseAssetsIn record);

    int updateByPrimaryKey(BaseAssetsIn record);
}