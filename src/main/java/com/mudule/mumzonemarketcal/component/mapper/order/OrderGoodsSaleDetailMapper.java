package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsSaleDetail;
import com.mudule.mumzonemarketcal.component.po.order.OrderGoodsSaleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsSaleDetailMapper {
    int countByExample(OrderGoodsSaleDetailExample example);

    int deleteByExample(OrderGoodsSaleDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderGoodsSaleDetail record);

    int insertSelective(OrderGoodsSaleDetail record);

    List<OrderGoodsSaleDetail> selectByExample(OrderGoodsSaleDetailExample example);

    OrderGoodsSaleDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderGoodsSaleDetail record, @Param("example") OrderGoodsSaleDetailExample example);

    int updateByExample(@Param("record") OrderGoodsSaleDetail record, @Param("example") OrderGoodsSaleDetailExample example);

    int updateByPrimaryKeySelective(OrderGoodsSaleDetail record);

    int updateByPrimaryKey(OrderGoodsSaleDetail record);
}