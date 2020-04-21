package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchase;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsPurchaseMapper {
    int countByExample(OrderGoodsPurchaseExample example);

    int deleteByExample(OrderGoodsPurchaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsPurchase record);

    int insertSelective(OrderGoodsPurchase record);

    List<OrderGoodsPurchase> selectByExample(OrderGoodsPurchaseExample example);

    OrderGoodsPurchase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsPurchase record, @Param("example") OrderGoodsPurchaseExample example);

    int updateByExample(@Param("record") OrderGoodsPurchase record, @Param("example") OrderGoodsPurchaseExample example);

    int updateByPrimaryKeySelective(OrderGoodsPurchase record);

    int updateByPrimaryKey(OrderGoodsPurchase record);
}