package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderAppointment;
import com.mudule.mumzonemarketcal.component.po.order.OrderAppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAppointmentMapper {
    int countByExample(OrderAppointmentExample example);

    int deleteByExample(OrderAppointmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderAppointment record);

    int insertSelective(OrderAppointment record);

    List<OrderAppointment> selectByExample(OrderAppointmentExample example);

    OrderAppointment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderAppointment record, @Param("example") OrderAppointmentExample example);

    int updateByExample(@Param("record") OrderAppointment record, @Param("example") OrderAppointmentExample example);

    int updateByPrimaryKeySelective(OrderAppointment record);

    int updateByPrimaryKey(OrderAppointment record);
}