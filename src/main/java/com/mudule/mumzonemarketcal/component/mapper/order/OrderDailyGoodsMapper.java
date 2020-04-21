package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderDailyGoods;
import com.mudule.mumzonemarketcal.component.po.order.OrderDailyGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDailyGoodsMapper {
    int countByExample(OrderDailyGoodsExample example);

    int deleteByExample(OrderDailyGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderDailyGoods record);

    int insertSelective(OrderDailyGoods record);

    List<OrderDailyGoods> selectByExample(OrderDailyGoodsExample example);

    OrderDailyGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDailyGoods record, @Param("example") OrderDailyGoodsExample example);

    int updateByExample(@Param("record") OrderDailyGoods record, @Param("example") OrderDailyGoodsExample example);

    int updateByPrimaryKeySelective(OrderDailyGoods record);

    int updateByPrimaryKey(OrderDailyGoods record);
}