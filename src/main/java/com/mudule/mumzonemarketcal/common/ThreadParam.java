package com.mudule.mumzonemarketcal.common;

/**
 * @Description 请输入类描述信息
 * @ClassName ThreadParam
 * @Autor DZT
 * @Date 2019/4/3 12:43
 * @Version 1.0
 */
public interface ThreadParam {
    //核心线程数
     int corePoolSize=50;
    //最大线程数
     int maximumPoolSize=1000;
    //超时时间
     long keepAliveTime=30;
}
