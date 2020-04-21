package com.mudule.mumzonemarketcal.controller.market;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ApiResponse;
import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.common.ReqPathConstant;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.JoinValuesEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.service.AsynTaskService;
import com.mudule.mumzonemarketcal.service.DroolsService;
import com.mudule.mumzonemarketcal.service.FeiginService;
import com.mudule.mumzonemarketcal.service.MarketService;
import com.mudule.mumzonemarketcal.service.impl.MarketServiceImpl;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 营销计算-->目前先针对POS端,等后期再制定其他规则
 * @ClassName MarketCalController
 * @Autor DZT
 * @Date 2019/3/13 10:24
 * @Version 1.0
 */
@Slf4j
@Lazy
@RestController
@RequestMapping(ReqPathConstant.MARKETCAL)
public class MarketCalController {

//    @Resource
//    private MarketService marketService;
    @Resource
    private DroolsService droolsService;
    @Autowired
    private AsynTaskService asynTaskService;
    @Autowired
    private FeiginService feiginService;

    /**
     * POS端结账页面金额、优惠计算
     * 1、优惠均摊
     * 2、获取的积分
     * 3、积分均摊
     * 4、会员折扣、优惠折扣、商品折扣、抹零折扣
     * @param jsonObject
     * @return
     */
    @PostMapping(value = ReqPathConstant.MARKETCALMETHOD)
    public ApiResponse<ResponseDiscountVo> marketCal(@RequestBody JSONObject jsonObject){
        log.info("POS端结账页面金额、优惠计算---->start");
        log.info("请求参数信息:"+jsonObject.toJSONString());
        //进行参数的映射和参数的拼装处理
        OrderVo orderVo=reqParamMethod(jsonObject);
        log.info("组装之后参数信息:【OrderVo】"+orderVo.toString());
        //处理请求参数信息
        //校验请求参数信息
        if (StringUtils.isEmpty(orderVo.getShopId()) && StringUtils.isEmpty(orderVo.getCompanyId())){
            return ApiResponse.fail("机构参数错误");
        }
        if (StringUtils.isNotEmpty(orderVo.getActivityVoList())&&StringUtils.isNotEmpty(orderVo.getTicketVoList())){
            return ApiResponse.fail("活动不能和其他优惠券/体验劵同享");
        }
        if (StringUtils.isEmpty(orderVo.getGoods())){
            return ApiResponse.fail("商品参数信息不能为空");
        }
        if (StringUtils.isEmpty(orderVo.getOrderType())){
            return ApiResponse.fail("订单类型不能为空");
        }
        ResponseDiscountVo responseDiscountVo=droolsService.MarketCalRule(orderVo);
        //判断营销计算结果信息
        if (UseConstant.FAIL.equals(responseDiscountVo.getCode())){
            //营销计算失败返回计算失败异常信息
            log.info("营销计算失败异常明细:"+responseDiscountVo.getMsg());
            return ApiResponse.fail(responseDiscountVo.getErrCode(),responseDiscountVo.getMsg());
        }
        //计算成功
        log.info("POS端结账页面营销计算结果信息:"+responseDiscountVo.toString());
        log.info("POS端结账页面金额、优惠计算---->end");
        if (UseConstant.SUCCESS.equals(responseDiscountVo.getCode())){
            responseDiscountVo.setCode(ErrCodeConstant.SUCCESS_CODE);
        }
        return ApiResponse.success(responseDiscountVo, ErrMsgConstant.CAL_SUCCESS);
    }
    /**
     * POS端营销计算参数组装
     *      因为对象中嵌套多个对象和多个数组
     *      所以需要将各层的参数进行提取组合
     *      对象
     *      多个数组
     *      对象嵌套对象
     *      对象嵌套多个数组
     * @param jsonObject
     * @return
     */
    public OrderVo reqParamMethod(JSONObject jsonObject){
        /**
         * 进行集合提取
         */
        //子订单列表
        List<OrderSubVo> orderSubVoList= JSONArray.parseArray(jsonObject.getJSONArray(OrderConstant.GOODS)==null?"":jsonObject.getJSONArray(OrderConstant.GOODS).toJSONString(),OrderSubVo.class);
        //判断是否有计次卡
        if (StringUtils.isNotEmpty(jsonObject.getString(OrderConstant.GOODSTYPE))){
            orderSubVoList.stream().forEach(x->x.setIsTimerCard(new Byte(OrderConstant.ONE)));
        }
        orderSubVoList.stream().forEach(x->x.setMemberDiscountRatio(StringUtils.isNotEmpty(jsonObject.getString(OrderConstant.MEMBERDISCOUNTRATIO))?jsonObject.getBigDecimal(OrderConstant.MEMBERDISCOUNTRATIO):new BigDecimal(0.00)));
        //优惠活动列表
        List<ActivityVo> activityVoList=JSONArray.parseArray(jsonObject.getJSONArray(OrderConstant.ACTIVITYS)==null?"":jsonObject.getJSONArray(OrderConstant.ACTIVITYS).toJSONString(),ActivityVo.class);
        //优惠券列表
        List<TicketVo> ticketVoList=JSONArray.parseArray(jsonObject.getJSONArray(OrderConstant.TICKETS)==null?"":jsonObject.getJSONArray(OrderConstant.TICKETS).toJSONString(),TicketVo.class);
        //对优惠券列表进行排序
        ticketVoList.sort((a,b)->a.getIndex()-b.getIndex());
        //计次卡列表
        List<TimesCardVo> timesCardVoList=JSONArray.parseArray(jsonObject.getJSONArray(OrderConstant.TIMESCARDS)==null?"":jsonObject.getJSONArray(OrderConstant.TIMESCARDS).toJSONString(),TimesCardVo.class);
        String orderType=jsonObject.getString(OrderConstant.SETTLETYPE);
        jsonObject.put(OrderConstant.GOODS,OrderConstant.STRNULL);
        jsonObject.put(OrderConstant.TICKETS,OrderConstant.STRNULL);
        jsonObject.put(OrderConstant.ACTIVITYS,OrderConstant.STRNULL);
        jsonObject.put(OrderConstant.TIMESCARDS,OrderConstant.STRNULL);
        //总订单
        OrderVo orderVo= JSONObject.parseObject(jsonObject.toJSONString(), OrderVo.class);
        //进行集合属性参数赋值
        orderVo.setOrderType(orderType);
        orderVo.setGoods(orderSubVoList);
        orderVo.setTicketVoList(ticketVoList);
        orderVo.setActivityVoList(activityVoList);
        orderVo.setMemberTimesCardArray(timesCardVoList);
        orderVo.setMlPrice(jsonObject.getBigDecimal(JoinValuesEnum.MLAMOUNT.getValue()));
        //营销活动
        orderVo=memberPriceDiscount(orderVo);
        orderVo=checkUsedPriceType(orderVo);
        List<OrderSubVo> goods=orderVo.getGoods();
        //查询会员商品价格信息 针对普通商品
        if (OrderConstant.GOODSORDER.equals(orderVo.getOrderType())&&(StringUtils.isNotEmpty(orderVo.getMemberCompanyId())||StringUtils.isNotEmpty(orderVo.getBillingUser()))){
            List<OrderSubVo> orderSubVoList1=feiginService.selectGoodsPrice(orderVo);
            orderSubVoList1.stream().forEach(x->{
                log.info("Price:[{}],MemberPrice:[{}],SecondPrice:[{}]");
                goods.stream().forEach(y->{
                    if (x.getGoodsSkuId().equals(y.getGoodsSkuId())){
                        y.setPrice(x.getPrice());
                        y.setMemberPrice(x.getMemberPrice());
                        y.setSecondPrice(x.getSecondPrice());
                    }
                });
            });
            orderVo.setGoods(goods);
        }
        return orderVo;
    }

    /**
     * 小儿游泳异步
     * @param reqMap
     * @return
     */
    public boolean chirden(JSONObject reqMap){
        log.info("获取请求参数信息:"+reqMap.toJSONString());
        JSONArray jsonArray=JSONArray.parseArray(reqMap.getString(JoinValuesEnum.LIST.getValue()));
        List<Map<String,String>> req=new ArrayList<>();
        for (int i=0;i<jsonArray.size();i++){
            JSONObject jsonObject1=jsonArray.getJSONObject(i);
            Map<String,String> map=new HashMap<>();
            map.put(JoinValuesEnum.ID.getValue(),jsonObject1.getString(JoinValuesEnum.ID.getValue()));
            map.put(JoinValuesEnum.TIME.getValue(),jsonObject1.getString(JoinValuesEnum.TIME.getValue()));
            req.add(map);
        }
        if (StringUtils.isEmpty(req)){
            return false;
        }
        boolean flag=asynTaskService.setChildrenSwimTimesBatch(req);
        if (flag){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 会员价营销活动
     * @param orderVo
     * @return
     */
    public OrderVo memberPriceDiscount(OrderVo orderVo){
        if(OrderConstant.SERVICEORDER.equals(orderVo.getOrderType())){//服务类
            if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&!UseConstant.ONE.equals(orderVo.getMemberDiscountType())){
                List<OrderSubVo> goods=orderVo.getGoods();
                for (OrderSubVo orderSubVo:goods){
                    orderSubVo.setMemberPrice(orderSubVo.getOriginPrice());
                }
                orderVo.setGoods(goods);
            }
        }
        if(OrderConstant.TIMESCARDORDER.equals(orderVo.getOrderType())){//次卡类
            if (StringUtils.isNotEmpty(orderVo.getMemberDiscountType())&&!UseConstant.ONE.equals(orderVo.getMemberDiscountType())){
                List<OrderSubVo> goods=orderVo.getGoods();
                for (OrderSubVo orderSubVo:goods){
                    orderSubVo.setPrice(orderSubVo.getOriginPrice());//取原价
                }
                orderVo.setGoods(goods);
            }
        }
        return orderVo;
    }

    /**
     * 计算订单使用哪个价格 类型0：原价 1：会员价 2:议价 3:单品变价 4:会员折扣价(原价或变价基础之上)
     * @param orderVo
     * @return
     */
    public OrderVo checkUsedPriceType(OrderVo orderVo){
        //1、服务类订单 次卡类订单
        List<OrderSubVo> goods=orderVo.getGoods();
        if(OrderConstant.SERVICEORDER.equals(orderVo.getOrderType())||OrderConstant.TIMESCARDORDER.equals(orderVo.getOrderType())){
            //判断是否用的会员价
            if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
                for (OrderSubVo orderSubVo:goods){
                    orderSubVo.setPriceType(PriceTypeEnum.MEMBER_PRICE.getCode());
                }
                orderVo.setGoods(goods);
            }
            //判断会员折扣
            goods=checkOrderSubVoPriceType(goods,orderVo.getMemberDiscountType());
        }
        //2、商品类订单
        if(OrderConstant.GOODSORDER.equals(orderVo.getOrderType())){//商品类
            for (OrderSubVo orderSubVo:goods){
                if (StringUtils.isNotEmpty(orderVo.getMemberCompanyId())){
                    if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice())&&orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
                        orderSubVo.setPriceType(PriceTypeEnum.BARIGARING_PRICE.getCode());
                    }else {
                        orderSubVo.setPriceType(PriceTypeEnum.MEMBER_PRICE.getCode());
                        checkOrderSubVoPriceTypeOne(orderSubVo,orderVo.getMemberDiscountType());
                    }
                }else {
                    orderSubVo.setPriceType(PriceTypeEnum.PRICE.getCode());
                    checkOrderSubVoPriceTypeOne(orderSubVo,orderVo.getMemberDiscountType());
                }
            }
        }
        orderVo.setGoods(goods);
        return orderVo;
    }

    /**
     * 判断会员折扣
     * @param goods
     * @param memberDiscountVo
     * @return
     */
    public List<OrderSubVo> checkOrderSubVoPriceType(List<OrderSubVo> goods,String memberDiscountVo){
        if (StringUtils.isNotEmpty(memberDiscountVo)){
            switch (memberDiscountVo){
                case UseConstant.ZERO:
                    for (OrderSubVo orderSubVo:goods){
                        orderSubVo.setPriceType(PriceTypeEnum.MEMBER_DISCOUNT.getCode());
                    }
                    break;
                case UseConstant.ONE:
                    for (OrderSubVo orderSubVo:goods){
                        orderSubVo.setPriceType(PriceTypeEnum.MEMBER_PRICE.getCode());
                    }
                    break;
                case UseConstant.TWO:
                default:
                    for (OrderSubVo orderSubVo:goods){
                        orderSubVo.setPriceType(PriceTypeEnum.PRICE.getCode());
                    }
            }
            return goods;
        }else {
            return goods;
        }
    }

    /**
     * 判断会员折扣
     * @param orderSubVo
     * @param memberDiscountVo
     * @return
     */
    public  void checkOrderSubVoPriceTypeOne(OrderSubVo orderSubVo,String memberDiscountVo){
        if (StringUtils.isNotEmpty(memberDiscountVo)){
            switch (memberDiscountVo){
                case UseConstant.ZERO:
                        orderSubVo.setPriceType(PriceTypeEnum.MEMBER_DISCOUNT.getCode());
                    break;
                case UseConstant.ONE:
                        orderSubVo.setPriceType(PriceTypeEnum.MEMBER_PRICE.getCode());
                    break;
                case UseConstant.TWO:
                default:
                        orderSubVo.setPriceType(PriceTypeEnum.PRICE.getCode());
            }
        }
    }

}
