package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.goods.GoodsCardServiceMapper;
import com.mudule.mumzonemarketcal.component.mapper.member.MemberTimesCardMapper;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsCardService;
import com.mudule.mumzonemarketcal.component.po.member.MemberTimesCard;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 计次卡支付
 * @ClassName TimesCardPayCal
 * @Autor DZT
 * @Date 2019/3/13 14:57
 * @Version 1.0
 */
@Slf4j
public class TimesCardPayCal implements MarketStrategy {

    private MemberTimesCardMapper memberTimesCardMapper;

    private GoodsCardServiceMapper goodsCardServiceMapper;
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public TimesCardPayCal(){
        this.memberTimesCardMapper=(MemberTimesCardMapper)SpringContext.getContext().getBean(BeanNameConstant.MEMBERTIMESCARDMAPPER);
        this.goodsCardServiceMapper=(GoodsCardServiceMapper)SpringContext.getContext().getBean(BeanNameConstant.GOODSCARDSERVICEMAPPER);
    }

    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->计次卡支付优惠计算");
        return responseDiscountVo;
    }
}
