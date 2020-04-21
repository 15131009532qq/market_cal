package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderConsignFlow;
import com.mudule.mumzonemarketcal.component.po.order.OrderConsignFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderConsignFlowMapper {
    int countByExample(OrderConsignFlowExample example);

    int deleteByExample(OrderConsignFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderConsignFlow record);

    int insertSelective(OrderConsignFlow record);

    List<OrderConsignFlow> selectByExample(OrderConsignFlowExample example);

    OrderConsignFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderConsignFlow record, @Param("example") OrderConsignFlowExample example);

    int updateByExample(@Param("record") OrderConsignFlow record, @Param("example") OrderConsignFlowExample example);

    int updateByPrimaryKeySelective(OrderConsignFlow record);

    int updateByPrimaryKey(OrderConsignFlow record);
}