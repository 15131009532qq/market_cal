package com.mudule.mumzonemarketcal.constant;

import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.TicketVo;
import com.mudule.mumzonemarketcal.utils.StringUtils;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/**
 * @Description 规则运算静态方法
 * @ClassName RuleCalConstant
 * @Autor DZT
 * @Date 2019/6/28 16:20
 * @Version 1.0
 */
public class RuleCalConstant {
    /**
     * 比较两个BigDecimal的大小 arg1-arg2
     * @param arg1
     * @param arg2
     * @return
     */
    public static int checkBigDecimal(BigDecimal arg1,BigDecimal arg2){
        return arg1.compareTo(arg2);
    }

    /**
     * 比较BigDecimal是否大于BigDecimal.ZERO
     * @param arg1
     * @return
     */
    public static boolean checkBigDecimalZero(BigDecimal arg1){
        int index=arg1.compareTo(BigDecimal.ZERO);
        if (index<=0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 比较BigDecimal是否大于BigDecimal.ZERO
     * @param arg1
     * @return
     */
    public static boolean checkBigDecimalZero(String arg1){
        int index=new BigDecimal(arg1).compareTo(BigDecimal.ZERO);
        if (index<=0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 营销规则调整
     * @param orderVo
     * @param ticketVo
     * @return
     */
    public static OrderVo processMarketRuleAdjust(OrderVo orderVo, TicketVo ticketVo){
        if (StringUtils.isEmpty(orderVo)||StringUtils.isEmpty(ticketVo)){
            return orderVo;
        }
        List<TicketVo> ticketVoList=orderVo.getTicketVoList();
        for (Iterator iterator = ticketVoList.iterator(); iterator.hasNext();){
            TicketVo ticketVo1=(TicketVo) iterator.next();
            if (ticketVo.getIndex()==ticketVo1.getIndex()){
                if (iterator.hasNext()){
                    TicketVo ticketVo2=(TicketVo)iterator.next();
                    orderVo.setTicketVo(ticketVo2);
                    break;
                }else {
                    orderVo.setTicketVo(null);
                }
            }
        }
        return orderVo;
    }
    /**
     * 设置营销规则的调整
     *        默认取当前最高的index级别的优惠选项 index 优先级 获取最高优先级TicketVo
     * @param orderVo
     * @return
     */
    public static OrderVo forMarketSequenceAdjustment(OrderVo orderVo){
        List<TicketVo> ticketVoList=orderVo.getTicketVoList();
        if (StringUtils.isNotEmpty(ticketVoList)&&ticketVoList.size()>0){
            orderVo.setTicketVo(ticketVoList.get(0));
        }
        return orderVo;
    }
}
