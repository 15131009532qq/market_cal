package com.mudule.mumzonemarketcal.market.strategy;

import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ConstantCommMethod;
import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.member.MemberCompanyMapper;
import com.mudule.mumzonemarketcal.component.mapper.member.MemberMapper;
import com.mudule.mumzonemarketcal.component.po.member.MemberCompany;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.IsTimerCardEnum;
import com.mudule.mumzonemarketcal.enums.OrderTypeEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.exception.MarketException;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.service.FeiginService;
import com.mudule.mumzonemarketcal.service.impl.FeiginServiceImpl;
import com.mudule.mumzonemarketcal.utils.DateUtil;
import com.mudule.mumzonemarketcal.utils.SortUtil;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description 积分-->获得积分
 * @ClassName IntegralCal
 * @Autor DZT
 * @Date 2019/3/13 14:54
 * @Version 1.0
 */
@Slf4j
public class IntegralCal implements MarketStrategy {

    private FeiginService feiginService;
    private MemberMapper memberMapper;
    private MemberCompanyMapper memberCompanyMapper;
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public IntegralCal(){
        this.feiginService=(FeiginServiceImpl)SpringContext.getContext().getBean(BeanNameConstant.FEIGINSERVICEIMPL);
        this.memberMapper=(MemberMapper)SpringContext.getContext().getBean(BeanNameConstant.MEMBERMAPPER);
        this.memberCompanyMapper=(MemberCompanyMapper)SpringContext.getContext().getBean(BeanNameConstant.MEMBERCOMPANYMAPPER);
    }

    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->获取积分以及积分均摊计算");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        responseDiscountVo.setOrderVo(orderVo);
        IntegralRuleVo rules=null;
        //判断是否是会员
        if (StringUtils.isEmpty(orderVo.getMemberCompanyId())){
            log.info("非会员不进行积分");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }else {
            log.info("会员订单进行积分规则计算积分");
        }
        //查询会员积分规则
        try {
            rules=feiginService.getAllIntetralRuleInfo(orderVo.getShopId());
        }catch (Exception e){
            log.error(ErrMsgConstant.INTERGAL_RULE_QUERY_ERR,e);
            responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
            responseDiscountVo.setMsg(ErrMsgConstant.INTERGAL_RULE_QUERY_ERR);
            responseDiscountVo.setCode(UseConstant.FAIL);
            return responseDiscountVo;
        }
        if (StringUtils.isEmpty(rules)){
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }else {
            //进行积分计算
            log.info("进行积分规则[{}]计算",rules.getRuleName());
            switch (rules.getGetType()){
                case UseConstant.ZERO://不积分
                    log.info("积分方式为不积分");
                    responseDiscountVo.setOrderVo(orderVo);
                    responseDiscountVo.setCode(UseConstant.SUCCESS);
                    return responseDiscountVo;
                case UseConstant.ONE://按照支付金额积分
                    log.info("积分方式为按照支付金额积分");
                    responseDiscountVo=integralByPay(orderVo,responseDiscountVo,rules);
                    break;
                case UseConstant.TWO://按照单品积分
                    log.info("积分方式为按照单品积分");
                    responseDiscountVo=integralByGoods(orderVo,responseDiscountVo,rules);
                    break;
            }
            //判断会员日和注册日
            responseDiscountVo=checkMemberMarketDay(responseDiscountVo,rules);
        }
        return responseDiscountVo;
    }

    /**
     * 进行积分规则计算 按照支付金额计算
     * @param orderVo
     * @param responseDiscountVo
     * @param rules
     * @return
     */
    public ResponseDiscountVo integralByPay(OrderVo orderVo,ResponseDiscountVo responseDiscountVo,IntegralRuleVo rules){
        //按照支付金额进行积分
        if (StringUtils.isEmpty(rules.getHowMuthOne())){
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        if (StringUtils.isNotEmpty(rules.getHowMuthOne())&&new BigDecimal(rules.getHowMuthOne()).compareTo(BigDecimal.ZERO)<=0){
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        BigDecimal howMuthOne=new BigDecimal(rules.getHowMuthOne());//支付多少积一分
        int totalGain=0;//总积分
        switch (orderVo.getOrderType()){
            case OrderConstant.GOODSORDER://商品
                //计算总积分
                totalGain=calGoodsTotalIntegalByPayAmount(orderVo,howMuthOne,rules);
                orderVo.setTotalGain(totalGain);
                //进行积分均摊
                orderVo=calGoodsObtainByPayAmount(orderVo,totalGain,howMuthOne,rules.getTimeCardRule(),rules);
                break;
            case OrderConstant.SERVICEORDER://服务
                //计算总积分
                totalGain=calServiceTotalIntegalByPayAmount(orderVo,howMuthOne,rules);
                orderVo.setTotalGain(totalGain);
                //进行积分均摊
                orderVo=calServiceObtainByPayAmount(orderVo,totalGain,howMuthOne,rules.getTimeCardRule(),rules);
                break;
            case OrderConstant.TIMESCARDORDER://计次卡
                //计算总积分
                totalGain=calGoodsTotalIntegalByPayAmount(orderVo,howMuthOne,rules);
                orderVo.setTotalGain(totalGain);
                //进行积分均摊
                orderVo=calGoodsObtainByPayAmount(orderVo,totalGain,howMuthOne,rules.getTimeCardRule(),rules);
                break;
        }
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        responseDiscountVo.setOrderVo(orderVo);
        return responseDiscountVo;
    }

    /**
     * 进行积分规则计算 按照单品进行积分 商品和次卡类
     * @param orderVo
     * @param responseDiscountVo
     * @param rules
     * @return
     */
    public ResponseDiscountVo integralByGoods(OrderVo orderVo,ResponseDiscountVo responseDiscountVo,IntegralRuleVo rules){
        //按照支付金额进行积分
        if (OrderTypeEnum.GOODSORDER.getCode().equals(orderVo.getOrderType())){
            int totalIntegral=0;
            for (OrderSubVo orderSubVo:orderVo.getGoods()){
                int integral=0;
                //议价商品积分 0 否 1 是
                if (UseConstant.ONE.equals(rules.getIsNoIntegralTwo())){
                    if (orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
                        continue;
                    }
                }
                //进行变价商品积分
                if (UseConstant.ONE.equals(rules.getIsNoIntegralThree())){
                    if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
                        continue;
                    }
                }
                //赠品积分
                if (!UseConstant.ONE.equals(rules.getIsNoIntegralOne())){
                    integral+=orderSubVo.getSoldIntegral()*(StringUtils.isNotEmpty(orderSubVo.getPresentNum())?orderSubVo.getPresentNum():0);
                }
                integral+=orderSubVo.getSoldIntegral()*(orderSubVo.getGoodsCount()-orderSubVo.getPresentNum());
                orderSubVo.setObtainIntegral(integral);
                totalIntegral+=integral;
            }
            orderVo.setTotalGain(totalIntegral);
        }else {
            //服务和计次卡类商品不进行积分 单品积分只针对商品
            log.info("单品积分不针对服务类和计次卡类订单积分...");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        responseDiscountVo.setOrderVo(orderVo);
        return responseDiscountVo;
    }

    /**
     * 计算总积分
     * @param orderVo
     * @param howMuthOne
     * @return
     */
    public int calGoodsTotalIntegalByPayAmount(OrderVo orderVo,BigDecimal howMuthOne,IntegralRuleVo integralRuleVo){
        if (StringUtils.isNotEmpty(howMuthOne)&&howMuthOne.compareTo(BigDecimal.ZERO)<=0){
            return 0;
        }
        //计算待支付金额
        BigDecimal toPayAmount=calGoodsAndTimeCardTotalAmount(orderVo,integralRuleVo);
        //不进行积分
        if (toPayAmount.compareTo(BigDecimal.ZERO)<=0){
            return 0;
        }
        BigDecimal result=subTractIntegralOrBlance(orderVo,integralRuleVo,toPayAmount);
        return  result.divide(howMuthOne,0,RoundingMode.DOWN).intValue();
    }

    /**
     * 进行积分均摊 商品、次卡类
     * @param orderVo
     * @param total
     * @param howMuthOne
     * @return
     */
    public OrderVo calGoodsObtainByPayAmount(OrderVo orderVo,int total,BigDecimal howMuthOne,String timeCardRule,IntegralRuleVo integralRuleVo){
        if (StringUtils.isNotEmpty(howMuthOne)&&howMuthOne.compareTo(BigDecimal.ZERO)<=0){
            return orderVo;
        }
        //判断是否需要进行积分均摊
        if (total==0){
            return orderVo;
        }
        int rediusGain=0;//剩余积分
        boolean flagIntegral=false;
        BigDecimal integral1=orderGoodsMegreIntegral(orderVo,integralRuleVo);
        if (StringUtils.isNotEmpty(integral1)&&integral1.compareTo(BigDecimal.ZERO)>0){
            flagIntegral=true;
        }
        //计算订单总金额
        BigDecimal totalAmount=calGoodsAndTimeCardTotalAmount(orderVo,integralRuleVo);
        if (StringUtils.isNotEmpty(totalAmount)&&totalAmount.compareTo(BigDecimal.ZERO)<=0){
            return orderVo;
        }
        Map<String,String> map=new HashMap<>();
        for (OrderSubVo orderSubVo:orderVo.getGoods()){
            orderSubVo.setIntegralDiscountAmount(howMuthOne);
            BigDecimal price=new BigDecimal(0.00);
            if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)&&(UseConstant.TWO.equals(integralRuleVo.getTimeCardRule())||UseConstant.ONE.equals(integralRuleVo.getTimeCardRule()))){
                continue;
            }else {
                //设置积分库中不计分的商品依然不积分
                if (StringUtils.isNotEmpty(integralRuleVo.getIsNoIntegral())&&integralRuleVo.getIsNoIntegral().equals(UseConstant.ONE)){
                    if (orderSubVo.getSoldIntegral()==0){
                        continue;
                    }
                }
                if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)&&(UseConstant.TWO.equals(integralRuleVo.getTimeCardRule())||UseConstant.ONE.equals(integralRuleVo.getTimeCardRule()))){
                    continue;
                }else {
                    price=calOrderSubVoAmount(orderVo,orderSubVo);
                }
                BigDecimal singPrice=new BigDecimal(0.00);
                singPrice=singPrice.add(price.multiply(new BigDecimal(orderSubVo.getGoodsCount()-orderSubVo.getPresentNum()))).subtract(orderSubVo.getTotalDiscount());
                //计算积分抵现的占比合并余额支付的钱的比例
                if (flagIntegral){
                    BigDecimal priceRatio=orderSubVoExcepleIntegral(singPrice,orderVo,totalAmount,integralRuleVo);
                    BigDecimal payAmount=singPrice.subtract(priceRatio);
                    if (payAmount.compareTo(BigDecimal.ZERO)<=0){//小于0
                        orderSubVo.setObtainIntegral(0);//获取的积分
                    }else {
                        int integral=payAmount.divide(howMuthOne,0,RoundingMode.DOWN).intValue();//采用向下取整
                        rediusGain+=integral;
                        orderSubVo.setObtainIntegral(orderSubVo.getIntegral()+integral);//获取的积分
                        map.put(payAmount.setScale(0,BigDecimal.ROUND_DOWN).toPlainString(),orderSubVo.getGoodsSkuId());//用于平均均摊
                    }
                }else {
                    int integral=singPrice.divide(howMuthOne,0,RoundingMode.DOWN).intValue();//采用向下取整
                    rediusGain+=integral;
                    orderSubVo.setObtainIntegral(orderSubVo.getIntegral()+integral);//获取的积分
                    map.put(singPrice.setScale(0,BigDecimal.ROUND_DOWN).toPlainString(),orderSubVo.getGoodsSkuId());//用于平均均摊
                }
            }
        }
        //判断积分是否均摊完毕
        List<OrderSubVo> goods=orderVo.getGoods();
        if (rediusGain<total){
            if (StringUtils.isNotEmpty(map)){
                map=SortUtil.sortMapByKey(map);//采用倒记均摊积分
                for (OrderSubVo orderSubVo:goods){
                    for (Map.Entry<String,String> entry:map.entrySet()){
                        if (entry.getValue().equals(orderSubVo.getGoodsSkuId())){
                            orderSubVo.setObtainIntegral(orderSubVo.getObtainIntegral()+1);//获取的积分
                            rediusGain+=1;
                            if (rediusGain==total){
                                orderVo.setGoods(goods);
                                return orderVo;
                            }
                            break;
                        }
                    }
                }
            }
            orderVo.setGoods(goods);
            return orderVo;
        }else {
            //积分已经均摊完毕
            orderVo.setGoods(goods);
            return orderVo;
        }
    }

    /**
     * 计算服务类支付积分
     * @param orderVo
     * @param howMuthOne
     * @return
     */
    public int calServiceTotalIntegalByPayAmount(OrderVo orderVo,BigDecimal howMuthOne,IntegralRuleVo rules){
        if (StringUtils.isNotEmpty(howMuthOne)&&howMuthOne.compareTo(BigDecimal.ZERO)<=0){
            return 0;
        }
        //计算待支付金额
        BigDecimal toPayAmount=calServiceTotalAmount(orderVo,rules);
        return toPayAmount.divide(howMuthOne,0,RoundingMode.DOWN).intValue();
    }

    /**
     * 进行积分均摊 服务类按照 待支付金额积分
     * @param orderVo
     * @param totalGain
     * @param howMuthOne
     * @return
     */
    public OrderVo calServiceObtainByPayAmount(OrderVo orderVo,int totalGain,BigDecimal howMuthOne,String timeCardRule,IntegralRuleVo rules){
        if(StringUtils.isNotEmpty(howMuthOne)&&howMuthOne.compareTo(BigDecimal.ZERO)<=0){
            return orderVo;
        }
        boolean flagIntegral=false;
        BigDecimal integral1=orderGoodsMegreIntegral(orderVo,rules);
        if (StringUtils.isNotEmpty(integral1)&&integral1.compareTo(BigDecimal.ZERO)>0){
            flagIntegral=true;
        }
        int rediusGain=0;//剩余积分
        BigDecimal totalAmount=calServiceTotalAmount(orderVo,rules);
        if (StringUtils.isNotEmpty(totalAmount)&&totalAmount.compareTo(BigDecimal.ZERO)<=0){
            return orderVo;
        }
        for (OrderSubVo orderSubVo:orderVo.getGoods()){
            orderSubVo.setIntegralDiscountAmount(howMuthOne);
            BigDecimal price=new BigDecimal(0.00);
            boolean flag=ConstantCommMethod.checkHaveTickets(orderSubVo.getTicketVoList(),TicketType.EXPERIENCETICKET_TYPE);
            if (flag){
                //使用体验劵
                continue;
            }
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                if (UseConstant.ZERO.equals(timeCardRule)||UseConstant.TWO.equals(timeCardRule)){
                    //购买次卡积分和不积分 都不进行积分
                    continue;
                }
            }
            if (StringUtils.isNotEmpty(orderVo.getBillingUser())||StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
                if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                    price=price.add(orderSubVo.getOriginPrice());
                }else {
                    price=price.add(orderSubVo.getMemberPrice());
                }
            }else {
                price=price.add(orderSubVo.getOriginPrice());
            }
            BigDecimal singPrice = BigDecimal.ZERO;
            singPrice = singPrice.add(price).subtract(orderSubVo.getTotalDiscount());
            //判断是否使用积分抵现
            if (flagIntegral){
                //计算积分抵现的占比
                BigDecimal priceRatio=orderSubVoExcepleIntegral(singPrice,orderVo,totalAmount,rules);
                BigDecimal payAmount=singPrice.subtract(priceRatio);
                if (payAmount.compareTo(BigDecimal.ZERO)<=0){//小于0
                    orderSubVo.setObtainIntegral(0);//获取的积分
                }else {
                    int integral=singPrice.divide(howMuthOne,0,RoundingMode.DOWN).intValue();//采用向下取整
                    rediusGain+=integral;
                    orderSubVo.setObtainIntegral(orderSubVo.getIntegral()+integral);//获取的积分
                }
            }else {
                int integral=singPrice.divide(howMuthOne,0,RoundingMode.DOWN).intValue();//采用向下取整
                rediusGain+=integral;
                orderSubVo.setObtainIntegral(orderSubVo.getIntegral()+integral);//获取的积分
            }
        }
        //判断积分是否均摊完毕
        if (rediusGain!=totalGain){
            for (OrderSubVo orderSubVo:orderVo.getGoods()){
                boolean flag=ConstantCommMethod.checkHaveTickets(orderSubVo.getTicketVoList(),TicketType.EXPERIENCETICKET_TYPE);
                if (flag){
                    //使用体验劵
                    continue;
                }
                if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                    if (UseConstant.ZERO.equals(timeCardRule)||UseConstant.TWO.equals(timeCardRule)){
                        //购买次卡积分和不积分 都不进行积分
                        continue;
                    }
                }
                rediusGain+=1;
                orderSubVo.setObtainIntegral(orderSubVo.getIntegral()+1);//获取的积分
                if (rediusGain==totalGain){//积分已经均摊完毕
                    return orderVo;
                }
            }
        }else {
            //积分已经均摊完毕
            return orderVo;
        }
        return orderVo;
    }

    /**
     * 判断会员日规则
     * @param responseDiscountVo
     * @return
     */
    public  ResponseDiscountVo checkMemberMarketDay(ResponseDiscountVo responseDiscountVo,IntegralRuleVo integralRuleVo) {
        //订单
        //积分需要执行的倍数
        List<Integer> list=new ArrayList<>();
        //新会员注册日
        if (StringUtils.isNotEmpty(integralRuleVo.getNewMemberIntegralMultiple())){
            if (StringUtils.isNotEmpty(integralRuleVo.getIsNewMember())){
                if (UseConstant.ONE.equals(integralRuleVo.getIsNewMember())){
                    OrderVo orderVo=responseDiscountVo.getOrderVo();
                    String memberCompanyId=orderVo.getMemberCompanyId();
                    if (StringUtils.isNotEmpty(memberCompanyId)){
                        MemberCompany memberCompany=memberCompanyMapper.selectByPrimaryKey(memberCompanyId);
                        if (StringUtils.isNotEmpty(memberCompany)){
                            try {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String date1Str=simpleDateFormat.format(new Date());
                                String date2Str=simpleDateFormat.format(memberCompany.getCreateTime().getTime());
                                Date date1=simpleDateFormat.parse(date1Str);
                                Date date2=simpleDateFormat.parse(date2Str);
                                if (date1.getTime()==date2.getTime()){
                                    int code=new Integer(integralRuleVo.getNewMemberIntegralMultiple());
                                    if (code!=0){
                                        list.add(code);
                                    }
                                }
                            }catch (Exception e){
                                throw new MarketException(400,"时间转换异常！");
                            }
                        }
                    }
                }
            }
        }
        //会员生日
        if (StringUtils.isNotEmpty(integralRuleVo.getMemberBirthdayIntegralMultiple())){
            if (StringUtils.isNotEmpty(integralRuleVo.getIsMemberBirthday())){
                if (UseConstant.ONE.equals(integralRuleVo.getIsMemberBirthday())){
                    OrderVo orderVo=responseDiscountVo.getOrderVo();
                    String memberCompanyId=orderVo.getMemberCompanyId();
                    if (StringUtils.isNotEmpty(memberCompanyId)){
                        MemberCompany memberCompany=memberCompanyMapper.selectByPrimaryKey(memberCompanyId);
                        if (StringUtils.isNotEmpty(memberCompany)){
                            try {
                                if (StringUtils.isNotEmpty(memberCompany.getBirthday())){
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                    String date1Str=simpleDateFormat.format(new Date());
                                    String date2Str=simpleDateFormat.format(memberCompany.getBirthday().getTime());
                                    Date date1=simpleDateFormat.parse(date1Str);
                                    Date date2=simpleDateFormat.parse(date2Str);
                                    if (date1.getTime()==date2.getTime()){
                                        int code=new Integer(integralRuleVo.getMemberBirthdayIntegralMultiple());
                                        if (code!=0){
                                            list.add(code);
                                        }
                                    }
                                }
                            }catch (Exception e){
                                throw new MarketException(400,"时间转换异常！");
                            }
                        }
                    }
                }
            }
        }
        //会员日
        if (StringUtils.isNotEmpty(integralRuleVo.getMemberDayType())){
            switch (integralRuleVo.getMemberDayType()){
                case UseConstant.ZERO://每年会员日
                    int month= DateUtil.getCurrentMonth();
                    int day= DateUtil.getCurrentDay();
                    int memberMonthStart=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMemberDayYearStartMonth()));
                    int memberMonthEnd=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMemberDayYearEndMonth()));
                    int memberDayStart=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMemberDayYearStartDay()));
                    int memberDayEnd=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMemberDayYearEndDay()));
                    if (month>=memberMonthStart&&month<=memberMonthEnd){
                        if (day>=memberDayStart&&day<=memberDayEnd){
                            int code=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMembeDayYearIntegralMultiple()));
                            if (code!=0){
                                list.add(code);
                            }
                        }
                    }
                    break;
                case UseConstant.ONE://每月会员日
                    int day1= DateUtil.getCurrentDay();
                    int memberDay=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMemberDayMonth()));
                    if (memberDay==day1){
                        int code=new Integer(ConstantCommMethod.checkIntegerIsNullOfZero(integralRuleVo.getMemberDayMonthIntegralMultiple()));
                        if (code!=0){
                            list.add(code);
                        }
                    }
                    break;
            }
        }
        //进行积分的计算
        if (StringUtils.isNotEmpty(list)&&list.size()>0){
            //计算倍数 默认添加自身的一倍
            for (int i=0;i<list.size();i++){
                if (i==list.size()-1){//最后一个添加积分
                   int index=list.get(i);
                    list.remove(i);
                    index++;
                    list.add(index);
                }
            }
            OrderVo orderVo=responseDiscountVo.getOrderVo();
            List<OrderSubVo> orderSubVoList=orderVo.getGoods();
            int integral=0;
            for (Integer code:list){
                integral+=code;
            }
            orderVo.setTotalGain(orderVo.getTotalGain()*integral);
            for (OrderSubVo orderSubVo:orderSubVoList){
                orderSubVo.setObtainIntegral(orderSubVo.getObtainIntegral()*integral);
            }
            orderVo.setGoods(orderSubVoList);
            responseDiscountVo.setOrderVo(orderVo);
        }
        return responseDiscountVo;
    }

    /**
     * 计算抵现积分比例
     * @param singPrice
     * @param orderVo
     * @return
     */
    public BigDecimal orderSubVoExcepleIntegral(BigDecimal singPrice,OrderVo orderVo,BigDecimal totalDiscount,IntegralRuleVo rules){
        BigDecimal result=new BigDecimal(0.00);
        BigDecimal price=new BigDecimal(0.00);
        BigDecimal price1=new BigDecimal(0.00);
        BigDecimal price2=new BigDecimal(0.00);
        if (singPrice.compareTo(BigDecimal.ZERO)<=0){
            return singPrice;
        }
        price=price.add(singPrice);
        BigDecimal integralPay=orderGoodsMegreIntegral(orderVo,rules);
        price1=price1.add(integralPay);
        price2=price2.add(totalDiscount);
        price1=price1.multiply(price).divide(price2,2,BigDecimal.ROUND_DOWN);
        result=result.add(price1);
        return result;
    }

    /**
     * 获取合并积分抵现 金额
     * @param orderVo
     * @return
     */
    public  BigDecimal orderGoodsMegreIntegral(OrderVo orderVo,IntegralRuleVo integralRuleVo){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        //判断是否有积分抵现和余额支付 积分抵现不参与积分 余额支付有可能不积分
        if (StringUtils.isNotEmpty(orderVo.getTicketVoList())){
            for (TicketVo ticketVo:orderVo.getTicketVoList()){
                if (!UseConstant.ONE.equals(integralRuleVo.getRechargeRule())){//储值时积分、不积分
                    if (ticketVo.getTicketType().equals(UseConstant.SEVEN)){
                        toPayAmount=toPayAmount.add(ticketVo.getTicketAmount());
                    }
                }
                if (ticketVo.getTicketType().equals(UseConstant.TEN)){//积分抵现不积分
                    toPayAmount=toPayAmount.add(ticketVo.getTicketAmount());
                }
            }
        }
        if (StringUtils.isNotEmpty(orderVo.getPayType())){
            JSONObject payTypeJson=JSONObject.parseObject(orderVo.getPayType());
            if (StringUtils.isNotEmpty(payTypeJson.getString("7"))){//积分抵现
                toPayAmount=toPayAmount.add(payTypeJson.getBigDecimal("7"));
            }
            //判断储值时是否积分
            if (!UseConstant.ONE.equals(integralRuleVo.getRechargeRule())){//储值时积分、不积分
                if (StringUtils.isNotEmpty(payTypeJson.getString("4"))){//储值
                    toPayAmount=toPayAmount.add(payTypeJson.getBigDecimal("4"));
                }
            }
        }
        return toPayAmount;
    }

    /**
     * 计算商品和次卡类支付总金额
     * @param orderVo
     * @param integralRuleVo
     * @return
     */
    public  BigDecimal calGoodsAndTimeCardTotalAmount(OrderVo orderVo,IntegralRuleVo integralRuleVo){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        for (OrderSubVo x:orderVo.getGoods()){
            if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)&&(UseConstant.TWO.equals(integralRuleVo.getTimeCardRule())||UseConstant.ONE.equals(integralRuleVo.getTimeCardRule()))){
                continue;
            }else {
                //设置积分库中不计分的商品依然不积分
                if (StringUtils.isNotEmpty(integralRuleVo.getIsNoIntegral())&&integralRuleVo.getIsNoIntegral().equals(UseConstant.ONE)){
                    if (x.getSoldIntegral()==0){
                        continue;
                    }
                }
                BigDecimal price=calOrderSubVoAmount(orderVo,x);
                BigDecimal singPrice = BigDecimal.ZERO;
                singPrice = singPrice.add(price.multiply(new BigDecimal(x.getGoodsCount()-x.getPresentNum())).subtract(x.getTotalDiscount()));
                toPayAmount =toPayAmount.add(singPrice);
            }
        }
        //判断是否需要排除积分抵现和余额支付
//        BigDecimal result=subTractIntegralOrBlance(orderVo,integralRuleVo,toPayAmount);
        return toPayAmount;
    }

    /**
     * 计算服务类支付订单总金额
     * @param orderVo
     * @param rules
     * @return
     */
    public BigDecimal calServiceTotalAmount(OrderVo orderVo,IntegralRuleVo rules){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        //计算金额
        for (OrderSubVo x:orderVo.getGoods()){
            BigDecimal price=new BigDecimal(0.00);
            boolean flag=ConstantCommMethod.checkHaveTickets(x.getTicketVoList(),TicketType.EXPERIENCETICKET_TYPE);
            if (flag){
                //使用体验劵
                continue;
            }
            if (StringUtils.isNotEmpty(x.getGoodsId())){
                if (UseConstant.ZERO.equals(rules.getTimeCardRule())||UseConstant.TWO.equals(rules.getTimeCardRule())){
                    //购买次卡积分和不积分 都不进行积分
                    continue;
                }
            }
            if (StringUtils.isNotEmpty(orderVo.getBillingUser())||StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
                if (StringUtils.isNotEmpty(x.getGoodsId())){
                    price=price.add(x.getOriginPrice());
                }else {
                    price=price.add(x.getMemberPrice());
                }
            }else {
                price=price.add(x.getOriginPrice());
            }
            BigDecimal singPrice = BigDecimal.ZERO;
            singPrice = singPrice.add(price).subtract(x.getTotalDiscount());
            toPayAmount =toPayAmount.add(singPrice);
        }
        //判断是否需要排除积分抵现和余额支付
        BigDecimal result=subTractIntegralOrBlance(orderVo,rules,toPayAmount);
        return result;
    }

    /**
     * 判断是否有积分抵现和余额支付 积分抵现不参与积分 余额支付有可能不积分
     * @param orderVo
     * @param integralRuleVo
     * @param toPayAmount
     * @return
     */
    public  BigDecimal subTractIntegralOrBlance(OrderVo orderVo,IntegralRuleVo integralRuleVo,BigDecimal toPayAmount){
        //判断是否有积分抵现和余额支付 积分抵现不参与积分 余额支付有可能不积分
        if (StringUtils.isNotEmpty(orderVo.getTicketVoList())){
            for (TicketVo ticketVo:orderVo.getTicketVoList()){
                if (!UseConstant.ONE.equals(integralRuleVo.getRechargeRule())){//储值时积分、不积分
                    if (ticketVo.getTicketType().equals(UseConstant.SEVEN)){
                        toPayAmount=toPayAmount.subtract(ticketVo.getTicketAmount());
                    }
                }
                if (ticketVo.getTicketType().equals(UseConstant.TEN)){//积分抵现不积分
                    toPayAmount=toPayAmount.subtract(ticketVo.getTicketAmount());
                }
            }
        }
        if (StringUtils.isNotEmpty(orderVo.getPayType())){
            JSONObject payTypeJson=JSONObject.parseObject(orderVo.getPayType());
            if (StringUtils.isNotEmpty(payTypeJson.getString("7"))){//积分抵现
                toPayAmount=toPayAmount.subtract(payTypeJson.getBigDecimal("7"));
            }
            //判断储值时是否积分
            if (!UseConstant.ONE.equals(integralRuleVo.getRechargeRule())){//储值时积分、不积分
                if (StringUtils.isNotEmpty(payTypeJson.getString("4"))){//储值
                    toPayAmount=toPayAmount.subtract(payTypeJson.getBigDecimal("4"));
                }
            }
        }
        return toPayAmount;
    }

    /**
     * 计算商品和次卡类子订单 待支付金额
     * @param orderVo
     * @param orderSubVo
     * @return
     */
    public BigDecimal calOrderSubVoAmount(OrderVo orderVo,OrderSubVo orderSubVo){
        //商品单价
        BigDecimal price = orderSubVo.getPrice();
        //判断是否是会员  (用总单的会员来判断就可)  是则取会员价
        if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
            price = orderSubVo.getMemberPrice();
        }
        if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&orderVo.getMemberDiscountType().equals(UseConstant.ZERO)){
            price=orderSubVo.getMemberPrice();
        }
        if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
            if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&orderVo.getMemberDiscountType().equals(UseConstant.ZERO)){
                price=orderSubVo.getMemberPrice();
            }else {
                price=new BigDecimal(orderSubVo.getSecondPrice());
            }
        }
        if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice()) && orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
            price = orderSubVo.getBargainPrice();
        }if (StringUtils.isNotEmpty(orderSubVo.getIsTimerCard()) && IsTimerCardEnum.IS_TIME_CARD.getCode().equals(String.valueOf(orderSubVo.getIsTimerCard()))){
            if (StringUtils.isNotEmpty(orderSubVo.getPriceType())){
                if (PriceTypeEnum.MEMBER_PRICE.getCode().equals(orderSubVo.getPriceType())){
                    price=orderSubVo.getPrice();
                }else {
                    price = orderSubVo.getOriginPrice();
                }
            }
        }
        return  price;
    }
}