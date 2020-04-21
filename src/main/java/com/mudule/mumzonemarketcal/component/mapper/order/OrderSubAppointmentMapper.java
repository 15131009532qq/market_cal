package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderSubAppointment;
import com.mudule.mumzonemarketcal.component.po.order.OrderSubAppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSubAppointmentMapper {
    int countByExample(OrderSubAppointmentExample example);

    int deleteByExample(OrderSubAppointmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderSubAppointment record);

    int insertSelective(OrderSubAppointment record);

    List<OrderSubAppointment> selectByExample(OrderSubAppointmentExample example);

    OrderSubAppointment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderSubAppointment record, @Param("example") OrderSubAppointmentExample example);

    int updateByExample(@Param("record") OrderSubAppointment record, @Param("example") OrderSubAppointmentExample example);

    int updateByPrimaryKeySelective(OrderSubAppointment record);

    int updateByPrimaryKey(OrderSubAppointment record);
}