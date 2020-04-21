package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.component.vo.DiscountItem;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.component.vo.TicketVo;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 组合支付 金额计算
 *              组合支付：现金、余额、支付宝、计次卡
 *                      现金、余额、微信、计次卡
 *                      现金、余额、银行卡、计次卡
 *                      现金、支付宝、计次卡
 *                      现金、微信、计次卡
 *                      现金、银行卡、计次卡
 *                      余额、支付宝、计次卡
 *                      余额、微信、计次卡
 *                      余额、银行卡、计次卡
 *                      余额、支付宝
 *                      余额、微信
 *                      余额、银行卡
 *                      现金、支付宝
 *                      现金、微信
 *                      现金、银行卡
 *
 * @ClassName CombinationPayCal
 * @Autor DZT
 * @Date 2019/8/20 10:03
 * @Version 1.0
 */
@Slf4j
public class CombinationPayCal implements MarketStrategy {

    public CombinationPayCal(){
    }

    /**
     * 组合支付 金额计算
     * @param orderVo
     * @return
     */
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("组合支付--------------->计算组合支付支付金额");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        responseDiscountVo.setOrderVo(orderVo);
        //1、获取营销列表
        List<TicketVo> list=orderVo.getTicketVoList();
        boolean flag= list.stream().anyMatch(x->x.getTicketType().equals(TicketType.CASH)||x.getTicketType().equals(TicketType.BALANCE)||x.getTicketType().equals(TicketType.INTEGRAL_PAY));
        //2、判断是否有组合支付 包含现金和余额等组合支付
        if (flag){
            log.info("计算组合支付[{}]",orderVo.toString());
        }else {
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
        //3、进行组合支付
        responseDiscountVo = this.goodsMarket(list,orderVo,responseDiscountVo);
        return responseDiscountVo;
    }

    /**
     * 组合支付
     * @param list
     * @param orderVo
     * @param responseDiscountVo
     * @return
     */
    public ResponseDiscountVo goodsMarket(List<TicketVo> list,OrderVo orderVo,ResponseDiscountVo responseDiscountVo){
        List<DiscountItem> discountItems = new ArrayList<>();
        for (TicketVo ticketVo:list){
            DiscountItem discountItem = new DiscountItem();
            switch (ticketVo.getTicketType()){
                case TicketType.CASH: discountItem.setName(UseConstant.CASH_NAME);
                    break;
                case TicketType.BALANCE: discountItem.setName(UseConstant.BALANCE_NAME);
                    break;
                default: continue;
            }
            discountItem.setId("");
            discountItem.setDiscount(ticketVo.getTicketAmount());
            discountItem.setDiscountType(ticketVo.getTicketType());
            discountItems.add(discountItem);
        }
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        responseDiscountVo.setDiscountItem(discountItems);
        return responseDiscountVo;
    }
}
