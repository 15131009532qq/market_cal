package com.mudule.mumzonemarketcal.enums;

import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.market.strategy.*;
import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 策略的枚举类
 * @ClassName MarketStrategyEnum
 * @Autor DZT
 * @Date 2019/3/13 15:17
 * @Version 1.0
 */
public enum  MarketStrategyEnum {

    /**
     * 定义营销策略code
     */
    EXPERIENCESECURITIESCAL("1",new ExperienceSecuritiesCal(),"体验劵->ruls->cal"),
    INTEGRALCAL("2",new IntegralCal(),"获取积分->ruls->cal"),
    INTEGRALPAYCAL("3",new IntegralPayCal(),"积分抵现->ruls->cal"),
    MARKETACTIVITYCAL("4",new MarketActivityCal(),"营销活动->ruls->cal"),
    MLPRICE("5",new MlPrice(),"抹零->ruls->cal"),
    TIMESCARDPAYCAL("6",new TimesCardPayCal(),"计次卡->ruls->cal"),
    WITHREDUCEDSECURITIESCAL("7",new WithReducedSecuritiesCal(),"满减劵->->cal"),
    MEMBERDISCOUNTCAL("8",new MemberDiscountCal(),"会员优惠->->cal"),
    BARGAINDISCOUNTCAL("9",new BargainDiscountCal(),"议价优惠->->cal"),
    DISCOUNTCOUPONCAL("10",new DiscountCouponCal(),"折扣劵优惠->->cal"),
    COMBINATIONPAYCAL("11",new CombinationPayCal(),"组合支付金额计算->->cal"),
    GOODSDISCOUNTCAL("12",new GoodsDiscountCal(),"商品折扣金额计算->->cal"),
    NULL(null,null,"空");

    //TODO 自定义添加对应的策略信息 不使用的策略置为空 节省内存

    /**
     * 构造函数
     * @param code
     * @param msg
     */
    MarketStrategyEnum(String code,MarketStrategy marketStrategy,String msg){
        this.code=code;
        this.msg=msg;
        this.marketStrategy=marketStrategy;
    }

    /**
     * 获取枚举测试类
     * @param code
     * @return
     */
    public static MarketStrategyEnum getMarketStrategyEnum(String code){
        if (StringUtils.isEmpty(code)){
            return MarketStrategyEnum.NULL;
        }else {
            for (MarketStrategyEnum marketStrategyEnum:MarketStrategyEnum.values()){
                if (marketStrategyEnum.code.endsWith(code)){
                    return marketStrategyEnum;
                }
            }
        }
        return MarketStrategyEnum.NULL;
    }

    /**
     * 状态码
     */
    private String code;
    /**
     * 状态信息
     */
    private String msg;
    /**
     * 执行的策略
     */
    private MarketStrategy marketStrategy;

    public MarketStrategy getMarketStrategy() {
        return marketStrategy;
    }

    public void setMarketStrategy(MarketStrategy marketStrategy) {
        this.marketStrategy = marketStrategy;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
