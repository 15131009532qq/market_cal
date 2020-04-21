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
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        //1、判断是否是服务类订单
        if (!OrderConstant.SERVICEORDER.equals(orderVo.getOrderType())){
            log.info("不是服务类订单--->不执行计次卡支付优惠策略");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        //2、判断是否使用了计次卡
        if(StringUtils.isEmpty(orderVo.getTicketVo()) || !TicketType.TIMECARD.equals(orderVo.getTicketVo().getTicketType())){
            log.info("服务类订单未使用计次卡支付--->不执行计次卡支付优惠策略");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        //3、进行计次卡支付
        //遍历可以使用的次卡
        List<DiscountItem> list = new ArrayList<>();
        TicketVo timesCardVo = orderVo.getTicketVo();
        String memberTimesCardId = timesCardVo.getTicketId();
        int times = timesCardVo.getCardNum();
        //查询次卡对应服务
        //先查询会员次卡  对应的次卡ID(goodsId)
        MemberTimesCard memberTimesCard = memberTimesCardMapper.selectByPrimaryKey(memberTimesCardId);
        //查询次卡对应的服务
        GoodsCardService goodsCardService = goodsCardServiceMapper.selectByCardId(memberTimesCard.getGoodsId());
        if (StringUtils.isEmpty(goodsCardService)){
            log.info("-----------次卡详情错误");
            responseDiscountVo.setCode(UseConstant.FAIL);
            responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
            responseDiscountVo.setMsg(ErrMsgConstant.TIME_CARD_INFO_ERR);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        List<OrderSubVo> orderSubVoList = orderVo.getGoods();
        String serviceId = goodsCardService.getServiceId();
        BigDecimal discount = BigDecimal.ZERO;
        Iterator<OrderSubVo> it = orderSubVoList.iterator();
        int serviceNum = 0;
        while (it.hasNext()){
            OrderSubVo orderSubVo = it.next();
            List<TicketVo> ticketVoList = orderSubVo.getTicketVoList();
            if (StringUtils.isEmpty(ticketVoList)){
                ticketVoList = new ArrayList<>();
            }
            //次卡和体验券不能同时针对一个服务
            if (orderSubVo.getServiceId().equals(serviceId)) {
                serviceNum++;
            }
            //避免一个服务使用多个次卡
            if (StringUtils.isEmpty(orderSubVo.getGoodsId())){
                if (orderSubVo.getServiceId().equals(serviceId)) {
                    //判断该服务是否已经使用了其他的优惠
                    if (orderSubVo.getTotalDiscount().compareTo(BigDecimal.ZERO) >0){
                        break;
                    }
                    boolean flag=checkGoodsUsedDiscount(orderSubVo);
                    if (flag){
                        break;
                    }
                    orderSubVo.setGoodsId(memberTimesCardId);
                    TicketVo ticketVo = new TicketVo();
                    ticketVo.setTicketId(memberTimesCardId);
                    ticketVo.setCardNum(Integer.valueOf(UseConstant.ONE));//卡数量
                    ticketVo.setTicketType(TicketTypeEnum.TIMES_CARD.getCode());//计次卡
                    ticketVo.setGoodsId(goodsCardService.getCardId());
                    ticketVo.setTicketName(timesCardVo.getTicketName());
                    ticketVoList.add(ticketVo);
                    orderSubVo.setTicketVoList(ticketVoList);
                    times--;
                    discount = discount.add(orderSubVo.getPrice());
                    if (times == 0) {
                        break;
                    }
                }
            }
        }
        if (serviceNum < timesCardVo.getCardNum()){
            responseDiscountVo.setCode(UseConstant.FAIL);
            responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
            responseDiscountVo.setMsg(ErrMsgConstant.TIME_CARD_MORENUM_ERR);
            responseDiscountVo.setOrderVo(orderVo);
            return responseDiscountVo;
        }
        if (times > 0){
                responseDiscountVo.setCode(UseConstant.FAIL);
                responseDiscountVo.setErrCode(ErrCodeConstant.TIMECARDERR);
                responseDiscountVo.setMsg(ErrMsgConstant.TIME_CARD_NUM_ERR);
                responseDiscountVo.setOrderVo(orderVo);
                return responseDiscountVo;
        }
        DiscountItem discountItem = new DiscountItem();
        discountItem.setDiscountType(TicketType.TIMECARD);//传给前台显示  4为次卡
        discountItem.setId(memberTimesCardId);
        discountItem.setName(timesCardVo.getTicketName());
        discountItem.setDiscount(discount);
        discountItem.setCardNum(times);
        list.add(discountItem);
        responseDiscountVo.setDiscountItem(list);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        responseDiscountVo.setOrderVo(orderVo);
        return responseDiscountVo;
    }
    /**
     * 判断商品是否使用了优惠
     * @param orderSub
     * @return
     */
    public boolean checkGoodsUsedDiscount(OrderSubVo orderSub){
        if (StringUtils.isNotEmpty(orderSub)){
                List<TicketVo> list=orderSub.getTicketVoList();
                if (StringUtils.isNotEmpty(list)&&list.size()>0){
                    for (TicketVo ticketVo:list){
                        if (TicketType.ONE_ORDER_SUB.equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketType.ONE_ORDEr_DISCOUNT.equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketType.DISCOUNTCOUPONS.equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketTypeEnum.WITH_DISCOUNT_COUPONS.getCode().equals(ticketVo.getTicketType())){
                            return true;
                        }
                        if (TicketTypeEnum.EXPERIENCE_SECURITIES.getCode().equals(ticketVo.getTicketType())){
                            return true;
                        }
                    }
                }
            }
        return false;
    }
}
