package com.mudule.mumzonemarketcal.service.impl;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.MarketStrategyEnum;
import com.mudule.mumzonemarketcal.market.factory.MarketStrategyFactory;
import com.mudule.mumzonemarketcal.market.factory.MarketStrategyFactoryImpl;
import com.mudule.mumzonemarketcal.service.RuleExecuteService;
import org.springframework.stereotype.Service;

/**
 * @Description 规则执行服务实现类
 * @ClassName RuleExecuteServiceImpl
 * @Autor DZT
 * @Date 2019/7/10 15:08
 * @Version 1.0
 */
@Service
public class RuleExecuteServiceImpl implements RuleExecuteService {
    /**
     * 加载营销策略工厂
     */
    private  final MarketStrategyFactory marketStrategyFactory = new MarketStrategyFactoryImpl();

    /**
     * 抹零均摊
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo mlPriceDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.FIVE))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 议价折扣
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo bargainDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.NINE))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 体验劵折扣
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo experienceSecuritiesDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.ONE))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 积分均摊
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo integralShare(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.TWO))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 营销活动
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo marketActivityDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.FOUR))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 会员折扣
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo memberDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.EIGHT))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 计次卡支付
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo timesCardPayDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.SIX))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 满减劵折扣
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo withReducedSecuritiesDisocunt(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.SEVEN))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 积分抵现
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo integralToPayDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.THREE))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }
    /**
     * 折扣劵优惠
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo discountCouponDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.TEN))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 组合支付计算
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo combinationPay(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.ELEVEN))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }

    /**
     * 商品折扣优惠
     * @param orderVo
     * @return
     */
    @Override
    public  ResponseDiscountVo goodsDiscount(OrderVo orderVo){
        ResponseDiscountVo responseDiscountVo=marketStrategyFactory
                .getMarketCal(MarketStrategyEnum.getMarketStrategyEnum(UseConstant.TWELVE))
                .calMarketContext(orderVo);
        return responseDiscountVo;
    }
}
