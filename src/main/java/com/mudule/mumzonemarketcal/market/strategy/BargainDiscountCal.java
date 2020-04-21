package com.mudule.mumzonemarketcal.market.strategy;

import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 议价优惠策略
 * @ClassName BargainDiscountCal
 * @Autor DZT
 * @Date 2019/3/21 15:38
 * @Version 1.0
 */
@Slf4j
public class BargainDiscountCal  implements MarketStrategy {
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public BargainDiscountCal(){

    }
    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销--------------->计算优惠折扣");
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        BigDecimal bargainDiscount=new BigDecimal(0.00);//议价折扣
        boolean flag=false;
        //1、判断是否使用了议价--目前只针对商品
        if (OrderConstant.GOODSORDER.equals(orderVo.getOrderType())){
            List<OrderSubVo> orderSubVoList=orderVo.getGoods();
            for (Iterator<OrderSubVo> iterator=orderSubVoList.iterator();iterator.hasNext();){
                OrderSubVo orderSubVo=iterator.next();
                //排除赠品 TODO
                if (StringUtils.isNotEmpty(orderSubVo.getBargainPrice())&&orderSubVo.getBargainPrice().compareTo(BigDecimal.ZERO)==1){
                    flag=true;
                    bargainDiscount=bargainDiscount.add(orderSubVo.getPrice().subtract(orderSubVo.getBargainPrice()).multiply(new BigDecimal(orderSubVo.getGoodsCount()-orderSubVo.getPresentNum())));
                }
            }
            if (flag) {
                log.info("普通商品使用议价--------->执行议价优惠折扣");
            }else {
                log.info("普通商品未使用议价--------->不执行议价优惠折扣");
            }
        }else {
            log.info("除普通商品外--------->不执行议价优惠折扣");
        }
        responseDiscountVo.setOrderVo(orderVo);
        responseDiscountVo.setBargainDiscount(bargainDiscount);
        responseDiscountVo.setCode(UseConstant.SUCCESS);
        return responseDiscountVo;
    }
}
