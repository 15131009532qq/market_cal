package com.mudule.mumzonemarketcal.executor;

import com.mudule.mumzonemarketcal.common.ThreadParam;
import io.netty.util.concurrent.ScheduledFuture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description 请输入类描述信息
 * @ClassName AsyScheduledThreadPoolExecutor
 * @Autor DZT
 * @Date 2019/4/12 11:57
 * @Version 1.0
 */
@Slf4j
@Component
public class AsyScheduledThreadPoolExecutor {

    /**
     * 子属性
     */
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    @PostConstruct
    public void init(){
        scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(ThreadParam.corePoolSize);
        scheduledThreadPoolExecutor.setMaximumPoolSize(ThreadParam.maximumPoolSize);
    }

    /**
     * 执行延迟任务
     * @param task
     * @param time
     * @param unit
     * @param <T>
     * @return
     */
    public  <T> ScheduledFuture<T> schdule(CallableTasks<T> task, long time, TimeUnit unit){
       scheduledThreadPoolExecutor.schedule(task,time,unit);
       return null;
    }
}
