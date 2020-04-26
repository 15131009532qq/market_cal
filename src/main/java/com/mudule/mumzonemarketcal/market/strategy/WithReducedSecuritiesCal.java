package com.mudule.mumzonemarketcal.market.strategy;

import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ConstantCommMethod;
import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.goods.GoodsShopMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketApplyTypeMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketGoodsConditionMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketGoodsMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketMapper;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsShop;
import com.mudule.mumzonemarketcal.component.po.market.*;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.OrderTypeEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.enums.TicketTypeEnum;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.service.FeiginService;
import com.mudule.mumzonemarketcal.service.impl.FeiginServiceImpl;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description 满减劵
 * @ClassName WithReducedSecuritiesCal
 * @Autor DZT
 * @Date 2019/3/13 14:48
 * @Version 1.0
 */
@Slf4j
public class WithReducedSecuritiesCal implements MarketStrategy {

    private MarketTicketMapper marketTicketMapper;

    private MarketTicketGoodsMapper marketTicketGoodsMapper;

    private GoodsShopMapper goodsShopMapper;

    private MarketTicketApplyTypeMapper marketTicketApplyTypeMapper;

    private MarketTicketGoodsConditionMapper marketTicketGoodsConditionMapper;

    private FeiginService feiginService;

    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public WithReducedSecuritiesCal(){
        this.marketTicketMapper=(MarketTicketMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETMAPPER);
        this.marketTicketGoodsMapper=(MarketTicketGoodsMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETGOODSMAPPER);
        this.goodsShopMapper=(GoodsShopMapper)SpringContext.getContext().getBean(BeanNameConstant.GOODSSHOPMAPPER);
        this.marketTicketApplyTypeMapper=(MarketTicketApplyTypeMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETAPPLYTYPEMAPPER);
        this.marketTicketGoodsConditionMapper=(MarketTicketGoodsConditionMapper)SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETGOODSCONDITIONMAPPER);
        this.feiginService=(FeiginServiceImpl)SpringContext.getContext().getBean(BeanNameConstant.FEIGINSERVICEIMPL);
    }
    /**
     * 进行满减劵营销计算
     *      满减劵规则计算:
     *           1、普通商品类订单: 普通商品采用除了计次卡的其他的5中支付方式 优惠券、优惠活动、抹零金额、会员折扣
     *                 [1]:使用优惠券进行优惠均摊时-->优惠活动和优惠券二选一
     *                 [2]:可以使用多张优惠券进行优惠-->子商品折扣满了不可再进行折扣、多张优惠劵优惠金额超总金额不可进行优惠
     *                 [3]:优惠券使用类型-->参与类型：0-全部参与，1-指定参与，2-指定不参与【改版后---已经去掉2状态】-->适用类型：0-商品，1-服务，2-次卡
     *           2、服务类订单:
     *           3、计次卡订单:
     *
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------->满减劵计算");
        return responseDiscountVo;
    }
}