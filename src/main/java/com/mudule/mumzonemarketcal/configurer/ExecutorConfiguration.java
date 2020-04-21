package com.mudule.mumzonemarketcal.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description 线程池配置类
 * @ClassName ExecutorConfiguration
 * @Autor DZT
 * @Date 2019/3/13 14:20
 * @Version 1.0
 */
@Configuration
public class ExecutorConfiguration {
    /**
     * 线程池异步执行
     * 核心线程数 corePoolSize 10
     * 最大线程数 maximumPoolSize 200
     * 线程池维护线程所允许的空闲时间  60L
     * 时间单位 TimeUnit.SECONDS 秒
     * 任务队列 SynchronousQueue
     * @return
     */
    @Bean("executorPoolAsync")
    public ThreadPoolExecutor executorPoolAsync() {
        return new ThreadPoolExecutor(10, 200,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }
}
