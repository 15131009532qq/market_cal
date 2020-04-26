package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.component.vo.DiscountItem;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.component.vo.TicketVo;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 组合支付 金额计算
 * @ClassName CombinationPayCal
 * @Autor DZT
 * @Date 2019/8/20 10:03
 * @Version 1.0
 */
@Slf4j
public class CombinationPayCal implements MarketStrategy {

    public CombinationPayCal(){
    }

    /**
     * 组合支付 金额计算
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("组合支付--------------->计算组合支付支付金额");
        return responseDiscountVo;
    }
}
