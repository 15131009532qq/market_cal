package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseDetail;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsPurchaseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsPurchaseDetailMapper {
    int countByExample(OrderGoodsPurchaseDetailExample example);

    int deleteByExample(OrderGoodsPurchaseDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsPurchaseDetail record);

    int insertSelective(OrderGoodsPurchaseDetail record);

    List<OrderGoodsPurchaseDetail> selectByExample(OrderGoodsPurchaseDetailExample example);

    OrderGoodsPurchaseDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsPurchaseDetail record, @Param("example") OrderGoodsPurchaseDetailExample example);

    int updateByExample(@Param("record") OrderGoodsPurchaseDetail record, @Param("example") OrderGoodsPurchaseDetailExample example);

    int updateByPrimaryKeySelective(OrderGoodsPurchaseDetail record);

    int updateByPrimaryKey(OrderGoodsPurchaseDetail record);
}