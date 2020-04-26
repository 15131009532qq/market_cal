package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 议价优惠策略
 * @ClassName BargainDiscountCal
 * @Autor DZT
 * @Date 2019/3/21 15:38
 * @Version 1.0
 */
@Slf4j
public class BargainDiscountCal  implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public BargainDiscountCal(){

    }
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销--------------->计算优惠折扣");
        return responseDiscountVo;
    }
}
