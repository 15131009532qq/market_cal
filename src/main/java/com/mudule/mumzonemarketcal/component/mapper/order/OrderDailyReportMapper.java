package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderDailyReport;
import com.mudule.mumzonemarketcal.component.po.order.OrderDailyReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDailyReportMapper {
    int countByExample(OrderDailyReportExample example);

    int deleteByExample(OrderDailyReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderDailyReport record);

    int insertSelective(OrderDailyReport record);

    List<OrderDailyReport> selectByExample(OrderDailyReportExample example);

    OrderDailyReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDailyReport record, @Param("example") OrderDailyReportExample example);

    int updateByExample(@Param("record") OrderDailyReport record, @Param("example") OrderDailyReportExample example);

    int updateByPrimaryKeySelective(OrderDailyReport record);

    int updateByPrimaryKey(OrderDailyReport record);
}