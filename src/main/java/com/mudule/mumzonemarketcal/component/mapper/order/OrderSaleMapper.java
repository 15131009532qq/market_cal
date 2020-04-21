package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderSale;
import com.mudule.mumzonemarketcal.component.po.order.OrderSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSaleMapper {
    int countByExample(OrderSaleExample example);

    int deleteByExample(OrderSaleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderSale record);

    int insertSelective(OrderSale record);

    List<OrderSale> selectByExample(OrderSaleExample example);

    OrderSale selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderSale record, @Param("example") OrderSaleExample example);

    int updateByExample(@Param("record") OrderSale record, @Param("example") OrderSaleExample example);

    int updateByPrimaryKeySelective(OrderSale record);

    int updateByPrimaryKey(OrderSale record);
}