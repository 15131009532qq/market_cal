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
     *
     *
     *           3、计次卡订单:
     *
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------->满减劵计算");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();//结果集
        responseDiscountVo.setOrderVo(orderVo);
        //1、判断满减劵的适用规则
        TicketVo ticketVo = orderVo.getTicketVo();
        if (ticketVo.getTicketType() != null && ticketVo.getTicketType().equals(TicketType.DISCOUNTCOUPONS)){
            if (UseConstant.FAIL.equals(responseDiscountVo.getCode())){
                return responseDiscountVo;
            }
            log.info("使用了满减劵--------->执行满减劵优惠策略");
            //2、使用了优惠券--->进行优惠券的使用和优惠券均摊
            if (orderVo.getOrderType().equals(OrderConstant.GOODSORDER)){
                responseDiscountVo = this.goodsMarket(orderVo,ticketVo,null);
            }else if (orderVo.getOrderType().equals(OrderConstant.SERVICEORDER)){
                responseDiscountVo = this.serviceMarket(orderVo,ticketVo);
            }else if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)){
                responseDiscountVo = this.goodsMarket(orderVo,ticketVo,OrderConstant.TIMESCARDORDER);
            }
        }else {
            log.info("未使用满减劵--------->不执行满减劵优惠策略");
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
        return responseDiscountVo;
    }

    /**
     * 商品优惠券 均摊
     * @param orderVo
     * @return
     */
    public ResponseDiscountVo goodsMarket(OrderVo orderVo,TicketVo ticketVo,String goodsType){
        String ticketId = ticketVo.getTicketId();
        ResponseDiscountVo responseDiscountVo = new ResponseDiscountVo();
        //获取商品列表
        List<OrderSubVo> orderSubVo = orderVo.getGoods();
        if (StringUtils.isEmpty(goodsType)){
          List<GoodsShop> list=goodsShopMapper.selectByPrimaryKeys(orderSubVo.stream().map(OrderSubVo::getGoodsSkuId).collect(Collectors.toList()));
            for (int i =0;i<orderSubVo.size();i++){
                OrderSubVo subVo = orderSubVo.get(i);
                for (int j=0;j<list.size();j++){
                    GoodsShop goodsShop=list.get(j);
                    if (goodsShop.getId().equals(subVo.getGoodsSkuId())){
                        subVo.setGoodsCompanyId(goodsShop.getGoodsCompanyId());
                        break;
                    }
                }
            }
        }else {
            for (int i =0;i<orderSubVo.size();i++){
                OrderSubVo subVo = orderSubVo.get(i);
                subVo.setGoodsCompanyId(subVo.getGoodsId());
            }
        }
        //判断优惠券的类型
        MarketTicket marketTicket = marketTicketMapper.selectById(ticketId);
        if (StringUtils.isEmpty(marketTicket)){
            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.TICKET_INFO_ERR,orderVo);
            return responseDiscountVo;
        }
        //判断优惠券类型
        MarketTicketApplyType marketTicketApplyType=getMarketTicketApplyTypeByOrderType(ticketId,orderVo);
        //查询满减券对应可用的商品
        List<MarketTicketGoods> marketTicketGoodsList = marketTicketGoodsMapper.selectByTicketId(ticketId);
        BigDecimal payAmount = BigDecimal.ZERO;
        if(StringUtils.isNotEmpty(marketTicketApplyType)&&String.valueOf(marketTicketApplyType.getJoinType()).equals(UseConstant.ZERO)){//全部类型参与
            //剔除已经参加了优惠券的商品或者次卡
            List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(orderSubVo);
            //计算当前订单金额
            if (calOrderSubVo.size()>0) {
                //如果返回空 则表示 没有可以参与优惠的商品
                if (checkGoodsUsedDiscount(calOrderSubVo)) {
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET, orderVo);
                    return responseDiscountVo;
                }
                //判断是否满足限额
                if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                    return responseDiscountVo;
                }
                //计算当前订单金额
                payAmount = this.calculatePayAmount(orderVo.getGoods(),orderVo);
                if (payAmount.compareTo(marketTicket.getLimitAmount()) >=0){
                    orderSubVo = this.ticketCal(orderVo, orderSubVo, marketTicketGoodsList, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                    orderVo.setGoods(orderSubVo);
                }else{
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName()+ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                    return responseDiscountVo;
                }
            }else {
                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                return responseDiscountVo;
            }
        }else if (StringUtils.isNotEmpty(marketTicketApplyType)&&String.valueOf(marketTicketApplyType.getJoinType()).equals(UseConstant.ONE)&&String.valueOf(marketTicketApplyType.getIsUse()).equals(UseConstant.ZERO)){//指定参与
             //如果返回空 则表示 没有可以参与优惠的商品
            List<OrderSubVo> joinTicketGoodsSubVo = this.calculateJoinGoods(orderSubVo,marketTicketGoodsList);
            //剔除已经参加了优惠券的商品或者次卡
            List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
             //计算参与的商品总金额
            if (calOrderSubVo.size()>0){
                //判断是否参与优惠
                if (checkGoodsUsedDiscount(calOrderSubVo)){
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                    return responseDiscountVo;
                }
                //判断是否满足限额
                if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                    return responseDiscountVo;
                }
                payAmount = this.calculatePayAmount(calOrderSubVo,orderVo);
                if (payAmount.compareTo(marketTicket.getLimitAmount()) >= 0){
                    calOrderSubVo = this.ticketCal(orderVo,calOrderSubVo,marketTicketGoodsList,marketTicket.getTicketAmount(),payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                }else{
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                    return responseDiscountVo;
                }
                //将参与优惠和不参与的商品 进行合并
                unionAllMarketAndNoMarketCollection(orderSubVo,calOrderSubVo,orderVo);
            }else{
                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                return responseDiscountVo;
            }
        }else if (StringUtils.isNotEmpty(marketTicketApplyType)&&String.valueOf(marketTicketApplyType.getJoinType()).equals(UseConstant.ONE)&&String.valueOf(marketTicketApplyType.getIsUse()).equals(UseConstant.ONE)){//指定不参与
            //如果是指定不参与的商品 则返回的是 不参与的商品  如果为空则说明全都可以参与优惠
            List<OrderSubVo> noCalOrderSubVo = this.calculateJoinGoods(orderSubVo,marketTicketGoodsList);
            if (noCalOrderSubVo.size()>0){
                //计算参与的商品总金额
                //如果有 不参与的商品 则排除不参与的商品 得到参与优惠的商品 计算优惠均摊
                List<OrderSubVo> joinTicketGoodsSubVo =getJoinGoodsOrderMarketCollection(orderSubVo,noCalOrderSubVo);
                //剔除已经参加了优惠券的商品或者次卡
                List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
                if (StringUtils.isNotEmpty(calOrderSubVo)&&calOrderSubVo.size()>0){
                    //判断参与的商品是否有其他优惠
                    if (checkGoodsUsedDiscount(calOrderSubVo)){
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                    //判断是否满足限额
                    if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                        return responseDiscountVo;
                    }
                    payAmount = this.calculatePayAmount(calOrderSubVo,orderVo);
                    if (payAmount.compareTo(marketTicket.getLimitAmount()) >= 0){
                        //计算均摊
                        calOrderSubVo = this.ticketCal(orderVo,calOrderSubVo,marketTicketGoodsList,marketTicket.getTicketAmount(),payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                    }else{
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                        return responseDiscountVo;
                    }
                    calOrderSubVo.addAll(noCalOrderSubVo);
                    orderVo.setGoods(calOrderSubVo);
                }else {
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                    return responseDiscountVo;
                }
            }else {
                //剔除已经参加了优惠券的商品或者次卡
                List<OrderSubVo> joinTicketGoodsSubVo = this.removeOrderSubVo(orderVo.getGoods());
                //剔除已经参加了优惠券的商品或者次卡
                List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
                if (StringUtils.isNotEmpty(calOrderSubVo)&&calOrderSubVo.size()>0){
                    //判断参与的商品是否有其他优惠
                    if (checkGoodsUsedDiscount(calOrderSubVo)){
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                    //判断是否满足限额
                    if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                        return responseDiscountVo;
                    }
                    //计算优惠均摊
                    payAmount = this.calculatePayAmount(calOrderSubVo,orderVo);
                    if (payAmount.compareTo(marketTicket.getLimitAmount()) >=0){
                        orderSubVo = this.ticketCal(orderVo, orderSubVo, marketTicketGoodsList, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                        orderVo.setGoods(orderSubVo);
                    }else{
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                        return responseDiscountVo;
                    }
                }else {
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                    return responseDiscountVo;
                }
            }
        }else if (StringUtils.isNotEmpty(marketTicketApplyType)&&String.valueOf(marketTicketApplyType.getJoinType()).equals(UseConstant.TWO)){//指定品牌或者分类
            //查询品类
            MarketTicketGoodsConditionExample marketTicketGoodsConditionExample=new MarketTicketGoodsConditionExample();
            marketTicketGoodsConditionExample.createCriteria().andTicketIdEqualTo(ticketId);
            List<MarketTicketGoodsCondition> marketTicketGoodsConditionList=marketTicketGoodsConditionMapper.selectByExample(marketTicketGoodsConditionExample);
            //按照优惠券ID 品牌ID集合
            //品牌集合
            List<String> brandIds=new ArrayList<>();
            //分类集合
            List<String> classifyIds=new ArrayList<>();
            if (StringUtils.isNotEmpty(marketTicketGoodsConditionList)){
                Map<String,List<MarketTicketGoodsCondition>> maps= marketTicketGoodsConditionList.stream().collect(Collectors.groupingBy(x->String.valueOf(x.getConditionType())));
                for (Map.Entry<String,List<MarketTicketGoodsCondition>> entry:maps.entrySet()){
                    if (entry.getKey().equals(UseConstant.ZERO)){//品牌
                        if (StringUtils.isNotEmpty(entry.getValue())&&entry.getValue().size()>0){
                            brandIds=entry.getValue().stream().map(MarketTicketGoodsCondition::getConditionId).collect(Collectors.toList());
                        }
                    }
                    if (entry.getKey().equals(UseConstant.ONE)){//分类
                        if (StringUtils.isNotEmpty(entry.getValue())&&entry.getValue().size()>0){
                            classifyIds=entry.getValue().stream().map(MarketTicketGoodsCondition::getConditionId).collect(Collectors.toList());
                        }
                    }
                }
            }
            //组装商品ID集合
            List<String> goodsIds=orderSubVo.stream().map(OrderSubVo::getGoodsSkuId).collect(Collectors.toList());
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("shopId",orderVo.getShopId());
            jsonObject.put("goodsIds",goodsIds.toString());
            jsonObject.put("brandIds",brandIds.toString());
            jsonObject.put("classifyIds",classifyIds.toString());
            List<String> ids=feiginService.getGoodsList(jsonObject);
            if (String.valueOf(marketTicketApplyType.getIsUse()).equals(UseConstant.ZERO)){//指定品牌或者分类参与
                if (brandIds.size()==0&&classifyIds.size()==0){//全部参与
                    //剔除已经参加了优惠券的商品或者次卡
                    List<OrderSubVo> joinTicketGoodsSubVo = this.removeOrderSubVo(orderVo.getGoods());
                    //剔除已经参加了优惠券的商品或者次卡
                    List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
                    if (StringUtils.isNotEmpty(calOrderSubVo)&&calOrderSubVo.size()>0) {
                        if (checkGoodsUsedDiscount(calOrderSubVo)) {
                            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET, orderVo);
                            return responseDiscountVo;
                        }
                        //判断是否满足限额
                        if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                            return responseDiscountVo;
                        }
                        //计算当前订单金额
                        payAmount = this.calculatePayAmount(orderVo.getGoods(),orderVo);
                        if (payAmount.compareTo(marketTicket.getLimitAmount()) >=0){
                            orderSubVo = this.ticketCal(orderVo, orderSubVo, marketTicketGoodsList, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                            orderVo.setGoods(orderSubVo);
                        }else{
                            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                            return responseDiscountVo;
                        }
                    }else {
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                }else {
                    if (StringUtils.isNotEmpty(ids)&&ids.size()>0){
                        //指定参与
                        //如果返回空 则表示 没有可以参与优惠的商品
                        List<OrderSubVo> calOrderSubVo1 =orderSubVo.stream().filter(x-> ids.stream().anyMatch(y->x.getGoodsSkuId().equals(y))).collect(Collectors.toList());
                        //剔除已经参加了优惠券的商品或者次卡
                        List<OrderSubVo> joinTicketGoodsSubVo = this.removeOrderSubVo(calOrderSubVo1);
                        //剔除已经参加了优惠券的商品或者次卡
                        List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
                        if (StringUtils.isNotEmpty(calOrderSubVo)&&calOrderSubVo.size()>0) {
                            if (checkGoodsUsedDiscount(calOrderSubVo)){
                                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                                return responseDiscountVo;
                            }
                            //判断是否满足限额
                            if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                                return responseDiscountVo;
                            }
                            //计算均摊
                            payAmount = this.calculatePayAmount(calOrderSubVo,orderVo);
                            if (payAmount.compareTo(marketTicket.getLimitAmount()) >= 0){
                                calOrderSubVo = this.ticketCal(orderVo,calOrderSubVo,marketTicketGoodsList,marketTicket.getTicketAmount(),payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                            }else{
                                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                                return responseDiscountVo;
                            }
                            //将参与优惠和不参与的商品 进行合并
                            unionAllMarketAndNoMarketCollection(orderSubVo,calOrderSubVo,orderVo);
                        }else{
                            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                            return responseDiscountVo;
                        }
                    }else {
                        //说明没有商品参与优惠
                    }
                }
            }else if (String.valueOf(marketTicketApplyType.getIsUse()).equals(UseConstant.ONE)){//指定品牌或者分类不参与
                if (brandIds.size()==0&&classifyIds.size()==0){
                    //全部不参与
                }else {
                        List<OrderSubVo>  noCalOrderSubVo =new ArrayList<>();
                        //如果是指定不参与的商品 则返回的是 不参与的商品  如果为空则说明全都可以参与优惠
                        if (StringUtils.isNotEmpty(ids)&&ids.size()>0){
                            noCalOrderSubVo = orderSubVo.stream().filter(x-> ids.stream().anyMatch(y->x.getGoodsSkuId().equals(y))).collect(Collectors.toList());
                        }
                        if (noCalOrderSubVo.size()>=0){
                            //如果有 不参与的商品 则排除不参与的商品 后 计算优惠均摊
                            List<OrderSubVo> calOrderSubVo1 =getJoinGoodsOrderMarketCollection(orderSubVo,noCalOrderSubVo);
                            //剔除已经参加了优惠券的商品或者次卡
                            List<OrderSubVo> joinTicketGoodsSubVo = this.removeOrderSubVo(calOrderSubVo1);
                            //剔除已经参加了优惠券的商品或者次卡
                            List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
                            if (StringUtils.isNotEmpty(calOrderSubVo)&&calOrderSubVo.size()>0){
                                //判断参与的商品是否有其他优惠
                                if (checkGoodsUsedDiscount(calOrderSubVo)){
                                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                                    return responseDiscountVo;
                                }
                                //判断是否满足限额
                                if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                                    return responseDiscountVo;
                                }
                                //计算均摊
                                payAmount = this.calculatePayAmount(calOrderSubVo,orderVo);
                                if (payAmount.compareTo(marketTicket.getLimitAmount()) >= 0){
                                    calOrderSubVo = this.ticketCal(orderVo,calOrderSubVo,marketTicketGoodsList,marketTicket.getTicketAmount(),payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                                }else{
                                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                                    return responseDiscountVo;
                                }
                                //UNION ALL
                                calOrderSubVo.addAll(noCalOrderSubVo);
                                orderVo.setGoods(calOrderSubVo);
                            }else {
                                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                                return responseDiscountVo;
                            }
                        }else {
                            //剔除已经参加了优惠券的商品或者次卡
                            List<OrderSubVo> joinTicketGoodsSubVo = this.removeOrderSubVo(orderVo.getGoods());
                            //剔除已经参加了优惠券的商品或者次卡
                            List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(joinTicketGoodsSubVo);
                            if (StringUtils.isNotEmpty(calOrderSubVo)&&calOrderSubVo.size()>0){
                                //判断参与的商品是否有其他优惠
                                if (checkGoodsUsedDiscount(calOrderSubVo)){
                                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                                    return responseDiscountVo;
                                }
                                //判断是否满足限额
                                if (!checkTicketLimit(calOrderSubVo, orderVo, marketTicket)) {
                                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo, UseConstant.FAIL, ErrCodeConstant.TIMECARDERR, ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT, orderVo);
                                    return responseDiscountVo;
                                }
                                //没有不参与的商品计算均摊
                                payAmount = this.calculatePayAmount(orderVo.getGoods(),orderVo);
                                if (payAmount.compareTo(marketTicket.getLimitAmount()) >=0){
                                    orderSubVo = this.ticketCal(orderVo, orderSubVo, null, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                                    orderVo.setGoods(orderSubVo);
                                }else{
                                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName() + ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                                    return responseDiscountVo;
                                }
                            }else {
                                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_GOODS_NO_JOIN_MARKET,orderVo);
                                return responseDiscountVo;
                            }
                        }
                }
            }
        }
        ConstantCommMethod.setResponseDiscountItemsBasicInfo(ticketVo,marketTicket,orderVo,responseDiscountVo,UseConstant.SUCCESS);
        return responseDiscountVo;
    }

    /**
     * 服务优惠券均摊
     * @param orderVo
     * @return
     */
    public ResponseDiscountVo serviceMarket(OrderVo orderVo,TicketVo ticketVo){
        String ticketId = ticketVo.getTicketId();
        ResponseDiscountVo responseDiscountVo = new ResponseDiscountVo();//结果集
        //获取服务列表
        List<OrderSubVo> orderSubVo = orderVo.getGoods();
        //判断优惠券的类型
        MarketTicket marketTicket = marketTicketMapper.selectById(ticketId);
        if (StringUtils.isEmpty(marketTicket)){
            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.TICKET_INFO_ERR,orderVo);
            return responseDiscountVo;
        }
        MarketTicketApplyType marketTicketApplyType=getMarketTicketApplyTypeByOrderType(ticketId,orderVo);
        //查询满减券对应可用的商品
        List<MarketTicketGoods> marketTicketGoodsList = marketTicketGoodsMapper.selectByTicketId(ticketId);
        BigDecimal payAmount = BigDecimal.ZERO;
        if(StringUtils.isNotEmpty(marketTicketApplyType)&&String.valueOf(marketTicketApplyType.getJoinType()).equals(UseConstant.ZERO)){//全部类型参与
            //剔除已经参加了优惠券和体验券的服务
            List<OrderSubVo> calOrderSubVo = this.removeOrderSubVo(orderSubVo);
            //计算当前订单金额
            if (calOrderSubVo.size()>0){
                //如果返回空 则表示 没有可以参与优惠的商品
                if (checkGoodsUsedDiscount(calOrderSubVo)){
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                    return responseDiscountVo;
                }
                //判断是否满足限额
                if (!checkTicketLimit(calOrderSubVo,orderVo,marketTicket)){
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName()+ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                    return responseDiscountVo;
                }
                //进行优惠均摊
                payAmount = this.serviceCalculatePayAmount(calOrderSubVo,orderVo);
                if (payAmount.compareTo(marketTicket.getLimitAmount()) >=0){
                    calOrderSubVo = this.serviceTicketCal(orderVo, calOrderSubVo, marketTicketGoodsList, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                    //将参与优惠和不参与的服务 进行合并
                    orderSubVo = this.addAllServices(orderSubVo,calOrderSubVo);
                    orderVo.setGoods(orderSubVo);
                }else{
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName()+ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                    return responseDiscountVo;
                }
            } else{
                ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                return responseDiscountVo;
            }
        }else if (StringUtils.isNotEmpty(marketTicketApplyType)&&String.valueOf(marketTicketApplyType.getJoinType()).equals(UseConstant.ONE)){//指定参与或者不参与
            if (String.valueOf(marketTicketApplyType.getIsUse()).equals(UseConstant.ZERO)){//指定服务可参加
                //如果返回空 则表示 没有可以参与优惠的服务
                List<OrderSubVo> calOrderSubVo = this.serviceCalculateJoinGoods(orderSubVo,marketTicketGoodsList);
                //计算参与的服务总金额
                if (calOrderSubVo.size()>0) {
                    //判断服务是否可用
                    List<OrderSubVo> list1=calOrderSubVo.stream().filter(x->
                            marketTicketGoodsList.stream().anyMatch(y -> x.getServiceId().equals(y.getGoodsId()))
                    ).collect(Collectors.toList());
                    //如果返回空 则表示 没有可以参与优惠的商品
                    if (checkGoodsUsedDiscount(list1)){
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                    //判断使用限额
                    if (!checkTicketLimit(list1,orderVo,marketTicket)){
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                        return responseDiscountVo;
                    }
                    //计算均摊
                    payAmount = this.serviceCalculatePayAmount(calOrderSubVo,orderVo);
                    if (payAmount.compareTo(marketTicket.getLimitAmount()) >= 0) {
                        calOrderSubVo = this.serviceTicketCal(orderVo, calOrderSubVo, marketTicketGoodsList, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                    } else {
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.SERVICE_NO_EQ_TICKET_AMOUNT,orderVo);
                        return responseDiscountVo;
                    }
                    //将参与优惠和不参与的服务 进行合并
                    orderSubVo = this.addAllServices(orderSubVo,calOrderSubVo);
                    orderVo.setGoods(orderSubVo);
                }else{
                    ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                    return responseDiscountVo;
                }
            }else if (String.valueOf(marketTicketApplyType.getIsUse()).equals(UseConstant.ONE)){//指定服务不参加
                //如果是指定不参与的服务 则返回的是 不参与的服务  如果为空则说明全都可以参与优惠
                List<OrderSubVo> noCalOrderSubVo =this.serviceCalculateJoinGoods(orderSubVo,marketTicketGoodsList);
                if (noCalOrderSubVo.size()>0){
                    //计算参与的服务总金额
                    //如果有 不参与的服务 则排除不参与的服务 后 计算优惠均摊
                    List<OrderSubVo> calOrderSubVo = new ArrayList<>();
                    for (int i = 0 ; i< orderSubVo.size() ; i++){
                        OrderSubVo orderSubVo1 = orderSubVo.get(i);
                        //如果该服务使用了体验券和次卡  不能使用优惠券
                        if (StringUtils.isNotEmpty(orderSubVo1.getGoodsId())){
                            continue;
                        }else {
                            if (ConstantCommMethod.checkHaveTickets(orderSubVo1.getTicketVoList(),UseConstant.ZERO)){
                                continue;
                            }
                        }
                        Boolean flag = true;
                        for (int j = 0 ;j < noCalOrderSubVo.size();j++){
                            OrderSubVo noOrder = noCalOrderSubVo.get(j);
                            if (orderSubVo1.getServiceId().equals(noOrder.getServiceId())){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            calOrderSubVo.add(orderSubVo1);
                        }
                    }
                    //如果返回空 则表示 没有可以参与优惠的服务
                    if (checkGoodsUsedDiscount(calOrderSubVo)){
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                    //进行均摊
                    if (calOrderSubVo.size() > 0) {
                        //判断使用限额
                        if (!checkTicketLimit(calOrderSubVo,orderVo,marketTicket)){
                            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName()+ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                            return responseDiscountVo;
                        }
                        //计算均摊
                        payAmount = this.serviceCalculatePayAmount(calOrderSubVo,orderVo);
                        if (payAmount.compareTo(marketTicket.getLimitAmount()) >= 0){
                            calOrderSubVo = this.serviceTicketCal(orderVo,calOrderSubVo,marketTicketGoodsList,marketTicket.getTicketAmount(),payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                        }else{
                            ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ticketVo.getTicketName()+ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                            return responseDiscountVo;
                        }
                        //UNION ALL
                        calOrderSubVo = this.addAllServices(orderSubVo,calOrderSubVo);
                        orderVo.setGoods(calOrderSubVo);
                    }else {
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                }else {
                    //没有不参与的服务
                    List<OrderSubVo> calOrderSubVo = removeOrderSubVo(orderSubVo);
                    //如果为空则表示所有服务已经被体验券和次卡均摊过
                    if (null==calOrderSubVo || calOrderSubVo.size() == 0){
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.ONE_SERVICE_NO_JOIN_MARKET,orderVo);
                        return responseDiscountVo;
                    }
                    //计算均摊
                    payAmount = this.serviceCalculatePayAmount(calOrderSubVo,orderVo);
                    if (payAmount.compareTo(marketTicket.getLimitAmount()) >=0){
                        calOrderSubVo = this.serviceTicketCal(orderVo, calOrderSubVo, marketTicketGoodsList, marketTicket.getTicketAmount(), payAmount,ticketId,ticketVo.getTicketId(),ticketVo.getTicketName());
                        List<OrderSubVo> orderSubVoList = this.addAllServices(orderSubVo, calOrderSubVo);
                        orderVo.setGoods(orderSubVoList);
                    }else{
                        ConstantCommMethod.setResponseBasicInfo(responseDiscountVo,UseConstant.FAIL,ErrCodeConstant.TIMECARDERR,ErrMsgConstant.TICKET_NO_EQ_TICKET_AMOUNT,orderVo);
                        return responseDiscountVo;
                    }
                }
            }
        }
        ConstantCommMethod.setResponseDiscountItemsBasicInfo(ticketVo,marketTicket,orderVo,responseDiscountVo,UseConstant.SUCCESS);
        return responseDiscountVo;
    }


    /**
     * 计算商品均摊
     * @param orderVo
     * @param goods
     * @param marketTicketGoodsList
     * @param ticketAmount
     * @param payAmount
     * @return
     */
    public List<OrderSubVo> ticketCal(OrderVo orderVo,List<OrderSubVo> goods, List<MarketTicketGoods> marketTicketGoodsList, BigDecimal ticketAmount, BigDecimal payAmount,String ticketId , String memberTicketId,String ticketName){
        //优惠券均摊到每个商品
        //计算优惠比例
        BigDecimal bilibili = ticketAmount.divide(payAmount,8, RoundingMode.DOWN);
        BigDecimal residueTicAmount = new BigDecimal(0.00);
        for (int i = 0; i<goods.size() ; i++){
            OrderSubVo orderSubVo = goods.get(i);
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            if (ticketVoList == null){
                ticketVoList = new ArrayList<>();
            }
            TicketVo ticketVo = new TicketVo();
            BigDecimal memberPrice = selectPrice(orderVo,orderSubVo);
            int count = orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
            if (orderSubVo.getGoodsCount() == 0){
                count = 1;
            }
            if (count==0&&StringUtils.isNotEmpty(orderSubVo)){
                count=0;
            }
            BigDecimal singlePrice = memberPrice.multiply(new BigDecimal(count));
            BigDecimal totalDIscount = BigDecimal.ZERO;
            if (orderSubVo.getTotalDiscount() != null && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                totalDIscount = orderSubVo.getTotalDiscount();
                singlePrice = singlePrice.subtract(totalDIscount);
            }if (i == goods.size()-1){//如果是最后一个商品
                singlePrice = singlePrice.subtract(orderSubVo.getTotalDiscount());
                if (singlePrice.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                    //如果大于0 则表示 该商品可以全部均摊剩余优惠
                    orderSubVo.setTotalDiscount(totalDIscount.add(ticketAmount.subtract(residueTicAmount)));
                    //设置优惠券信息
                    ConstantCommMethod.setTicketVoBasicInfo(ticketVo,ticketName,memberTicketId,ticketAmount,TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                }else {//商品 不能全部均摊剩余优惠
                    orderSubVo.setTotalDiscount(totalDIscount.add(singlePrice));//能均摊的最大金额
                    //设置优惠券信息
                    ConstantCommMethod.setTicketVoBasicInfo(ticketVo,ticketName,memberTicketId,ticketAmount,TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                    residueTicAmount = residueTicAmount.add(singlePrice);
                    for (int j = 0 ; j<goods.size() ; j++){
                        //将剩余金额 均摊到其他商品上
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
                //设置优惠券信息
                ConstantCommMethod.setTicketVoBasicInfo(ticketVo,ticketName,memberTicketId,ticketAmount,TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode());
                ticketVoList.add(ticketVo);
                orderSubVo.setTicketVoList(ticketVoList);
            }
        }
        return goods;
    }

    /**
     * 计算服务均摊
     * @param orderVo
     * @param goods
     * @param marketTicketGoodsList
     * @param ticketAmount
     * @param payAmount
     * @return
     */
    public List<OrderSubVo> serviceTicketCal(OrderVo orderVo,List<OrderSubVo> goods, List<MarketTicketGoods> marketTicketGoodsList, BigDecimal ticketAmount, BigDecimal payAmount,String ticketId,String memberTicketId,String ticketName){
        //优惠券均摊到每个商品
        //计算优惠比例
        BigDecimal bilibili = ticketAmount.divide(payAmount,8, RoundingMode.DOWN);
        BigDecimal residueTicAmount = BigDecimal.ZERO;
        for (int i = 0; i<goods.size() ; i++){
            if (residueTicAmount.compareTo(ticketAmount) == 0){
                break;
            }
            OrderSubVo orderSubVo = goods.get(i);
            TicketVo ticketVo = new TicketVo();
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            if (ticketVoList == null){
                ticketVoList = new ArrayList<>();
            }
            BigDecimal memberPrice = selectPriceService(orderVo,orderSubVo);
            BigDecimal totalDIscount = BigDecimal.ZERO;
            if (orderSubVo.getTotalDiscount() != null && orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                totalDIscount = orderSubVo.getTotalDiscount();
            }if (i == goods.size()-1){//如果是最后一个商品
                if (memberPrice.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                    //如果大于0 则表示 该商品可以全部均摊剩余优惠
                    orderSubVo.setTotalDiscount(totalDIscount.add(ticketAmount.subtract(residueTicAmount)));
                    //设置优惠券信息
                    ConstantCommMethod.setTicketVoBasicInfo(ticketVo,ticketName,memberTicketId,ticketAmount,TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                }else {//商品 不能全部均摊剩余优惠
                    orderSubVo.setTotalDiscount(totalDIscount.add(memberPrice));//能均摊的最大金额
                    //设置优惠券信息
                    ConstantCommMethod.setTicketVoBasicInfo(ticketVo,ticketName,memberTicketId,ticketAmount,TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                    residueTicAmount = residueTicAmount.add(memberPrice);
                    for (int j = 0 ; j<goods.size() ; j++){
                        //将剩余金额 均摊带其他商品上
                        OrderSubVo orderSubVo1 = goods.get(j);
                        BigDecimal memberPrice1 = orderSubVo1.getMemberPrice();//会员价
                        BigDecimal totalDIscount1 = BigDecimal.ZERO;
                        if (orderSubVo1.getTotalDiscount() != null && orderSubVo1.getTotalDiscount().compareTo(BigDecimal.ZERO)>0){
                            totalDIscount1 = orderSubVo1.getTotalDiscount();
                            memberPrice1 = memberPrice1.subtract(totalDIscount1);
                        }
                        if (memberPrice1.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                            orderSubVo1.setTotalDiscount(totalDIscount1.add(ticketAmount.subtract(residueTicAmount)));
                            break;
                        }else {
                            orderSubVo1.setTotalDiscount(totalDIscount1.add(memberPrice1));//能均摊的最大金额
                            residueTicAmount = residueTicAmount.add(memberPrice1);
                        }
                    }
                }
            }else{
                BigDecimal newTotalDiscount = memberPrice.multiply(bilibili).setScale(2,RoundingMode.DOWN);
                //避免超出优惠金额
                if (newTotalDiscount.compareTo(ticketAmount.subtract(residueTicAmount)) >=0){
                    orderSubVo.setTotalDiscount(totalDIscount.add(ticketAmount.subtract(residueTicAmount)));
                }else {
                    orderSubVo.setTotalDiscount(totalDIscount.add(newTotalDiscount));
                }
                //设置优惠券信息
                ConstantCommMethod.setTicketVoBasicInfo(ticketVo,ticketName,memberTicketId,ticketAmount,TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode());
                ticketVoList.add(ticketVo);
                orderSubVo.setTicketVoList(ticketVoList);
                residueTicAmount = residueTicAmount.add(newTotalDiscount);
            }
        }
        return goods;
    }

    /**
     * 计算商品总价
     * @param orderSubVoList
     * @return
     */
    public BigDecimal calculatePayAmount(List<OrderSubVo> orderSubVoList,OrderVo orderVo){
        BigDecimal payAmount = calGoodsAndTimeCardTotalAmount(orderSubVoList,orderVo);
        return payAmount;
    }

    /**
     * 服务总价
     * @param orderSubVoList
     * @return
     */
    public BigDecimal serviceCalculatePayAmount(List<OrderSubVo> orderSubVoList,OrderVo orderVo){
        BigDecimal payAmount = BigDecimal.ZERO;
        for (int i= 0; i <orderSubVoList.size() ; i++){
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            BigDecimal memberPrice=selectPriceService(orderVo,orderSubVo);
            payAmount = payAmount.add(memberPrice);
        }
        return payAmount;
    }

    /**
     * 满减券可用商品
     * @param orderSubVoList
     * @param marketTicketGoodsList
     * @return
     */
    public List<OrderSubVo> calculateJoinGoods(List<OrderSubVo> orderSubVoList,List<MarketTicketGoods> marketTicketGoodsList){
        if (StringUtils.isEmpty(marketTicketGoodsList)){
            marketTicketGoodsList=new ArrayList<>();
        }
        List<OrderSubVo> result = new ArrayList<>();
        //取指定商品goodsShopId集合
        List<String> ids=new ArrayList<>();
        marketTicketGoodsList.stream().forEach(x->{
            ids.add(x.getGoodsId());
        });
        //查询商品公司ID
        List<GoodsShop> goodsShopList=goodsShopMapper.selectByPrimaryKeys(ids);
        for (int i = 0; i < orderSubVoList.size(); i++) {
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            for (int j = 0; j < marketTicketGoodsList.size(); j++) {
                MarketTicketGoods marketTicketGoods = marketTicketGoodsList.get(j);
                String goodsShopId="";//商品ID
                List<GoodsShop> goodsShopList1=goodsShopList.stream().filter(x->x.getId().equals(marketTicketGoods.getGoodsId())).collect(Collectors.toList());
                if (StringUtils.isNotEmpty(goodsShopList1)&&goodsShopList1.size()>0){
                    goodsShopId=goodsShopList1.get(0).getGoodsCompanyId();
                }
                if (StringUtils.isNotEmpty(orderSubVo.getGoodsCompanyId())){
                    if (StringUtils.isNotEmpty(orderSubVo.getGoodsCompanyId())&&orderSubVo.getGoodsCompanyId().equals(marketTicketGoods.getGoodsCompanyId())){
                        result.add(orderSubVo);
                        break;
                    }
                    if (StringUtils.isNotEmpty(orderSubVo.getGoodsCompanyId())&&orderSubVo.getGoodsCompanyId().equals(marketTicketGoods.getGoodsId())){//针对次卡
                        result.add(orderSubVo);
                        break;
                    }
                    if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())&&orderSubVo.getGoodsCompanyId().equals(marketTicketGoods.getGoodsId())){//针对次卡
                        result.add(orderSubVo);
                        break;
                    }
                    if (StringUtils.isNotEmpty(orderSubVo.getGoodsSkuId())&&orderSubVo.getGoodsSkuId().equals(marketTicketGoods.getGoodsId())){//针对商品
                        result.add(orderSubVo);
                        break;
                    }
                    if (StringUtils.isNotEmpty(orderSubVo.getGoodsCompanyId())&&orderSubVo.getGoodsCompanyId().equals(goodsShopId)){//针对商品
                        result.add(orderSubVo);
                        break;
                    }
                }else {
                    if (StringUtils.isNotEmpty(orderSubVo.getGoodsSkuId())&&orderSubVo.getGoodsSkuId().equals(marketTicketGoods.getGoodsCompanyId())){
                        result.add(orderSubVo);
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 优惠券可用服务
     * @param orderSubVoList
     * @param marketTicketGoodsList
     * @return
     */
    public List<OrderSubVo> serviceCalculateJoinGoods(List<OrderSubVo> orderSubVoList,List<MarketTicketGoods> marketTicketGoodsList){
        List<OrderSubVo> result = new ArrayList<>();
        for (int i = 0; i < orderSubVoList.size(); i++) {
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            //判断该服务是否使用了次卡和体验券
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                continue;
            }
            Boolean flag = ConstantCommMethod.checkHaveTickets(orderSubVo.getTicketVoList(),
                    TicketTypeEnum.EXPERIENCE_SECURITIES.getCode(),
                    TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode(),
                    TicketTypeEnum.TIMES_CARD.getCode());
            if (flag){
                continue;
            }
            for (int j = 0; j < marketTicketGoodsList.size(); j++) {
                MarketTicketGoods marketTicketGoods = marketTicketGoodsList.get(j);
                if (orderSubVo.getServiceId().equals(marketTicketGoods.getGoodsId())){
                    result.add(orderSubVo);
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 添加所有的服务类的订单
     * @param orderSubVo
     * @param calOrderSubVo
     * @return
     */
    public List<OrderSubVo> addAllServices(List<OrderSubVo> orderSubVo,List<OrderSubVo> calOrderSubVo){
        for (int i = 0; i < orderSubVo.size(); i++) {
            OrderSubVo orderSubVo1 = orderSubVo.get(i);
            //如果该服务使用了体验券和次卡  不能使用优惠券
            //4为次卡
            if (StringUtils.isNotEmpty(orderSubVo1.getGoodsId())){
                    continue;
            }
            Boolean boo = ConstantCommMethod.checkHaveTickets(orderSubVo1.getTicketVoList(),TicketTypeEnum.EXPERIENCE_SECURITIES.getCode());
            if (boo){
                continue;
            }
            Iterator<OrderSubVo> it = calOrderSubVo.iterator();
            while (it.hasNext()){
                OrderSubVo order = it.next();
                if (orderSubVo1.getServiceId().equals(order.getServiceId())) {
                    orderSubVo1.setTotalDiscount(order.getTotalDiscount());
                    calOrderSubVo.remove(order);
                    break;
                }
            }
        }
        return orderSubVo;
    }

    /**
     * 移除参与优惠的子订单
     * @param orderSubVoList
     * @return
     */
    public List<OrderSubVo> removeOrderSubVo(List<OrderSubVo> orderSubVoList){
        List<OrderSubVo> result = new ArrayList<>();
        for (int i = 0; i < orderSubVoList.size(); i++) {
            OrderSubVo orderSubVo = orderSubVoList.get(i);
            //判断该服务是否使用了次卡和体验券
            if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())&&StringUtils.isNotEmpty(orderSubVo.getServiceId())){
                continue;
            }
            Boolean flag = ConstantCommMethod.checkHaveTickets(orderSubVo.getTicketVoList(),
                    TicketTypeEnum.EXPERIENCE_SECURITIES.getCode(),
                    TicketTypeEnum.WITH_REDUCED_SECURITIES.getCode(),
                    TicketTypeEnum.TIMES_CARD.getCode());
            if (flag){
                continue;
            }
            result.add(orderSubVo);
        }
        return result;
    }

    /**
     * 判断商品是否使用了优惠
     * @param orderSub
     * @return
     */
    public boolean checkGoodsUsedDiscount(List<OrderSubVo> orderSub){
        if (StringUtils.isNotEmpty(orderSub)&&orderSub.size()>0){
            for (OrderSubVo orderSubVo:orderSub){
                List<TicketVo> list=orderSubVo.getTicketVoList();
                if (StringUtils.isNotEmpty(list)&&list.size()>0){
                    for (TicketVo ticketVo:list){
                        if (StringUtils.isNotEmpty(ticketVo.getTicketType())){
                            switch (ticketVo.getTicketType()){
                                case TicketType.ONE_ORDER_SUB:
                                case TicketType.ONE_ORDEr_DISCOUNT:
                                case TicketType.DISCOUNTCOUPONS:
                                case TicketType.WITH_DISCOUNT_COUPONS:
                                case TicketType.EXPERIENCETICKET_TYPE:
                                    return true;
                                default://不做处理
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * 判断满减劵使用限额
     * @param orderSub
     * @param orderVo
     * @return
     */
    public boolean checkTicketLimit(List<OrderSubVo> orderSub,OrderVo orderVo,MarketTicket marketTicket){
        BigDecimal limit=marketTicket.getLimitAmount();
        BigDecimal amount=BigDecimal.ZERO;
        if(OrderTypeEnum.GOODSORDER.getCode().equals(orderVo.getOrderType())||OrderTypeEnum.TIMESCARDORDER.getCode().equals(orderVo.getOrderType())){
            amount=calculatePayAmount(orderSub,orderVo);
        }else {
            amount=serviceCalculatePayAmount(orderSub,orderVo);
        }
        if (amount.compareTo(limit)>=0){
            return true;
        }
        return false;
    }


    /**
     * 计算商品和次卡类订单 待支付总金额
     * @param list
     * @param orderVo
     * @return
     */
    public  BigDecimal calGoodsAndTimeCardTotalAmount(List<OrderSubVo> list,OrderVo orderVo){
        BigDecimal toPayAmount=new BigDecimal(0.00);
        for (OrderSubVo x:list){
            BigDecimal price=new BigDecimal(0.00);
            //判断商品价格
            if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
                if (x.getBargainPrice() != null && x.getBargainPrice().compareTo(BigDecimal.ZERO)>0){//议价
                    price = price.add(x.getBargainPrice());
                }else {
                    if (StringUtils.isNotEmpty(x.getSecondPrice())&&new BigDecimal(x.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
                        price=price.add(new BigDecimal(x.getSecondPrice()));
                    }else {
                        price=price.add(x.getMemberPrice());
                    }
                }
            }else {
                if (x.getBargainPrice() != null && x.getBargainPrice().compareTo(BigDecimal.ZERO)>0){//议价
                    price = price.add(x.getBargainPrice());
                }else {
                    if (StringUtils.isNotEmpty(x.getSecondPrice())&&new BigDecimal(x.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
                        price=price.add(new BigDecimal(x.getSecondPrice()));
                    }else {
                        price=price.add(x.getPrice());
                    }
                }
            }
            if (orderVo.getOrderType().equals(OrderConstant.TIMESCARDORDER)){
                if (StringUtils.isNotEmpty(x.getPriceType())){
                    if (PriceTypeEnum.MEMBER_PRICE.getCode().equals(x.getPriceType())){
                        price=x.getPrice();
                    }else {
                        price = x.getOriginPrice();
                    }
                }
            }
            BigDecimal singPrice = BigDecimal.ZERO;
            singPrice = singPrice.add(price.multiply(new BigDecimal(x.getGoodsCount()-x.getPresentNum())).subtract(x.getTotalDiscount()));
            toPayAmount =toPayAmount.add(singPrice);
        }
        return toPayAmount;
    }

    /**
     * 计算商品和次卡类子订单 单价
     * @param orderVo
     * @param orderSubVo
     * @return
     */
    public BigDecimal selectPrice(OrderVo orderVo,OrderSubVo orderSubVo){
        //商品或者计次卡单价
        BigDecimal price=ConstantCommMethod.getGoodsOrTimeCardRealPayPrice(orderSubVo,orderVo);
        return  price;
    }

    /**
     * 计算服务类支付订单总金额
     * @param orderVo
     * @return
     */
    public BigDecimal selectPriceService(OrderVo orderVo,OrderSubVo orderSubVo){
        BigDecimal toPayAmount=ConstantCommMethod.getServiceRealPayPrice(orderSubVo,orderVo);
        return toPayAmount;
    }

    /**
     * 获取优惠券应用类型
     * @param ticketId
     * @param orderVo
     * @return
     */
    public MarketTicketApplyType getMarketTicketApplyTypeByOrderType(String ticketId,OrderVo orderVo){
        MarketTicketApplyTypeExample marketTicketApplyTypeExample=new MarketTicketApplyTypeExample();
        marketTicketApplyTypeExample.createCriteria().andTicketIdEqualTo(ticketId);
        List<MarketTicketApplyType> marketTicketApplyTypeList=marketTicketApplyTypeMapper.selectByExample(marketTicketApplyTypeExample);
        List<MarketTicketApplyType> list=marketTicketApplyTypeList.stream().filter(x->String.valueOf(x.getApplyType()).equals(orderVo.getOrderType())).collect(Collectors.toList());
        MarketTicketApplyType marketTicketApplyType=list.get(0);
        return marketTicketApplyType;
    }

    /**
     * 合并参与优惠的不参与优惠的载体集合
     * @param orderSubVo
     * @param calOrderSubVo
     * @param orderVo
     */
    public void unionAllMarketAndNoMarketCollection(List<OrderSubVo> orderSubVo,List<OrderSubVo> calOrderSubVo,OrderVo orderVo){
        //将参与优惠和不参与的商品 进行合并
        for (int i =0;i <orderSubVo.size(); i++){
            OrderSubVo orderSubVo1 = orderSubVo.get(i);
            for (int j =0 ;j>calOrderSubVo.size() ;j++){
                OrderSubVo order = calOrderSubVo.get(j);
                if (orderSubVo1.getGoodsId().equals(order.getGoodsId())){
                    orderSubVo1.setTotalDiscount(order.getTotalDiscount());
                    break;
                }
            }
        }
        orderVo.setGoods(orderSubVo);
    }

    /**
     * 排除不参与优惠的商品 的载体
     * @param orderSubVo
     * @param noCalOrderSubVo
     * @return
     */
    public List<OrderSubVo> getJoinGoodsOrderMarketCollection(List<OrderSubVo> orderSubVo,List<OrderSubVo> noCalOrderSubVo){
        //如果有 不参与的商品 则排除不参与的商品 后 计算优惠均摊
        List<OrderSubVo> calOrderSubVo = new ArrayList<>();
        for (int i = 0 ; i< orderSubVo.size() ; i++){
            OrderSubVo orderSubVo1 = orderSubVo.get(i);
            if (CollectionUtils.isEmpty(noCalOrderSubVo)){
                calOrderSubVo.add(orderSubVo1);
            }else {
                boolean flag=false;
                if (noCalOrderSubVo.stream().anyMatch(x->x.getGoodsId().equals(orderSubVo1.getGoodsId()))){
                    flag=true;
                }
                if (!flag){
                    calOrderSubVo.add(orderSubVo1);
                }
            }
        }
        return calOrderSubVo;
    }

}