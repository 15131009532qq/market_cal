package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderCollect;
import com.mudule.mumzonemarketcal.component.po.order.OrderCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCollectMapper {
    int countByExample(OrderCollectExample example);

    int deleteByExample(OrderCollectExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderCollect record);

    int insertSelective(OrderCollect record);

    List<OrderCollect> selectByExample(OrderCollectExample example);

    OrderCollect selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderCollect record, @Param("example") OrderCollectExample example);

    int updateByExample(@Param("record") OrderCollect record, @Param("example") OrderCollectExample example);

    int updateByPrimaryKeySelective(OrderCollect record);

    int updateByPrimaryKey(OrderCollect record);
}