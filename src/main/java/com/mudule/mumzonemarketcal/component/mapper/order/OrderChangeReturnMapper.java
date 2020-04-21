package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderChangeReturn;
import com.mudule.mumzonemarketcal.component.po.order.OrderChangeReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderChangeReturnMapper {
    int countByExample(OrderChangeReturnExample example);

    int deleteByExample(OrderChangeReturnExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderChangeReturn record);

    int insertSelective(OrderChangeReturn record);

    List<OrderChangeReturn> selectByExampleWithBLOBs(OrderChangeReturnExample example);

    List<OrderChangeReturn> selectByExample(OrderChangeReturnExample example);

    OrderChangeReturn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderChangeReturn record, @Param("example") OrderChangeReturnExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderChangeReturn record, @Param("example") OrderChangeReturnExample example);

    int updateByExample(@Param("record") OrderChangeReturn record, @Param("example") OrderChangeReturnExample example);

    int updateByPrimaryKeySelective(OrderChangeReturn record);

    int updateByPrimaryKeyWithBLOBs(OrderChangeReturn record);

    int updateByPrimaryKey(OrderChangeReturn record);
}