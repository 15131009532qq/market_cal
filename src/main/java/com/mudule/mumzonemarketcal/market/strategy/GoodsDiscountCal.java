package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;


/**
 * @Description 商品折扣  商品变价
 * @ClassName GoodsDiscountCal
 * @Autor DZT
 * @Date 2019/10/10 17:05
 * @Version 1.0
 */
@Slf4j
public class GoodsDiscountCal implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public GoodsDiscountCal(){

    }
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->计算商品折扣");
            return responseDiscountVo;
        }else {
            log.info("无商品折扣--->执行商品折扣策略");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
    }
}
