package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopBanner;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopBannerMapper {
    int countByExample(BaseShopBannerExample example);

    int deleteByExample(BaseShopBannerExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopBanner record);

    int insertSelective(BaseShopBanner record);

    List<BaseShopBanner> selectByExample(BaseShopBannerExample example);

    BaseShopBanner selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopBanner record, @Param("example") BaseShopBannerExample example);

    int updateByExample(@Param("record") BaseShopBanner record, @Param("example") BaseShopBannerExample example);

    int updateByPrimaryKeySelective(BaseShopBanner record);

    int updateByPrimaryKey(BaseShopBanner record);
}