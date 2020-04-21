package com.mudule.mumzonemarketcal.service.impl;

import com.mudule.mumzonemarketcal.component.vo.Message;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountListVo;
import com.mudule.mumzonemarketcal.component.vo.ResponseDiscountVo;
import com.mudule.mumzonemarketcal.constant.BeanNameConstant;
import com.mudule.mumzonemarketcal.constant.OrderConstant;
import com.mudule.mumzonemarketcal.constant.TicketType;
import com.mudule.mumzonemarketcal.constant.UseConstant;
import com.mudule.mumzonemarketcal.service.DroolsService;
import com.mudule.mumzonemarketcal.service.RuleExecuteService;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.command.Command;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.command.CommandFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static com.mudule.mumzonemarketcal.constant.RuleCalConstant.forMarketSequenceAdjustment;

/**
 * @Description 规则执行引擎服务实现类
 * @ClassName DroolsServiceImpl
 * @Autor DZT
 * @Date 2019/3/12 15:29
 * @Version 1.0
 */
@Service
@Slf4j
@Lazy
public class DroolsServiceImpl implements DroolsService {

    @Resource
    private RuleExecuteService ruleExecuteService;

    @Autowired
    private KieBase kieBase;
    /**
     * 测试
     * @return
     */
    @Override
    public String fireRule() {
        // load up the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");
        // go !
        Message message = new Message();
        message.setMessage("Goodbye");
        message.setStatus(Message.HELLO);
        kSession.insert(message);//插入
        kSession.fireAllRules();//执行规则
        kSession.dispose();
        return message.getMessage();
    }

    /**
     * 营销计算规则
     * POS端
     * APP端
     * WEB端
     * 小程序
     * 公众号
     * 后台
     * ...
     * @return
     */
    @Override
    public ResponseDiscountVo MarketCalRule(OrderVo orderVo) {
        log.info("进入引擎计算...");
        orderVo=forMarketSequenceAdjustment(orderVo);//设置营销规则执行的入口选项
        ResponseDiscountVo responseDiscountVo=new ResponseDiscountVo();
        StatelessKieSession kieSession=kieBase.newStatelessKieSession();
        //策略计算结果集
        ResponseDiscountListVo responseDiscountListVo=new ResponseDiscountListVo();
        responseDiscountListVo.setResponseDiscountVos(new ArrayList<>());
        //全局变量
        kieSession.setGlobal(BeanNameConstant.RULEEXECUTESERVICE,ruleExecuteService);//服务类
        kieSession.setGlobal(UseConstant.SERVICEORDER_STR,OrderConstant.SERVICEORDER);//订单类型:服务
        kieSession.setGlobal(UseConstant.GOODSORDER_STR,OrderConstant.GOODSORDER);//订单类型:商品
        kieSession.setGlobal(UseConstant.TIMESCARDORDER_STR,OrderConstant.TIMESCARDORDER);//订单类型:计次卡
        kieSession.setGlobal(UseConstant.EXPERIENCETICKET_TYPE_STR, TicketType.EXPERIENCETICKET_TYPE);//优惠类型:体验劵
        kieSession.setGlobal(UseConstant.TIMECARD_STR, TicketType.TIMECARD);//优惠类型:计次卡
        kieSession.setGlobal(UseConstant.DISCOUNTCOUPONS_STR, TicketType.DISCOUNTCOUPONS);//优惠类型:满减劵
        kieSession.setGlobal(UseConstant.WITHDISCOUNTCOUPONS_STR, TicketType.WITH_DISCOUNT_COUPONS);//优惠类型:满减劵
        kieSession.setGlobal(UseConstant.SUCCESS,UseConstant.SUCCESS);//SUCCESS
        kieSession.setGlobal(UseConstant.CALSUCCESS_STR,UseConstant.CALSUCCESS);//SUCCESS
        //执行命令
        List<Command> cmds=new ArrayList<>();
        cmds.add(CommandFactory.newInsert(responseDiscountVo));
        cmds.add(CommandFactory.newInsert(orderVo));
        cmds.add(CommandFactory.newInsert(responseDiscountListVo));
        kieSession.execute(CommandFactory.newBatchExecution(cmds));
        log.info("计算之后结果集{}",responseDiscountVo);
        return responseDiscountVo;
    }
}
