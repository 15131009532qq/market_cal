package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;


/**
 * @Description 商品折扣  商品变价
 * @ClassName GoodsDiscountCal
 * @Autor DZT
 * @Date 2019/10/10 17:05
 * @Version 1.0
 */
@Slf4j
public class GoodsDiscountCal implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public GoodsDiscountCal(){

    }
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->计算商品折扣");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        responseDiscountVo.setOrderVo(orderVo);
        List<OrderSubVo> goods=orderVo.getGoods();
        boolean flag=goods.stream().anyMatch(orderSubVo -> StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&(new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0));
        //2、判断是否使用积分抵现
        if (flag){
            log.info("商品折扣--->执行商品折扣策略");
            BigDecimal discount=new BigDecimal(0.00);
            for (OrderSubVo orderSubVo:goods){
                BigDecimal goodsDiscount=new BigDecimal(0.00);
                if (StringUtils.isNotEmpty(orderSubVo.getSecondPrice())&&new BigDecimal(orderSubVo.getSecondPrice()).compareTo(BigDecimal.ZERO)>0){
                    //判断是否是议价
                    if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice())&&orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)>0){
                        //使用了议价
                    }else {
                       BigDecimal price=BigDecimal.ZERO;
                       price=price.add(orderSubVo.getPrice()).subtract(new BigDecimal(orderSubVo.getSecondPrice()));
                       int count=orderSubVo.getGoodsCount()-orderSubVo.getPresentNum();
                       goodsDiscount=goodsDiscount.add(price.multiply(new BigDecimal(count))).setScale(2,BigDecimal.ROUND_UP);
                       discount=discount.add(goodsDiscount);
                    }
                }
                orderSubVo.setGoodsDiscount(goodsDiscount);
            }
            orderVo.setGoods(goods);
            orderVo.setGoodsDiscount(discount);
            responseDiscountVo.setOrderVo(orderVo);
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            responseDiscountVo.setGoodsDiscount(discount);
            return responseDiscountVo;
        }else {
            log.info("无商品折扣--->执行商品折扣策略");
            responseDiscountVo.setCode(UseConstant.SUCCESS);
            return responseDiscountVo;
        }
    }
}
