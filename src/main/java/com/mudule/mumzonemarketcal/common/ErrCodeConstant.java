package com.mudule.mumzonemarketcal.common;

/**
 * @Description 异常错误码静态类
 * @ClassName ErrCodeConstant
 * @Autor DZT
 * @Date 2019/3/22 15:59
 * @Version 1.0
 */
public interface ErrCodeConstant {
    /**
     * 计次卡异常使用 暂时通用使用这一种错误码
     */
    int TIMECARDERR=401;
    /**
     * 优惠券异常使用
     */
    int TICKETERR=406;
    /**
     * 体验劵异常使用
     */
    int EXPERIENCEERR=407;
    /**
     * 服务参数异常
     */
    int SERVICE_RUN_ERR=500;

    /**
     * 优惠券异常
     */
    int WITHREDUCE_ERR = 405;
    /**
     * 成功状态
     */
    String SUCCESS_CODE="200";
    /**
     * 失败状态
     */
    String FAIL_CODE="400";
}

