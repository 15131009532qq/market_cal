package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopConfigImage;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopConfigImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopConfigImageMapper {
    int countByExample(BaseShopConfigImageExample example);

    int deleteByExample(BaseShopConfigImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopConfigImage record);

    int insertSelective(BaseShopConfigImage record);

    List<BaseShopConfigImage> selectByExample(BaseShopConfigImageExample example);

    BaseShopConfigImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopConfigImage record, @Param("example") BaseShopConfigImageExample example);

    int updateByExample(@Param("record") BaseShopConfigImage record, @Param("example") BaseShopConfigImageExample example);

    int updateByPrimaryKeySelective(BaseShopConfigImage record);

    int updateByPrimaryKey(BaseShopConfigImage record);
}