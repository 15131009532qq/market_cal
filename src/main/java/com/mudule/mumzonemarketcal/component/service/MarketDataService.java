package com.mudule.mumzonemarketcal.component.service;

import com.mudule.mumzonemarketcal.component.po.market.MarketTicket;
import com.mudule.mumzonemarketcal.component.vo.TicketVo;

import java.util.List;

/**
 * @Description 营销基础业务数据组装
 * @ClassName MarketDataService
 * @Autor DZT
 * @Date 2019/3/18 10:55
 * @Version 1.0
 */
public interface MarketDataService {
    /**
     * 根据体验劵id和订单类型-->查询体验劵信息
     * @param ticketId
     * @param goodsType
     * @return
     */
    List<TicketVo> getExperienceTicketById(String ticketId,String goodsType);

    /**
     * 根据timeCardId判断是否能对serviceId使用
     * @param timeCardId
     * @param serviceId
     * @return
     */
    boolean checkOutTimeCardUse(String timeCardId,String serviceId);


}

