package com.mudule.mumzonemarketcal.service;

import java.text.ParseException;
import java.util.Map;

/**
 * @Description 服务预约和小儿游泳服务预约服务类
 * @ClassName AppointmentService
 * @Autor DZT
 * @Date 2019/4/28 14:39
 * @Version 1.0
 */
public interface AppointmentService {
    /**
     * 查询门店技师当前日期占用时间情况
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @return 返回值格式key为当天时间段开始时间hh:mm； value为当前时间段结束时间hh:mm
     */
    Map<String,String> queryShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime);
    /**
     * 查询门店技师当前日期占用时间情况 BY key
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @param key 被占用时间key
     * @return 返回值格式key为当天时间段开始时间hh:mm； value为当前时间段结束时间hh:mm
     */
    String queryShopTechnicianOccupyTimesByKey(String shopId, String technicianId, String dateTime, String key);
    /**
     * 插入门店技师当前日期占用时间
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @param timesList 当前技师占用的时间段集合
     * @return
     */
    boolean insertShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, Map<String, String> timesList);

    /**
     * 释放门店技师当前时间占用时间
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @param timesList 当前技师释放的时间段集合
     * @return
     */
    boolean releaseShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, Map<String, String> timesList);

    /**
     * 判断门店技师当前时间是否被占用
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当期日期yyyyMMdd格式
     * @param timesList 当前技师释放的时间段集合
     * @return
     */
    boolean checkShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, Map<String, String> timesList) throws ParseException;

    /**
     * 更新门店技师当前时间的被占用时长
     * @param shopId
     * @param technicianId
     * @param dateTime
     * @param key
     * @param value
     * @return
     */
    boolean updateShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, String key, String value);

    /**
     * 删除门店技师当前时间的被占用时长
     * @param shopId
     * @param technicianId
     * @param dateTime
     * @param key
     * @return
     */
    boolean deleteShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, String key);

}
