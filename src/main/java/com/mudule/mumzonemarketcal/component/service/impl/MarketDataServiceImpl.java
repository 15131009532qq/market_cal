package com.mudule.mumzonemarketcal.component.service.impl;

import com.mudule.mumzonemarketcal.component.mapper.goods.GoodsCardServiceMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketGoodsMapper;
import com.mudule.mumzonemarketcal.component.mapper.market.MarketTicketMapper;
import com.mudule.mumzonemarketcal.component.mapper.member.MemberTimesCardMapper;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsCardService;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsCardServiceExample;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicket;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoods;
import com.mudule.mumzonemarketcal.component.po.market.MarketTicketGoodsExample;
import com.mudule.mumzonemarketcal.component.po.member.MemberTimesCard;
import com.mudule.mumzonemarketcal.component.service.MarketDataService;
import com.mudule.mumzonemarketcal.component.vo.TicketVo;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 营销基础业务数据组装实现类
 * @ClassName MarketDataServiceImpl
 * @Autor DZT
 * @Date 2019/3/18 10:56
 * @Version 1.0
 */
@Slf4j
public class MarketDataServiceImpl implements MarketDataService {

    private MarketTicketGoodsMapper marketTicketGoodsMapper;
    private MarketTicketMapper marketTicketMapper;
    private MemberTimesCardMapper memberTimesCardMapper;
    private GoodsCardServiceMapper goodsCardServiceMapper;

    public MarketDataServiceImpl(){
        this.marketTicketMapper=(MarketTicketMapper) SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETMAPPER);
        this.marketTicketGoodsMapper=(MarketTicketGoodsMapper) SpringContext.getContext().getBean(BeanNameConstant.MARKETTICKETGOODSMAPPER);
        this.memberTimesCardMapper=(MemberTimesCardMapper)SpringContext.getContext().getBean(BeanNameConstant.MEMBERTIMESCARDMAPPER);
        this.goodsCardServiceMapper=(GoodsCardServiceMapper)SpringContext.getContext().getBean(BeanNameConstant.GOODSCARDSERVICEMAPPER);
    }

    /**
     * 根据体验劵id和订单类型-->查询体验劵信息
     * @param ticketId
     * @param goodsType
     * @return
     */
    @Override
    public List<TicketVo> getExperienceTicketById(String ticketId, String goodsType) {
        List<TicketVo> list=new ArrayList<>();
        MarketTicket marketTicket=marketTicketMapper.selectByPrimaryKey(ticketId);
        MarketTicketGoodsExample marketTicketGoodsExample=new MarketTicketGoodsExample();
        marketTicketGoodsExample.createCriteria()
                .andTicketIdEqualTo(ticketId)
                .andGoodsTypeEqualTo(new Byte(OrderConstant.SERVICEORDER));
        List<MarketTicketGoods> marketTicketGoodsList=marketTicketGoodsMapper.selectByExample(marketTicketGoodsExample);
        if (StringUtils.isNotEmpty(marketTicketGoodsList)){
            for (MarketTicketGoods marketExperienceService : marketTicketGoodsList) {
                TicketVo ticketVo=new TicketVo();
                ticketVo.setTicketId(marketExperienceService.getGoodsId());//优惠券id
                ticketVo.setTicketName(marketTicket.getTicketName());
                ticketVo.setTicketAmount(marketTicket.getTicketAmount());
                list.add(ticketVo);
            }
        }
        return list;
    }

    /**
     * 根据次卡id判断是否能对服务id使用
     * @param timeCardId
     * @param serviceId
     * @return
     */
    @Override
    public boolean checkOutTimeCardUse(String timeCardId, String serviceId) {
        //查询次卡Id对应的服务--查询支付方式是否有计次卡支付
        //查询会员次卡信息
        MemberTimesCard memberTimesCard=memberTimesCardMapper.selectByPrimaryKey(timeCardId);
        if(StringUtils.isNotEmpty(memberTimesCard)){
            return false;
        }
        GoodsCardServiceExample goodsCardServiceExample=new GoodsCardServiceExample();
        goodsCardServiceExample.createCriteria()
                .andCardIdEqualTo(memberTimesCard.getGoodsId());
        //默认取第一个集合
        List<GoodsCardService> goodsCardServiceList=goodsCardServiceMapper.selectByExample(goodsCardServiceExample);
        if (StringUtils.isEmpty(goodsCardServiceList)){
            return false;
        }
        //校验次卡id是否能支付该服务
        if (serviceId.equals(goodsCardServiceList.get(0).getServiceId())){
            return true;
        }
        return false;
    }
}
