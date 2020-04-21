package com.mudule.mumzonemarketcal.executor;

import com.mudule.mumzonemarketcal.common.ThreadParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Description: 线程池接口实现类
 * @ClassName: ConcurrentThreadPool
 * @Author: dzt
 * @CreateDate: 2019/3/2 16:28
 * @UpdateUser: dzt
 * @UpdateDate: 2019/3/2 16:28
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
@Slf4j
@Service
public class ConcurrentThreadPool implements IConcurrentThreadPool {
    /**
     * 设置公共变量信息
     */
    /**
     * 规则
     * 1、如果线程数量<=核心线程数量，那么直接启动一个核心线程来执行任务，不会放入队列中
     * 2、如果线程数量>核心线程数量，但是<=最大线程数，并且任务队列是LinkedBlockingQueue的时候，超过核心线程数量的任务会放在任务队列中
     * 3、如果线程数量>核心线程数量，但是<=最大线程数，并且任务队列是SynchronousQueue的时候，线程池会创建新的线程执行任务，这些任务也不会放在任务队列中，这些线程属于非核心线程，在任务完成之后，闲置时间达到最大时间就会被清除
     * 4、如果线程数量>核心线程数，并且>最大线程数，当任务队列是LinkedBlockingDeque，会将超过核心线程的任务放在任务队列中排队。也就是当任务队列是LinkedBlockingDeque并且没有大小限制时，线程池的最大线程数设置是无效的，他的线程数最多不会超过核心线程数
     * 5、如果线程数量>核心线程数，并且>最大线程数，当任务队列是SynchronousQueue的时候，会因为线程池拒绝添加任务而抛出异常。
     * 6、当LinkedBlockingDeque塞满时，新增的任务会直接创建新线程来执行，当创建的线程数量超过最大线程数量时会抛异常
     * 7、SynchronousQueue没有数量限制。因为他根本不保持这些任务，而是直接交给线程池去执行。当任务数量超过最大线程数时会直接抛异常。
     */
    /**
     * 线程池执行器
     */
    private ThreadPoolExecutor threadPoolExecutor;

    @PostConstruct
    public void init(){
        try {
            initConcurrentThreadPool();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("初始化线程池失败!",e);
        }
    }

    /**
     * 单任务提交
     * @param task
     * @param <T>
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @Override
    public <T> T submit(CallableTasks<T> task) throws InterruptedException, ExecutionException {
        threadPoolExecutor.submit(task);
        return null;
    }

    /**
     * 初始化线程池
     */
    @Override
    public void initConcurrentThreadPool() throws IOException {
        log.info("进行异步任务线程池的初始化...");
        threadPoolExecutor=new ThreadPoolExecutor(
                ThreadParam.corePoolSize,
                ThreadParam.maximumPoolSize,
                ThreadParam.keepAliveTime,
                TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>()
        );
//        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor=new ScheduledThreadPoolExecutor(20);
//        scheduledThreadPoolExecutor.setKeepAliveTime(30,TimeUnit.SECONDS);
//        scheduledThreadPoolExecutor.setMaximumPoolSize(1000);
    }

    /**
     * 多任务提交
     * @param callableTasks
     * @param <T>
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @Override
    public <T> List<T> invokeAll(List<? extends CallableTasks<T>> callableTasks) throws InterruptedException, ExecutionException {
        threadPoolExecutor.invokeAll(callableTasks);
        return new ArrayList<>();
    }



}
