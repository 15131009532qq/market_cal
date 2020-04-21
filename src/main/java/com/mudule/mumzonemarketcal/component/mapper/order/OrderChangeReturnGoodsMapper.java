package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderChangeReturnGoods;
import com.mudule.mumzonemarketcal.component.po.order.OrderChangeReturnGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderChangeReturnGoodsMapper {
    int countByExample(OrderChangeReturnGoodsExample example);

    int deleteByExample(OrderChangeReturnGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderChangeReturnGoods record);

    int insertSelective(OrderChangeReturnGoods record);

    List<OrderChangeReturnGoods> selectByExample(OrderChangeReturnGoodsExample example);

    OrderChangeReturnGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderChangeReturnGoods record, @Param("example") OrderChangeReturnGoodsExample example);

    int updateByExample(@Param("record") OrderChangeReturnGoods record, @Param("example") OrderChangeReturnGoodsExample example);

    int updateByPrimaryKeySelective(OrderChangeReturnGoods record);

    int updateByPrimaryKey(OrderChangeReturnGoods record);
}