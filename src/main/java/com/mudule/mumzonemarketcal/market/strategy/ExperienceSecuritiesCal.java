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
        //1、设置返回结果集信息
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();//结果集
        //2、校验订单类型
        /**
         * 1、体验劵是针对服务类订单使用的
         */
        if (!orderVo.getOrderType().equals(OrderConstant.SERVICEORDER)){
            log.info("订单不是服务类商品---------------->不执行体验劵优惠策略");
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
        //3、校验优惠列表中是否有体验劵
        TicketVo ticketVo=orderVo.getTicketVo();//需要进行优惠计算的优惠信息
        if (StringUtils.isEmpty(ticketVo)||!TicketType.EXPERIENCETICKET_TYPE.equals(ticketVo.getTicketType())){
            log.info("服务类订单未使用体验劵---------------->不执行体验劵优惠策略");
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
        //4、进行体验劵营销计算
        List<OrderSubVo> orderSubVoList=orderVo.getGoods();//子订单集合
        List<DiscountItem> discountItemList=new ArrayList<>();//优惠折扣列表
        BigDecimal expAmount=new BigDecimal(0.00);//体验劵折扣金额
        //查询体验劵信息
        //判断优惠券类型是体验劵类型
        if (ticketVo.getTicketType().equals(TicketType.EXPERIENCETICKET_TYPE)){
            log.info("服务类订单使用体验劵---------------->执行体验劵优惠策略");
            List<TicketVo> ticketVoList=marketDataService.getExperienceTicketById(ticketVo.getTicketId(),OrderConstant.SERVICEORDER);
            Iterator<TicketVo> iteratorMarket=ticketVoList.iterator();
            Iterator<OrderSubVo> iteratorGoods=orderSubVoList.iterator();
            label:
            while (iteratorMarket.hasNext()){
                TicketVo ticketVoMarket=iteratorMarket.next();
                Boolean boo = true;
                while (iteratorGoods.hasNext()){
                    OrderSubVo orderSubVo=iteratorGoods.next();
                    orderSubVo.getTicketVoList();
                    if (orderSubVo.getServiceId().equals(ticketVoMarket.getTicketId())){
                        //判断体验劵是否已经和次卡针对同一个服务
                        //进行体验劵规则的使用进行判断
                        //判断该服务是否已经使用了计次卡支付
                        /**
                         * 2、体验劵和计次卡不能对同一个服务进行使用
                         */
                        if (StringUtils.isNotEmpty(orderSubVo.getGoodsId())){
                            //设置返回结果信息
                            continue ;
                        }
                        /**
                         * 3、多张体验劵不能对同一个服务进行使用
                         */
                        if (StringUtils.isNotEmpty(orderSubVo.getTicketVoList())){
                            //子订单的优惠集合不为null-->说明针对该服务已经使用了优惠-->所有不能针对该服务再进行优惠
                            responseDiscountVo.setCode(UseConstant.FAIL);
                            responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);//体验劵使用异常
                            responseDiscountVo.setMsg(ErrMsgConstant.SUBAPPOINTMENT_HAS_TICKET);
                            return responseDiscountVo;
                        }
                        //进行体验劵的使用
                        //将体验劵放入对应的服务子订单中
                        List<TicketVo> ticketVoList1 =  orderSubVo.getTicketVoList();
                        if (ticketVoList1 != null){
                            ticketVoList1.add(ticketVo);
                            orderSubVo.setTicketVoList(ticketVoList1);
                        }else {
                            List<TicketVo> list = new ArrayList<>();
                            list.add(ticketVo);
                            orderSubVo.setTicketVoList(list);
                        }
                        //将体验劵优惠的金额进行优惠均摊
                        orderSubVo.setTotalDiscount(orderSubVo.getPrice().subtract(ticketVoMarket.getTicketAmount()));
                        //返回优惠列表
                        DiscountItem discountItem=new DiscountItem();
                        discountItem.setId(ticketVo.getId());
                        discountItem.setName(ticketVoMarket.getTicketName());
                        discountItem.setDiscount(orderSubVo.getPrice().subtract(ticketVoMarket.getTicketAmount()));
                        discountItem.setDiscountType(TicketTypeEnum.WITH_DISCOUNT_COUPONS_BUY.getCode());// 0-优惠活动 1-优惠券 2-体验券 3-抹零 4-次卡
                        discountItemList.add(discountItem);
                        expAmount=expAmount.add(orderSubVo.getPrice().subtract(ticketVoMarket.getTicketAmount()));
                        boo = false;
                        break label;
                    }
                }if (boo){
                    responseDiscountVo.setCode(UseConstant.FAIL);
                    responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);//体验劵使用异常
                    responseDiscountVo.setMsg(ErrMsgConstant.EXPERIENCE_TIMECARD_NO_COMM_USE);
                    return responseDiscountVo;
                }
            }
        }
        /**
         * 设置返回参数信息
         */
        orderVo.setGoods(orderSubVoList);
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setDiscountItem(discountItemList);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        return responseDiscountVo;
    }


}


