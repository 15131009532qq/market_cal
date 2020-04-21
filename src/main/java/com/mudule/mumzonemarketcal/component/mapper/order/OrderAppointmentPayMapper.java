package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderAppointmentPay;
import com.mudule.mumzonemarketcal.component.po.order.OrderAppointmentPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAppointmentPayMapper {
    int countByExample(OrderAppointmentPayExample example);

    int deleteByExample(OrderAppointmentPayExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderAppointmentPay record);

    int insertSelective(OrderAppointmentPay record);

    List<OrderAppointmentPay> selectByExample(OrderAppointmentPayExample example);

    OrderAppointmentPay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderAppointmentPay record, @Param("example") OrderAppointmentPayExample example);

    int updateByExample(@Param("record") OrderAppointmentPay record, @Param("example") OrderAppointmentPayExample example);

    int updateByPrimaryKeySelective(OrderAppointmentPay record);

    int updateByPrimaryKey(OrderAppointmentPay record);
}