package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderSaleGoods;
import com.mudule.mumzonemarketcal.component.po.order.OrderSaleGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderSaleGoodsMapper {
    int countByExample(OrderSaleGoodsExample example);

    int deleteByExample(OrderSaleGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderSaleGoods record);

    int insertSelective(OrderSaleGoods record);

    List<OrderSaleGoods> selectByExample(OrderSaleGoodsExample example);

    OrderSaleGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderSaleGoods record, @Param("example") OrderSaleGoodsExample example);

    int updateByExample(@Param("record") OrderSaleGoods record, @Param("example") OrderSaleGoodsExample example);

    int updateByPrimaryKeySelective(OrderSaleGoods record);

    int updateByPrimaryKey(OrderSaleGoods record);
}