package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderPriceAgreement;
import com.mudule.mumzonemarketcal.component.po.order.OrderPriceAgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPriceAgreementMapper {
    int countByExample(OrderPriceAgreementExample example);

    int deleteByExample(OrderPriceAgreementExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderPriceAgreement record);

    int insertSelective(OrderPriceAgreement record);

    List<OrderPriceAgreement> selectByExample(OrderPriceAgreementExample example);

    OrderPriceAgreement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderPriceAgreement record, @Param("example") OrderPriceAgreementExample example);

    int updateByExample(@Param("record") OrderPriceAgreement record, @Param("example") OrderPriceAgreementExample example);

    int updateByPrimaryKeySelective(OrderPriceAgreement record);

    int updateByPrimaryKey(OrderPriceAgreement record);
}