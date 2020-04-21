package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopLivevedio;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopLivevedioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopLivevedioMapper {
    int countByExample(BaseShopLivevedioExample example);

    int deleteByExample(BaseShopLivevedioExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopLivevedio record);

    int insertSelective(BaseShopLivevedio record);

    List<BaseShopLivevedio> selectByExample(BaseShopLivevedioExample example);

    BaseShopLivevedio selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopLivevedio record, @Param("example") BaseShopLivevedioExample example);

    int updateByExample(@Param("record") BaseShopLivevedio record, @Param("example") BaseShopLivevedioExample example);

    int updateByPrimaryKeySelective(BaseShopLivevedio record);

    int updateByPrimaryKey(BaseShopLivevedio record);
}