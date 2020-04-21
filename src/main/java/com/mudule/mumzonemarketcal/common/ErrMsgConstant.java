package com.mudule.mumzonemarketcal.common;

/**
 * @Description 异常信息提示语句
 * @ClassName ErrMsgConstant
 * @Autor DZT
 * @Date 2019/3/14 16:35
 * @Version 1.0
 */
public interface ErrMsgConstant {
    /**
     * 发生异常时默认提示语
     */
    String ERROR_MESSAGE = "系统错误!请重新请求!";
    String EXPERIENCE_TIMECARD_NO_COMM_USE="体验劵和计次卡不能针对同一个预约服务进行使用!";
    String SUBAPPOINTMENT_HAS_TICKET="针对同一服务体验券不能与其他支付方式共用！";
    String NO_ORDER_TYPE="没有对应的订单类型";
    String TIME_CARD_NUM_ERR="针对同一服务计次卡不能与其他支付方式共用！";
    String TIME_CARD_MORENUM_ERR="次卡数不能多于服务数！";
    String TICKET_INFO_ERR="满减券信息错误！";
    String SERVICE_NO_EQ_TICKET_AMOUNT="服务不满足满减券的金额！";
    String GOODS_NO_EQ_TICKET_AMOUNT = "商品不满足满减券的金额！";
    String TICKET_NO_SERVICES="满减券没有对应的服务可用！";
    String TICKET_NO_GOODS="满减券没有对应的商品可用！";
    String TIME_CARD_INFO_ERR="次卡信息有误！";
    String ORDER_NO_USE_TICKET_AMOUNT="订单待支付金额不满足满减劵使用限额！";
    String CAL_SUCCESS="计算成功";
    String EMAIL_SUBOBJECT_OR_CONTEXT_NO_NULL="主题或消息内容不能为空！";
    String SEND_SUCCESS="发送成功";
    String PARAMS_NO_NULL="参数不能为空！";
    String CREATE_SUB_TASK_FAIL="创建子任务失败！";
    String SUCCESS="成功";
    String TO_PAY_LESS_DISCOUNT_AMOUNT="待支付金额小于折扣金额！请重新选择！";
    String ONE_GOODS_NO_JOIN_MARKET="同一商品不能参与两种优惠！";
    String NO_JOIN_MARKET_GOODS="活动没有对应商品，无法使用~!";
    String TO_PAY_AMOUNT_EXCEED_ACTIVITY_AMOUNT="不满足活动条件，无法使用~!";
    String ACTIVITY_TYPE_ERR="优惠活动类型异常！";
    String QUERY_MEMBER_LEVEL_ERR="查询会员等级失败!";
    String MEMBER_LEVEL_EXCEED_ACTIVITY="该会员等级不满足活动条件，无法使用~!";
    String INTERGAL_RULE_QUERY_ERR="查询积分规则失败！";
    String ONE_SERVICE_NO_JOIN_MARKET="同一服务不能参与两种优惠！";
    String TICKET_NO_EQ_TICKET_AMOUNT="不满足使用限额!";
}
