package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderSalePay;
import com.mudule.mumzonemarketcal.component.po.order.OrderSalePayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSalePayMapper {
    int countByExample(OrderSalePayExample example);

    int deleteByExample(OrderSalePayExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderSalePay record);

    int insertSelective(OrderSalePay record);

    List<OrderSalePay> selectByExample(OrderSalePayExample example);

    OrderSalePay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderSalePay record, @Param("example") OrderSalePayExample example);

    int updateByExample(@Param("record") OrderSalePay record, @Param("example") OrderSalePayExample example);

    int updateByPrimaryKeySelective(OrderSalePay record);

    int updateByPrimaryKey(OrderSalePay record);
}