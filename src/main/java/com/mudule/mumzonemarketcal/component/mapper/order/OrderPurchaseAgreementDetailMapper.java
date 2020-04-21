package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderPurchaseAgreementDetail;
import com.mudule.mumzonemarketcal.component.po.order.OrderPurchaseAgreementDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPurchaseAgreementDetailMapper {
    int countByExample(OrderPurchaseAgreementDetailExample example);

    int deleteByExample(OrderPurchaseAgreementDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderPurchaseAgreementDetail record);

    int insertSelective(OrderPurchaseAgreementDetail record);

    List<OrderPurchaseAgreementDetail> selectByExample(OrderPurchaseAgreementDetailExample example);

    OrderPurchaseAgreementDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderPurchaseAgreementDetail record, @Param("example") OrderPurchaseAgreementDetailExample example);

    int updateByExample(@Param("record") OrderPurchaseAgreementDetail record, @Param("example") OrderPurchaseAgreementDetailExample example);

    int updateByPrimaryKeySelective(OrderPurchaseAgreementDetail record);

    int updateByPrimaryKey(OrderPurchaseAgreementDetail record);
}