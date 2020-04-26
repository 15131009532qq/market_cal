package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.service.MarketDataService;
import com.mudule.mumzonemarketcal.component.service.impl.MarketDataServiceImpl;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 体验劵
 * @ClassName ExperienceSecuritiesCal
 * @Autor DZT
 * @Date 2019/3/13 14:50
 * @Version 1.0
 */
@Slf4j
public class ExperienceSecuritiesCal implements MarketStrategy {
    private MarketDataService marketDataService;

    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public ExperienceSecuritiesCal(){
        marketDataService= new MarketDataServiceImpl();
    }
    /**
     * 进行体验劵优惠均摊计算
     *          体验劵使用的规则信息
     *             规则信息: 1、体验劵针对是服务类订单信息
     *                      2、体验劵和次卡不能对同一个服务使用
     *                      3、体验劵对一个服务只能使用一次
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->体验劵计算");
        return responseDiscountVo;
    }


}


