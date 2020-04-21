package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsSale;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsSaleMapper {
    int countByExample(OrderGoodsSaleExample example);

    int deleteByExample(OrderGoodsSaleExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsSale record);

    int insertSelective(OrderGoodsSale record);

    List<OrderGoodsSale> selectByExample(OrderGoodsSaleExample example);

    OrderGoodsSale selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsSale record, @Param("example") OrderGoodsSaleExample example);

    int updateByExample(@Param("record") OrderGoodsSale record, @Param("example") OrderGoodsSaleExample example);

    int updateByPrimaryKeySelective(OrderGoodsSale record);

    int updateByPrimaryKey(OrderGoodsSale record);
}