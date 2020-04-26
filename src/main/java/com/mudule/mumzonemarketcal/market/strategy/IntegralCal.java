package com.mudule.mumzonemarketcal.market.strategy;

import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ConstantCommMethod;
import com.mudule.mumzonemarketcal.common.ErrCodeConstant;
import com.mudule.mumzonemarketcal.common.ErrMsgConstant;
import com.mudule.mumzonemarketcal.component.mapper.member.MemberCompanyMapper;
import com.mudule.mumzonemarketcal.component.mapper.member.MemberMapper;
import com.mudule.mumzonemarketcal.component.po.member.MemberCompany;
import com.mudule.mumzonemarketcal.component.vo.*;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.enums.IsTimerCardEnum;
import com.mudule.mumzonemarketcal.enums.OrderTypeEnum;
import com.mudule.mumzonemarketcal.enums.PriceTypeEnum;
import com.mudule.mumzonemarketcal.exception.MarketException;
import com.mudule.mumzonemarketcal.market.base.MarketStrategy;
import com.mudule.mumzonemarketcal.service.FeiginService;
import com.mudule.mumzonemarketcal.service.impl.FeiginServiceImpl;
import com.mudule.mumzonemarketcal.utils.DateUtil;
import com.mudule.mumzonemarketcal.utils.SortUtil;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description 积分-->获得积分
 * @ClassName IntegralCal
 * @Autor DZT
 * @Date 2019/3/13 14:54
 * @Version 1.0
 */
@Slf4j
public class IntegralCal implements MarketStrategy {

    private FeiginService feiginService;
    private MemberMapper memberMapper;
    private MemberCompanyMapper memberCompanyMapper;
    /**
     * 无参数构造器进行参数注入
     * 请手动注入
     */
    public IntegralCal(){
        this.feiginService=(FeiginServiceImpl)SpringContext.getContext().getBean(BeanNameConstant.FEIGINSERVICEIMPL);
        this.memberMapper=(MemberMapper)SpringContext.getContext().getBean(BeanNameConstant.MEMBERMAPPER);
        this.memberCompanyMapper=(MemberCompanyMapper)SpringContext.getContext().getBean(BeanNameConstant.MEMBERCOMPANYMAPPER);
    }

    @Override
    public ResponseDiscountVo calMarket(OrderVo orderVo) {
        log.info("营销---------------->获取积分以及积分均摊计算");
        return responseDiscountVo;
    }
}