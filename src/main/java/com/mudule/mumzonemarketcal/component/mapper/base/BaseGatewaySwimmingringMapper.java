package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseGatewaySwimmingring;
import com.mudule.mumzonemarketcal.component.po.base.BaseGatewaySwimmingringExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseGatewaySwimmingringMapper {
    int countByExample(BaseGatewaySwimmingringExample example);

    int deleteByExample(BaseGatewaySwimmingringExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseGatewaySwimmingring record);

    int insertSelective(BaseGatewaySwimmingring record);

    List<BaseGatewaySwimmingring> selectByExample(BaseGatewaySwimmingringExample example);

    BaseGatewaySwimmingring selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseGatewaySwimmingring record, @Param("example") BaseGatewaySwimmingringExample example);

    int updateByExample(@Param("record") BaseGatewaySwimmingring record, @Param("example") BaseGatewaySwimmingringExample example);

    int updateByPrimaryKeySelective(BaseGatewaySwimmingring record);

    int updateByPrimaryKey(BaseGatewaySwimmingring record);
}