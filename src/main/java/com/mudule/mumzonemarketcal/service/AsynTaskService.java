package com.mudule.mumzonemarketcal.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @Description 异步任务service
 * @ClassName AsynTaskService
 * @Autor DZT
 * @Date 2019/4/3 11:10
 * @Version 1.0
 */
public interface AsynTaskService {
    /**
     * 设置单异步任务
     * @param id
     * @param minutes
     * @return
     */
    boolean setChildrenSwimTimes(String id,String minutes);

    /**
     * 设置单异步任务Batch
     * @return
     */
    boolean setChildrenSwimTimesBatch(List<Map<String,String>> list);

    /**
     * 释放小儿游泳技师的占用时间
     * @param id
     * @return
     */
    Map<String,String> exectuorRelaseChildrenSwimTime(String id) throws ParseException;
}
