package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchasePay;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchasePayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsPurchasePayMapper {
    int countByExample(OrderGoodsPurchasePayExample example);

    int deleteByExample(OrderGoodsPurchasePayExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsPurchasePay record);

    int insertSelective(OrderGoodsPurchasePay record);

    List<OrderGoodsPurchasePay> selectByExample(OrderGoodsPurchasePayExample example);

    OrderGoodsPurchasePay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsPurchasePay record, @Param("example") OrderGoodsPurchasePayExample example);

    int updateByExample(@Param("record") OrderGoodsPurchasePay record, @Param("example") OrderGoodsPurchasePayExample example);

    int updateByPrimaryKeySelective(OrderGoodsPurchasePay record);

    int updateByPrimaryKey(OrderGoodsPurchasePay record);
}