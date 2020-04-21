package com.mudule.mumzonemarketcal.common;

/**
 * @Description 静态常量信息
 * @ClassName ReqPathConstant
 * @Autor DZT
 * @Date 2019/3/12 18:25
 * @Version 1.0
 */
public interface ReqPathConstant {
    /**
     * ##############################POS端##############################
     */
    //POS端请求根路径
    String MARKETCAL="/api/v1.2/pos";
    //计算POS端折扣信息
    String MARKETCALMETHOD="/endBill/calculateAmountToPay";




    /**
     * ##############################POS端##############################
     */
    //小儿游泳异步任务
    String ASYNTASK="/api/v1.5/asyn";
    //异步释放小儿游泳技师时间
    String REALSESWIMTIMES="/realse/childrenSwimtimes";
    //异步释放小儿游泳技师时间 批量异步
    String REALSESWIMTIMESBatch="/realse/childrenSwimtimesBatch";

    /**
     * ##############################POS端##############################
     */
    //发送邮箱
    String SEND_MAIL="/api/v2/send";
    String SEND_EMAIL="/email/asynSend";
}
