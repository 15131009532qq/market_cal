package com.mudule.mumzonemarketcal.market.strategy;

import cn.egg.cloud.enums.ActivityJoinTypeEnum;
import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketActivityGoodsMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketActivityMapper;
import com.mudule.mumzonemarketcal.component.po.market.*;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.ActivityJoinType;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.*;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.service.FeiginService;
import com.mudule.mumzonemarketcal.service.impl.FeiginServiceImpl;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 优惠活动
 * @ClassName MarketActivityCal
 * @Autor DZT
 * @Date 2019/3/13 14:56
 * @Version 1.0
 */
@Slf4j
public class MarketActivityCal implements MarketStrategy {
    private MarketActivityMapper marketActivityMapper;
    private MarketActivityGoodsMapper marketActivityGoodsMapper;
    private FeiginService feiginService;
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public MarketActivityCal(){
        this.marketActivityMapper= (MarketActivityMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETACTIVITYMAPPER);
        this.marketActivityGoodsMapper=(MarketActivityGoodsMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETACTIVITYGOODSMAPPER);
        this.feiginService=(FeiginServiceImpl)SpringContext.getContext().getBean(BeanNameConstant.FEIGINSERVICEIMPL);
    }

    /**
     * 营销活动 包括
     * 满减活动 与 满折活动、满减劵、满折劵互斥
     * 满折活动 与 满减活动、满折劵、满减劵互斥
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->优惠活动计算");
        return responseDiscountVo;
    }
}
