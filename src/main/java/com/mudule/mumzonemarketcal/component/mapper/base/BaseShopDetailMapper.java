package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopDetail;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopDetailMapper {
    int countByExample(BaseShopDetailExample example);

    int deleteByExample(BaseShopDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopDetail record);

    int insertSelective(BaseShopDetail record);

    List<BaseShopDetail> selectByExample(BaseShopDetailExample example);

    BaseShopDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopDetail record, @Param("example") BaseShopDetailExample example);

    int updateByExample(@Param("record") BaseShopDetail record, @Param("example") BaseShopDetailExample example);

    int updateByPrimaryKeySelective(BaseShopDetail record);

    int updateByPrimaryKey(BaseShopDetail record);
}