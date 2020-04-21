package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseReturnDetail;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseReturnDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsPurchaseReturnDetailMapper {
    int countByExample(OrderGoodsPurchaseReturnDetailExample example);

    int deleteByExample(OrderGoodsPurchaseReturnDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsPurchaseReturnDetail record);

    int insertSelective(OrderGoodsPurchaseReturnDetail record);

    List<OrderGoodsPurchaseReturnDetail> selectByExample(OrderGoodsPurchaseReturnDetailExample example);

    OrderGoodsPurchaseReturnDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsPurchaseReturnDetail record, @Param("example") OrderGoodsPurchaseReturnDetailExample example);

    int updateByExample(@Param("record") OrderGoodsPurchaseReturnDetail record, @Param("example") OrderGoodsPurchaseReturnDetailExample example);

    int updateByPrimaryKeySelective(OrderGoodsPurchaseReturnDetail record);

    int updateByPrimaryKey(OrderGoodsPurchaseReturnDetail record);
}