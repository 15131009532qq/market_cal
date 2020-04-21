package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderPurchaseAgreement;
import com.mudule.mumzonemarketcal.component.po.order.OrderPurchaseAgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPurchaseAgreementMapper {
    int countByExample(OrderPurchaseAgreementExample example);

    int deleteByExample(OrderPurchaseAgreementExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderPurchaseAgreement record);

    int insertSelective(OrderPurchaseAgreement record);

    List<OrderPurchaseAgreement> selectByExample(OrderPurchaseAgreementExample example);

    OrderPurchaseAgreement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderPurchaseAgreement record, @Param("example") OrderPurchaseAgreementExample example);

    int updateByExample(@Param("record") OrderPurchaseAgreement record, @Param("example") OrderPurchaseAgreementExample example);

    int updateByPrimaryKeySelective(OrderPurchaseAgreement record);

    int updateByPrimaryKey(OrderPurchaseAgreement record);
}