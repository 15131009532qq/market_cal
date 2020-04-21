package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderShiftRecords;
import com.mudule.mumzonemarketcal.component.po.order.OrderShiftRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderShiftRecordsMapper {
    int countByExample(OrderShiftRecordsExample example);

    int deleteByExample(OrderShiftRecordsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderShiftRecords record);

    int insertSelective(OrderShiftRecords record);

    List<OrderShiftRecords> selectByExample(OrderShiftRecordsExample example);

    OrderShiftRecords selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderShiftRecords record, @Param("example") OrderShiftRecordsExample example);

    int updateByExample(@Param("record") OrderShiftRecords record, @Param("example") OrderShiftRecordsExample example);

    int updateByPrimaryKeySelective(OrderShiftRecords record);

    int updateByPrimaryKey(OrderShiftRecords record);
}