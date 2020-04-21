package com.mudule.mumzonemarketcal.component.mapper.order;

import com.mudule.mumzonemarketcal.component.po.order.OrderAgreementTemplateDetail;
import com.mudule.mumzonemarketcal.component.po.order.OrderAgreementTemplateDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAgreementTemplateDetailMapper {
    int countByExample(OrderAgreementTemplateDetailExample example);

    int deleteByExample(OrderAgreementTemplateDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderAgreementTemplateDetail record);

    int insertSelective(OrderAgreementTemplateDetail record);

    List<OrderAgreementTemplateDetail> selectByExample(OrderAgreementTemplateDetailExample example);

    OrderAgreementTemplateDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderAgreementTemplateDetail record, @Param("example") OrderAgreementTemplateDetailExample example);

    int updateByExample(@Param("record") OrderAgreementTemplateDetail record, @Param("example") OrderAgreementTemplateDetailExample example);

    int updateByPrimaryKeySelective(OrderAgreementTemplateDetail record);

    int updateByPrimaryKey(OrderAgreementTemplateDetail record);
}