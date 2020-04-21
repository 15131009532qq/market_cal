package com.mudule.mumzonemarketcal.executor;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @Description: 多线程任务
 * @ClassName: CallableTasks
 * @Author: dzt
 * @CreateDate: 2019/4/3 10:50
 * @UpdateUser: dzt
 * @UpdateDate: 2019/4/3 10:50
 * @UpdateRemark: 修改备注
 * @Version: 1.0
 */
@Slf4j
public abstract class CallableTasks<T> implements Callable<T> {
    /**
     * 前置处理
     */
    public void beforeProcess(){
        //TODO 添加执行前处理逻辑

    }
    /**
     * 逻辑处理
     * @return
     */
    public abstract  T process() throws Exception;

    /**
     * 后置处理
     */
    public void afterProcess(){
        //TODO 添加执行后处理逻辑
        //logger.info("执行任务后处理...");
    }

    @Override
    public T call() throws Exception{
        beforeProcess();
        T result=process();
        afterProcess();
        return result;
    }
}
