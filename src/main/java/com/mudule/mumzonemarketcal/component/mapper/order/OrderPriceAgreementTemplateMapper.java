package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderPriceAgreementTemplate;
import com.mudule.mumzonemarketcal.component.po.order.OrderPriceAgreementTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPriceAgreementTemplateMapper {
    int countByExample(OrderPriceAgreementTemplateExample example);

    int deleteByExample(OrderPriceAgreementTemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderPriceAgreementTemplate record);

    int insertSelective(OrderPriceAgreementTemplate record);

    List<OrderPriceAgreementTemplate> selectByExample(OrderPriceAgreementTemplateExample example);

    OrderPriceAgreementTemplate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderPriceAgreementTemplate record, @Param("example") OrderPriceAgreementTemplateExample example);

    int updateByExample(@Param("record") OrderPriceAgreementTemplate record, @Param("example") OrderPriceAgreementTemplateExample example);

    int updateByPrimaryKeySelective(OrderPriceAgreementTemplate record);

    int updateByPrimaryKey(OrderPriceAgreementTemplate record);
}