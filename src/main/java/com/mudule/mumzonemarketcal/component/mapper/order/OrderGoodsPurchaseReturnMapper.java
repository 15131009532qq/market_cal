package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseReturn;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsPurchaseReturnMapper {
    int countByExample(OrderGoodsPurchaseReturnExample example);

    int deleteByExample(OrderGoodsPurchaseReturnExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsPurchaseReturn record);

    int insertSelective(OrderGoodsPurchaseReturn record);

    List<OrderGoodsPurchaseReturn> selectByExample(OrderGoodsPurchaseReturnExample example);

    OrderGoodsPurchaseReturn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsPurchaseReturn record, @Param("example") OrderGoodsPurchaseReturnExample example);

    int updateByExample(@Param("record") OrderGoodsPurchaseReturn record, @Param("example") OrderGoodsPurchaseReturnExample example);

    int updateByPrimaryKeySelective(OrderGoodsPurchaseReturn record);

    int updateByPrimaryKey(OrderGoodsPurchaseReturn record);
}