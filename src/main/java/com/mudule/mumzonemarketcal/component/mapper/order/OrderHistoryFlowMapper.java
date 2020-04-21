package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderHistoryFlow;
import com.mudule.mumzonemarketcal.component.po.order.OrderHistoryFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHistoryFlowMapper {
    int countByExample(OrderHistoryFlowExample example);

    int deleteByExample(OrderHistoryFlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderHistoryFlow record);

    int insertSelective(OrderHistoryFlow record);

    List<OrderHistoryFlow> selectByExample(OrderHistoryFlowExample example);

    OrderHistoryFlow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderHistoryFlow record, @Param("example") OrderHistoryFlowExample example);

    int updateByExample(@Param("record") OrderHistoryFlow record, @Param("example") OrderHistoryFlowExample example);

    int updateByPrimaryKeySelective(OrderHistoryFlow record);

    int updateByPrimaryKey(OrderHistoryFlow record);
}