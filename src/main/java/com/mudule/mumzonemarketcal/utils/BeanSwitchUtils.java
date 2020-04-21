package com.mudule.mumzonemarketcal.utils;

import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.market.rules.ReflectASMUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @Description 请输入类描述信息
 * @ClassName BeanSwitchUtils
 * @Autor DZT
 * @Date 2019/7/5 14:24
 * @Version 1.0
 */
@Slf4j
public class BeanSwitchUtils {

    /**
     * 实现两个ResponseDiscountVo对象属性赋值
     * @param r1 目标对象
     * @param r2 源对象
     * @return
     */
    public static ResponseDiscountVo responseDiscountAttributeToSwitch(ResponseDiscountVo r1,ResponseDiscountVo r2){
        OrderVo orderVo=r2.getOrderVo();
        r1.setOrderVo(orderVo);
        List<DiscountItem> list=r2.getDiscountItem();
        r2.setDiscountItem(list);
        BeanUtils.copyProperties(r1,r2);
        return r1;
    }
    /**
     * 实现两个OrderVo对象属性赋值
     * @param r1 目标对象
     * @param r2 源对象
     * @return
     */
    public static OrderVo orderVoAttributeToSwitch(OrderVo r1,OrderVo r2){
        List<OrderSubVo> list1=r2.getGoods();
        List<ActivityVo> list2=r2.getActivityVoList();
        List<TicketVo> list3=r2.getTicketVoList();
        List<TimesCardVo> list4=r2.getMemberTimesCardArray();
        TicketVo ticketVo=r2.getTicketVo();
        BeanUtils.copyProperties(r1,r2);
        ReflectASMUtils.copyProperties(r1,r2);
        r1.setTicketVo(ticketVo);
        r1.setMemberTimesCardArray(list4);
        r1.setActivityVoList(list2);
        r1.setTicketVoList(list3);
        r1.setGoods(list1);
        return r1;
    }
}
