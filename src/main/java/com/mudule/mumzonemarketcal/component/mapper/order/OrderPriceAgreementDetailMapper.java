package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderPriceAgreementDetail;
import com.mudule.mumzonemarketcal.component.po.order.OrderPriceAgreementDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPriceAgreementDetailMapper {
    int countByExample(OrderPriceAgreementDetailExample example);

    int deleteByExample(OrderPriceAgreementDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderPriceAgreementDetail record);

    int insertSelective(OrderPriceAgreementDetail record);

    List<OrderPriceAgreementDetail> selectByExample(OrderPriceAgreementDetailExample example);

    OrderPriceAgreementDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderPriceAgreementDetail record, @Param("example") OrderPriceAgreementDetailExample example);

    int updateByExample(@Param("record") OrderPriceAgreementDetail record, @Param("example") OrderPriceAgreementDetailExample example);

    int updateByPrimaryKeySelective(OrderPriceAgreementDetail record);

    int updateByPrimaryKey(OrderPriceAgreementDetail record);
}