package com.mudule.mumzonemarketcal.service;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;

/**
 * @Description 请输入类描述信息
 * @ClassName DroolsService
 * @Autor DZT
 * @Date 2019/3/12 15:28
 * @Version 1.0
 */
public interface DroolsService {

    /**
     * 营销计算规则 执行引擎
     * @return
     */
    ResponseDiscountVo MarketCalRule(OrderVo orderVo);
    String fireRule();
}
