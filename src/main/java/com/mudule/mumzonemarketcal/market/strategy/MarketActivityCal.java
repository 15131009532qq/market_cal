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
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        responseDiscountVo.setOrderVo(orderVo);
        TicketVo ticketVo = orderVo.getTicketVo();
        //判断是否能参与活动
        if (StringUtils.isNotEmpty(ticketVo)&&(TicketTypeEnum.ONE_ORDER_SUBSTRACTION.getCode().equals(ticketVo.getTicketType())||TicketTypeEnum.ONE_ORDER_DISCOUNT.getCode().equals(ticketVo.getTicketType()))&&OrderConstant.GOODSORDER.equals(orderVo.getOrderType())){
            log.info("商品类订单参与优惠活动执行优惠活动优惠策略----------->");
        }else {
            log.info("服务类、次卡类、未选择活动的不执行优惠活动优惠策略----------->");
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
        //活动类型 活动类型，0-会员拉新，1-会员关怀 ,2-整单折扣，3-整单满减 4-单品变价
        List<Byte> types=new ArrayList<>();
        types.add(new Byte(MarketActivityEnum.ONE_ORDER_DISCOUNT_1.getCode()));
        types.add(new Byte(MarketActivityEnum.ONE_ORDER_DISCOUNT_2.getCode()));
        //查询优惠活动信息
        MarketActivityExample marketActivity=new MarketActivityExample();
        marketActivity.createCriteria()
                .andOrgIdEqualTo(orderVo.getShopId())
                .andActivityTypeIn(types)
                .andActivityStateEqualTo(new Byte(MarketActivityStateEnum.START.getCode()))
                .andStatusEqualTo(new Byte(StandAndDownEnum.STAND.getCode()))
                .andDrEqualTo(new Byte(DlStatusEnum.DL_0.getCode()));
        List<MarketActivityWithBLOBs> list=marketActivityMapper.selectByExampleWithBLOBs(marketActivity);
        if (StringUtils.isNotEmpty(list)&&list.size()>0){
            //判断规则 门店全部营销活动 满减活动 满折活动
            for (MarketActivityWithBLOBs marketActivityWithBLOBs:list){
                if (ticketVo.getTicketId().equals(marketActivityWithBLOBs.getId())){
                    //判断活动金额是否满足待支付金额
                    boolean flag=checkPayAmount(marketActivityWithBLOBs,orderVo);
                    if (!flag){
                        responseDiscountVo.setOrderVo(orderVo);
                        responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                        responseDiscountVo.setCode(UseConstant.FAIL);
                        responseDiscountVo.setMsg(ErrMsgConstant.TO_PAY_AMOUNT_EXCEED_ACTIVITY_AMOUNT);
                        return responseDiscountVo;
                    }
                    switch (String.valueOf(marketActivityWithBLOBs.getActivityCrowd())){
                        case UseConstant.ZERO://全部人员
                            //判断订单是否已经使用了其他劵类
                            responseDiscountVo=marketTicketUsed(orderVo,responseDiscountVo,ticketVo,marketActivityWithBLOBs);
                            break;
                        case UseConstant.TWO://会员等级
                            try {
                                if (StringUtils.isNotEmpty(orderVo.getLevelId())){
                                    //判断会员等级是否符合
                                    String levelId=orderVo.getLevelId();
                                    String rule=marketActivityWithBLOBs.getActivityCrowdRue();
                                    String[] str=rule.split(",");
                                    for (String level:str){
                                        if (level.equals(levelId)){
                                            //查询会员等级 满足会员等级则进行活动优惠
                                            responseDiscountVo=marketTicketUsed(orderVo,responseDiscountVo,ticketVo,marketActivityWithBLOBs);
                                            return responseDiscountVo;
                                        }
                                    }
                                    responseDiscountVo.setOrderVo(orderVo);
                                    responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                                    responseDiscountVo.setCode(UseConstant.FAIL);
                                    responseDiscountVo.setMsg(ErrMsgConstant.MEMBER_LEVEL_EXCEED_ACTIVITY);
                                    return responseDiscountVo;
                                }
                                responseDiscountVo.setCode(UseConstant.SUCCESS);
                                responseDiscountVo.setMsg(ErrMsgConstant.CAL_SUCCESS);
                            }catch (Exception e){
                                log.error(ErrMsgConstant.QUERY_MEMBER_LEVEL_ERR,e);
                                responseDiscountVo.setOrderVo(orderVo);
                                responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                                responseDiscountVo.setCode(UseConstant.FAIL);
                                responseDiscountVo.setMsg(ErrMsgConstant.QUERY_MEMBER_LEVEL_ERR);
                                return responseDiscountVo;
                            }
                        default:
                            continue;
                    }
                }
            }
        }else {
            log.info("无配置的优惠活动--->不执行优惠活动策略");
        }
        return responseDiscountVo;
    }

    /**
     * 进行优惠活动优惠 均摊
     * @param orderVo
     * @param responseDiscountVo
     * @param ticketVo1
     * @param marketActivityWithBLOBs
     * @return
     */
    public ResponseDiscountVo marketTicketUsed(OrderVo orderVo,ResponseDiscountVo responseDiscountVo,TicketVo ticketVo1,MarketActivityWithBLOBs marketActivityWithBLOBs){
        //查询参与活动的商品
        //判断活动参与类型
        List<MarketActivityGoods> marketActivityGoodsList= getJoinActivityGoods(ticketVo1.getTicketId(),String.valueOf(marketActivityWithBLOBs.getJoinType()),orderVo.getShopId(),orderVo.getGoods());
        if (StringUtils.isNotEmpty(marketActivityGoodsList)&&marketActivityGoodsList.size()>0){
            //判断优惠活动中是否存在优惠商品
            List<OrderSubVo> list=orderVo.getGoods();
            List<OrderSubVo> orderSubVoList1=list.stream().filter(
                    orderSubVo -> marketActivityGoodsList.stream().anyMatch(
                            marketActivityGoods -> marketActivityGoods.getGoodsId().equals(orderSubVo.getGoodsSkuId()))
            ).collect(Collectors.toList());
            if (StringUtils.isNotEmpty(orderSubVoList1)&&orderSubVoList1.size()>0){
                List<OrderSubVo> orderSubVoList=orderSubVoList1.stream().filter(
                        orderSubVo -> marketActivityGoodsList.stream().anyMatch(
                                marketActivityGoods ->
                                        marketActivityGoods.getGoodsId().equals(orderSubVo.getGoodsSkuId())
                                                &&
                                                StringUtils.isNotEmpty(orderSubVo.getTicketVoList())
                                                        &&
                                                        orderSubVo.getTicketVoList().stream().anyMatch(
                                                                ticketVo ->
                                                                        ticketVo.getTicketType().equals(TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode())//满减劵
                                                                                ||ticketVo.getTicketType().equals(TicketTypeEnum.WITH_DISCOUNT_COUPONS_BUY.getCode())//买折劵
                                                                                ||ticketVo.getTicketType().equals(TicketTypeEnum.WITH_GIFT_COUPONS.getCode())//满赠劵
                                                                                ||ticketVo.getTicketType().equals(TicketTypeEnum.WITH_DISCOUNT_COUPONS.getCode())//折扣劵
                                                                                ||ticketVo.getTicketType().equals(TicketTypeEnum.ONE_ORDER_DISCOUNT.getCode())//满减活动
                                                                                ||ticketVo.getTicketType().equals(TicketTypeEnum.ONE_ORDER_SUBSTRACTION.getCode()))//满折活动
                )).collect(Collectors.toList());
                //判断子商品是否使用了其他均摊
                if (StringUtils.isNotEmpty(orderSubVoList)&&orderSubVoList.size()>0){
                    responseDiscountVo.setOrderVo(orderVo);
                    responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                    responseDiscountVo.setCode(UseConstant.FAIL);
                    responseDiscountVo.setMsg(ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET);
                    return responseDiscountVo;
                }else {
                    //进行活动均摊
                    BigDecimal amount=marketActivityWithBLOBs.getLimitAmount();
                    BigDecimal activityAmount=marketActivityWithBLOBs.getDiscountAmount();
                    responseDiscountVo=activityDiscountCal(orderVo,responseDiscountVo,orderVo.getGoods(),marketActivityGoodsList,amount,activityAmount,ticketVo1);
                    return responseDiscountVo;
                }
            }
        }
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
        responseDiscountVo.setCode(UseConstant.FAIL);
        responseDiscountVo.setMsg(ErrMsgConstant.NO_JOIN_MARKET_GOODS);
        return responseDiscountVo;
    }
    /**
     * 计算商品均摊
     * @param orderVo
     * @param goods
     * @param ticketAmount
     * @param payAmount
     * @return
     */
    public CalDiscontActivityVo ticketCal(OrderVo orderVo, List<OrderSubVo> goods,BigDecimal ticketAmount, BigDecimal payAmount,String memberTicketId,String name){
        //优惠券均摊到每个商品
        //计算优惠比例
        BigDecimal amount=new BigDecimal(0.00);
        amount=amount.add(ticketAmount);
        BigDecimal bilibili = ticketAmount.divide(payAmount,8, RoundingMode.DOWN);
        BigDecimal residueTicAmount = new BigDecimal(0.00);
        for (int i = 0; i<goods.size() ; i++){
            OrderSubVo orderSubVo = goods.get(i);
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            if (ticketVoList == null){
                ticketVoList = new ArrayList<>();
            }
            TicketVo ticketVo = new TicketVo();
            BigDecimal memberPrice=calOrderSubVoAmount(orderVo,orderSubVo);
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
            if (orderSubVo.getGoodsCount() == 0){
                count = 1;
            }
            if (count==0&&StringUtils.isNotEmpty(orderSubVo)){
                count=0;
            }
            BigDecimal singlePrice = memberPrice.multiply(new BigDecimal(count));
            BigDecimal totalDIscount = BigDecimal.ZERO;
            //计算实付金额
            if (orderSubVo.getTotalDiscount() != null && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                totalDIscount = orderSubVo.getTotalDiscount();
                singlePrice = singlePrice.subtract(totalDIscount);
            }
            //进行优惠均摊
            if (i == goods.size()-1){//如果是最后一个商品
                if (singlePrice.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                    //如果大于0 则表示 该商品可以全部均摊剩余优惠
                    orderSubVo.setTotalDiscount(totalDIscount.add(ticketAmount.subtract(residueTicAmount)));
                    //追加满减活动
                    ticketVo.setTicketId(memberTicketId);
                    ticketVo.setTicketAmount(ticketAmount);
                    ticketVo.setTicketName(name);
                    ticketVo.setTicketType(TicketTypeEnum.ONE_ORDER_SUBSTRACTION.getCode());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                }else {//商品 不能全部均摊剩余优惠
                    orderSubVo.setTotalDiscount(totalDIscount.add(singlePrice));//能均摊的最大金额
                    //追加满减活动
                    ticketVo.setTicketId(memberTicketId);
                    ticketVo.setTicketAmount(ticketAmount);
                    ticketVo.setTicketType(TicketTypeEnum.ONE_ORDER_SUBSTRACTION.getCode());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                    residueTicAmount = residueTicAmount.add(singlePrice);
                    for (int j = 0 ; j<goods.size() ; j++){
                        //将剩余金额 均摊带其他商品上
                        OrderSubVo orderSubVo1 = goods.get(j);
                        BigDecimal memberPrice1 = orderSubVo.getMemberPrice();//会员价
                        if (orderSubVo1.getBargainPrice() != null ||orderSubVo1.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
                            memberPrice1 = orderSubVo1.getBargainPrice();
                        }
                        int count1 = orderSubVo1.getGoodsCount()-orderSubVo1.getPresentNum();//TODO 排除赠品
                        if (orderSubVo1.getGoodsCount() == 0){
                            count1 = 1;
                        }
                        if (count1==0&&StringUtils.isNotEmpty(orderSubVo1)){
                            count1=0;
                        }
                        BigDecimal singlePrice1 = memberPrice1.multiply(new BigDecimal(count1));
                        BigDecimal totalDIscount1 = BigDecimal.ZERO;
                        if (orderSubVo1.getTotalDiscount() != null && orderSubVo1.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                            totalDIscount1 = orderSubVo1.getTotalDiscount();
                            singlePrice1 = singlePrice1.subtract(totalDIscount1);
                        }
                        if (singlePrice1.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                            orderSubVo1.setTotalDiscount(totalDIscount1.add(ticketAmount.subtract(residueTicAmount)));
                            break;
                        }else {
                            orderSubVo1.setTotalDiscount(totalDIscount1.add(singlePrice1));//能均摊的最大金额
                            residueTicAmount = residueTicAmount.add(singlePrice1);
                        }
                    }
                }
            }else{
                BigDecimal newTotalDiscount = singlePrice.multiply(bilibili).setScale(2,RoundingMode.DOWN);
                //避免超出优惠金额
                if (newTotalDiscount.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                    orderSubVo.setTotalDiscount(totalDIscount.add(ticketAmount.subtract(residueTicAmount)));
                }else {
                    orderSubVo.setTotalDiscount(totalDIscount.add(newTotalDiscount));
                }
                residueTicAmount = residueTicAmount.add(newTotalDiscount);
                ticketVo.setTicketId(memberTicketId);
                ticketVo.setTicketAmount(ticketAmount);
                ticketVo.setTicketType(TicketTypeEnum.ONE_ORDER_SUBSTRACTION.getCode());
                ticketVoList.add(ticketVo);
                orderSubVo.setTicketVoList(ticketVoList);
            }
        }
        CalDiscontActivityVo calDiscontActivityVo=new CalDiscontActivityVo();
        calDiscontActivityVo.setOrderSubVoList(goods);
        calDiscontActivityVo.setDiscountAmount(amount);
        return calDiscontActivityVo;
    }

    /**
     * 计算待支付金额
     * @param orderSubVoList
     * @return
     */
    public BigDecimal calculatePayAmount(List<OrderSubVo> orderSubVoList,OrderVo orderVo){
        BigDecimal payAmount = BigDecimal.ZERO;
        for (int i= 0; i <orderSubVoList.size() ; i++){
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            BigDecimal memberPrice=calOrderSubVoAmount(orderVo,orderSubVo);
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();//TODO 排除赠品商品
            if (orderSubVo.getGoodsCount() == 0){
                count = 1;
            }
            if (count==0&&StringUtils.isNotEmpty(orderSubVo)){
                count=0;
            }
            BigDecimal singlePrice = memberPrice.multiply(new BigDecimal(count));
            if (orderSubVo.getTotalDiscount() != null && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                BigDecimal totalDIscount = orderSubVo.getTotalDiscount();
                singlePrice.subtract(totalDIscount);
            }
            payAmount = payAmount.add(singlePrice);

        }
        return payAmount;
    }

    /**
     * 判断待支付金额是否满足 营销活动金额
     * @param marketActivityWithBLOBs
     * @param orderVo
     * @return
     */
    public boolean checkPayAmount(MarketActivityWithBLOBs marketActivityWithBLOBs,OrderVo orderVo){
        BigDecimal toPayMoney=calculatePayAmount(orderVo.getGoods(),orderVo);
        BigDecimal activityAmount=marketActivityWithBLOBs.getLimitAmount();
        if (toPayMoney.compareTo(activityAmount)<0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 计算活动折扣均摊
     * @param orderVo
     * @param responseDiscountVo
     * @param orderSubVo
     * @param marketActivityGoodsList
     * @param activityJoinAmount
     * @param ticketVo
     * @return
     */
    public ResponseDiscountVo activityDiscountCal(OrderVo orderVo,ResponseDiscountVo responseDiscountVo,List<OrderSubVo> orderSubVo,List<MarketActivityGoods> marketActivityGoodsList,BigDecimal activityJoinAmount,BigDecimal discountAmount,TicketVo ticketVo){
        BigDecimal payAmount=BigDecimal.ZERO;
        List<OrderSubVo> calOrderSubVo = new ArrayList<>();
        CalDiscontActivityVo calDiscontActivityVo=null;
        //如果返回空 则表示 没有可以参与优惠活动的商品
        calOrderSubVo = this.calculateJoinGoods(orderSubVo,marketActivityGoodsList);
        //计算参与的商品总金额
        if (calOrderSubVo.size()>0){
            payAmount = this.calculatePayAmount(calOrderSubVo,orderVo);
            if (payAmount.compareTo(activityJoinAmount) >= 0){
                switch (ticketVo.getTicketType()){
                    case UseConstant.EIGHT://满减活动
                        calDiscontActivityVo = this.ticketCal(orderVo,calOrderSubVo,discountAmount,payAmount,ticketVo.getTicketId(),ticketVo.getTicketName());
                        calOrderSubVo=calDiscontActivityVo.getOrderSubVoList();
                        break;
                    case UseConstant.NINE://满折活动
                        BigDecimal payDiscount= calDiscountAmount(calOrderSubVo,orderVo,discountAmount);
                        calDiscontActivityVo= this.ticketCal(orderVo,calOrderSubVo,payDiscount,payAmount,ticketVo.getTicketId(),ticketVo.getTicketName());
                        calOrderSubVo=calDiscontActivityVo.getOrderSubVoList();
                        break;
                    default:
                        responseDiscountVo.setCode(UseConstant.FAIL);
                        responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                        responseDiscountVo.setMsg(ErrMsgConstant.ACTIVITY_TYPE_ERR);
                        responseDiscountVo.setOrderVo(orderVo);
                        return responseDiscountVo;
                }
            }else{
                responseDiscountVo.setCode(UseConstant.FAIL);
                responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                responseDiscountVo.setMsg(ErrMsgConstant.TO_PAY_AMOUNT_EXCEED_ACTIVITY_AMOUNT);
                responseDiscountVo.setOrderVo(orderVo);
                return responseDiscountVo;
            }
            //将参与优惠和不参与的商品 进行合并
            for (int i =0;i <orderSubVo.size(); i++){
                OrderSubVo orderSubVo1 = orderSubVo.get(i);
                for (int j =0 ;j>calOrderSubVo.size() ;j++){
                    OrderSubVo order = calOrderSubVo.get(j);
                    if (orderSubVo1.getGoodsSkuId().equals(order.getGoodsSkuId())){
                        orderSubVo1.setTotalDiscount(order.getTotalDiscount());//优惠均摊
                        orderSubVo1.setTicketVoList(order.getTicketVoList());//优惠列表
                        break;
                    }
                }
            }
            orderVo.setGoods(orderSubVo);
        }else{
            responseDiscountVo.setCode(UseConstant.FAIL);
            responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
            responseDiscountVo.setMsg(ErrMsgConstant.NO_JOIN_MARKET_GOODS);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        List<DiscountItem> discountItems = new ArrayList<>();
        DiscountItem discountItem = new DiscountItem();
        discountItem.setId(ticketVo.getTicketId());
        discountItem.setDiscount(calDiscontActivityVo.getDiscountAmount());
        discountItem.setDiscountType(ticketVo.getTicketType());
        discountItem.setName(ticketVo.getTicketName());
        discountItems.add(discountItem);
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        responseDiscountVo.setDiscountItem(discountItems);
        return responseDiscountVo;
    }

    /**
     * 优惠活动可参与活动商品
     * @param orderSubVoList
     * @param marketActivityGoodsList
     * @return
     */
    public List<OrderSubVo> calculateJoinGoods(List<OrderSubVo> orderSubVoList,List<MarketActivityGoods> marketActivityGoodsList){
        List<OrderSubVo> result = new ArrayList<>();
        for (int i = 0; i < orderSubVoList.size(); i++) {
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            for (int j = 0; j < marketActivityGoodsList.size(); j++) {
                MarketActivityGoods marketActivityGoods= marketActivityGoodsList.get(j);
                if (orderSubVo.getGoodsSkuId().equals(marketActivityGoods.getGoodsId())) {
                    result.add(orderSubVo);
                }
            }
        }
        return result;
    }

    /**
     * 获取参与活动商品
     * @param id
     * @param jsonType
     * @return
     */
    public List<MarketActivityGoods> getJoinActivityGoods(String id,String jsonType,String shopId,List<OrderSubVo> list){
        List<MarketActivityGoods> marketActivityGoodsList=new ArrayList<>();
        MarketActivityGoodsExample marketActivityGoodsExample=new MarketActivityGoodsExample();
        switch (jsonType){
            case ActivityJoinType.ALL_JOIN://全部参与
                for (OrderSubVo orderSubVo:list){
                    MarketActivityGoods marketActivityGoods=new MarketActivityGoods();
                    marketActivityGoods.setActivityId(id);
                    marketActivityGoods.setGoodsId(orderSubVo.getGoodsSkuId());
                    marketActivityGoods.setGoodsSkuId(orderSubVo.getGoodsSkuId());
                    marketActivityGoodsList.add(marketActivityGoods);
                }
                break;
            case ActivityJoinType.APPOINT_JOIN://指定参与
                marketActivityGoodsExample.createCriteria()
                        .andActivityIdEqualTo(id);
                marketActivityGoodsList=marketActivityGoodsMapper.selectByExample(marketActivityGoodsExample);
                break;
            case ActivityJoinType.APPOINT_NOT_JOIN://指定不参与 TODO 暂时没有
                default:
                    return null;

        }
        return marketActivityGoodsList;
    }

    /**
     * 计算折扣总金额
     * @param list
     * @param orderVo
     * @param discountAmount
     * @return
     */
    public BigDecimal calDiscountAmount(List<OrderSubVo> list,OrderVo orderVo,BigDecimal discountAmount){
        BigDecimal result=new BigDecimal(0.00);
        BigDecimal one=new BigDecimal("1");
        BigDecimal payDiscount=new BigDecimal(0.00);
        payDiscount=payDiscount.add(one.subtract(discountAmount));
        for (OrderSubVo orderSubVo:list){
            BigDecimal memberPrice=calOrderSubVoAmount(orderVo,orderSubVo);
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
            if (orderSubVo.getGoodsCount() == 0){
                count = 1;
            }
            if (count==0&&StringUtils.isNotEmpty(orderSubVo)){
                count=0;
            }
            BigDecimal singlePrice = memberPrice.multiply(new BigDecimal(count));
            singlePrice=singlePrice.subtract(orderSubVo.getTotalDiscount());
            result=result.add(singlePrice.multiply(payDiscount));
        }
        return result;
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
