package com.mudule.mumzonemarketcal.aop;

import com.mudule.mumzonemarketcal.annotation.DataSource;
import com.mudule.mumzonemarketcal.enums.DataSourceEnum;
import com.mudule.mumzonemarketcal.mutiple.DataSourceContextHolder;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description 进行数据源的AOP切面设计 -->暂时不动态切数据源，而是直接绑对数据源对应的包
 * @ClassName DataSourceAspect
 * @Autor DZT
 * @Date 2019/3/12 13:53
 * @Version 1.0
 */
@Slf4j
public class DataSourceAspect {
    private long startTime = 0L;
    private long endTime = 0L;
    //TODO 可以设置多个切点
    /**
     * @Description 设置切点-->只要使用了@DataSource注解就是切点
     */
//   @Pointcut(value = "@annotation(com.mudule.mumzonemarketcal.annotation.DataSource)||" +
//            "bean(baseDataServiceImpl)||" +
//            "bean(goodsDataServiceImpl)||" +
//            "bean(marketDataServiceImpl)||" +
//            "bean(memberDataServiceImpl)||" +
//            "bean(orderDataServiceImpl)")
//    public void defaultDataSource(){}

//    @Before(value = "defaultDataSource()")
//    public void setDefaultDataSource(){
//
//    }
//    //没有注解,就选择默认的数据源
//    @Before(value = "@annotation(dataSource)&&defaultDataSource()")
//    public void setDynamicDataSource(DataSource dataSource){
//        startTime=System.currentTimeMillis();
//        if (StringUtils.isEmpty(dataSource)){
//            log.info("设置默认数据源"+DataSourceEnum.ORDER_DATA_SOURCE.getValue());
//            DataSourceContextHolder.setDataSource(DataSourceEnum.ORDER_DATA_SOURCE.getValue());
//        }else {
//            log.info("切换数据源"+dataSource.value());
//            DataSourceContextHolder.setDataSource(dataSource.value().getValue());
//        }
//    }
    /**
     * 使用切点之后-->后处理
     */
//    //清除该线程当前的数据
//    @After(value = "defaultDataSource()&&@annotation(com.mudule.mumzonemarketcal.annotation.DataSource)")
//    public void clean(){
//        endTime = System.currentTimeMillis();
//        long sqlCost = endTime - startTime;
//        startTime=0l;
//        endTime=0l;
//        log.info("执行耗时 : [" + sqlCost + "ms] ");
//        log.info("清除当前线程的数据源");
//        DataSourceContextHolder.clear();
//    }
}
