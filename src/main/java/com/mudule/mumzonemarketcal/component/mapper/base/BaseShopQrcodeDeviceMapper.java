package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseShopQrcodeDevice;
import com.mudule.mumzonemarketcal.component.po.base.BaseShopQrcodeDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShopQrcodeDeviceMapper {
    int countByExample(BaseShopQrcodeDeviceExample example);

    int deleteByExample(BaseShopQrcodeDeviceExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseShopQrcodeDevice record);

    int insertSelective(BaseShopQrcodeDevice record);

    List<BaseShopQrcodeDevice> selectByExample(BaseShopQrcodeDeviceExample example);

    BaseShopQrcodeDevice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseShopQrcodeDevice record, @Param("example") BaseShopQrcodeDeviceExample example);

    int updateByExample(@Param("record") BaseShopQrcodeDevice record, @Param("example") BaseShopQrcodeDeviceExample example);

    int updateByPrimaryKeySelective(BaseShopQrcodeDevice record);

    int updateByPrimaryKey(BaseShopQrcodeDevice record);
}