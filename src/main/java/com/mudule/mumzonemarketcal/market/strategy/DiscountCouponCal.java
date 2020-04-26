package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketGoodsMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketMapper;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoods;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.IsTimerCardEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DZT
 * @date 2019-06-27
 */
@Slf4j
public class DiscountCouponCal implements MarketStrategy {

    private MarketTicketMapper marketTicketMapper;
    private MarketTicketGoodsMapper marketTicketGoodsMapper;
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public DiscountCouponCal(){
        this.marketTicketMapper=(MarketTicketMapper) SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETMAPPER);
        this.marketTicketGoodsMapper=(MarketTicketGoodsMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETGOODSMAPPER);
    }

    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        return responseDiscountVo;
    }
}
