package com.mudule.mumzonemarketcal.executor;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @Description: 线程池接口
 * @ClassName: IConcurrentThreadPool
 * @Author: dzt
 * @CreateDate: 2019/3/2 16:26
 * @UpdateUser: dzt
 * @UpdateDate: 2019/3/2 16:26
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
public interface IConcurrentThreadPool {

    /**
     * 初始化线程
     */
    void initConcurrentThreadPool() throws IOException;

    /**
     * 提交单个任务
     */
    <T> T submit(CallableTasks<T> task) throws InterruptedException, ExecutionException;

    /**
     * 提交多个任务
     */
    <T> List<T> invokeAll(List<? extends CallableTasks<T>> tasks) throws InterruptedException, ExecutionException;
}
