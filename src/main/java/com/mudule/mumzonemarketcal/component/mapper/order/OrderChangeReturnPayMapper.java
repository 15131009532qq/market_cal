package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderChangeReturnPay;
import com.mudule.mumzonemarketcal.component.po.order.OrderChangeReturnPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderChangeReturnPayMapper {
    int countByExample(OrderChangeReturnPayExample example);

    int deleteByExample(OrderChangeReturnPayExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderChangeReturnPay record);

    int insertSelective(OrderChangeReturnPay record);

    List<OrderChangeReturnPay> selectByExample(OrderChangeReturnPayExample example);

    OrderChangeReturnPay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderChangeReturnPay record, @Param("example") OrderChangeReturnPayExample example);

    int updateByExample(@Param("record") OrderChangeReturnPay record, @Param("example") OrderChangeReturnPayExample example);

    int updateByPrimaryKeySelective(OrderChangeReturnPay record);

    int updateByPrimaryKey(OrderChangeReturnPay record);
}