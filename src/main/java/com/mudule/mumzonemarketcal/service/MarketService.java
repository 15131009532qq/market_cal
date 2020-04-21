package com.mudule.mumzonemarketcal.service;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;

/**
 * @Description 营销Data数据服务层
 * @ClassName MarketDataService
 * @Autor DZT
 * @Date 2019/3/13 17:04
 * @Version 1.0
 */
public interface MarketService {
    /**
     * 结账优惠信息计算
     */
    ResponseDiscountVo marketCal(OrderVo orderVo);
    ResponseDiscountVo toPayMonyCal(ResponseDiscountVo responseDiscountVo);

}
