package com.mudule.mumzonemarketcal.service.impl;

import cn.egg.cloud.market.MarketServiceClient;
import com.mudule.mumzonemarketcal.exception.MarketException;
import com.mudule.mumzonemarketcal.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description 服务预约和小儿游泳服务预约服务实现
 * @ClassName AppointmentService
 * @Autor DZT
 * @Date 2019/4/28 14:39
 * @Version 1.0
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {
    /**
     * 全局日志对象
     */
     private static final Logger log= LoggerFactory.getLogger(AppointmentServiceImpl.class);

     @Autowired
     private RedisTemplate redisTemplate;

    /**
     * 查询门店技师当前日期占用时间情况
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @return
     */
    @Override
    public Map<String, String> queryShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime) {
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("查询"+hashKey+"时间占用情况");
        Map<String,String> maps= getRedisShopTechTimes(hashKey);
        return maps;
    }

    /**
     * 插入门店技师当前日期占用时间
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @param timesList 当前技师占用的时间段集合
     * @return
     */
    @Override
    public boolean insertShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, Map<String, String> timesList) {
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("插入"+hashKey+"被占用时间");
        //绑定数据集
        BoundHashOperations<String, String, String> boundHashOps = redisTemplate.boundHashOps(hashKey);
        //批量插入数据集
        boundHashOps.putAll(timesList);
        return true;
    }

    /**
     * 释放门店技师当前时间占用时间
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @param timesList 当前技师释放的时间段集合
     * @return
     */
    @Override
    public boolean releaseShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, Map<String, String> timesList) {
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("释放"+hashKey+"被占用时间");
        //绑定数据集
        BoundHashOperations<String, String, String> boundHashOps = redisTemplate.boundHashOps(hashKey);
        List<String> list=new ArrayList<>();
        for (Map.Entry<String,String> map:timesList.entrySet()){
            list.add(map.getKey());
        }
        String[] keys=new String[list.size()];
        list.toArray(keys);
        long result=boundHashOps.delete(keys);
        if (result<=0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * 检查技师是否被占用时间
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当期日期yyyyMMdd格式
     * @param timesList 当前技师释放的时间段集合
     * @return
     */
    @Override
    public boolean checkShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, Map<String, String> timesList) throws ParseException {
        //获取年月日 时分秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取年月日
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取时分
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("检查"+hashKey+"是否被占用,在时间段:"+timesList.toString());
        //查询技师的所有预约时间
        Map<String,String> mapList=getRedisShopTechTimes(hashKey);
        for (Map.Entry<String,String> map1:timesList.entrySet()){
            Date date1=dateFormat.parse(map1.getKey());//起始时间HH:mm
            Date date2=dateFormat.parse(map1.getValue());//结束时间HH:mm
            for (Map.Entry<String,String> map2:mapList.entrySet()){
                Date date3=dateFormat.parse(map2.getKey());
                Date date4=dateFormat.parse(map2.getValue());
                //判断起始时间点
                if (date1.getTime()>=date3.getTime()&&date1.getTime()<date4.getTime()){
                    return false;
                }
                //判断结束时间点
                if (date2.getTime()>=date3.getTime()&&date2.getTime()<date4.getTime()){
                    return false;
                }
                //判断时间段
                if (date1.getTime()>=date3.getTime()&&date2.getTime()<date4.getTime()){
                    return false;
                }
            }
        }
        //说明技师的时间端内未被占用
        return true;
    }

    /**
     * 提取hash表的keys集合
     * @param hashKey
     * @return
     */
    public  Map<String,String> getRedisShopTechTimes(String hashKey){
        //返回结果集信息
        Map<String,String> maps= redisTemplate.opsForHash().entries(hashKey);
        return maps;
    }

    /**
     * 查询门店技师当前日期占用时间情况 BY key
     * @param shopId 门店ID
     * @param technicianId 技师ID
     * @param dateTime 当前日期yyyyMMdd格式
     * @param key 被占用时间key
     * @return
     */
    @Override
    public String queryShopTechnicianOccupyTimesByKey(String shopId, String technicianId, String dateTime, String key) {
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("查询"+hashKey+":"+key+"被占用时间");
        String value=redisTemplate.opsForHash().get(hashKey,key).toString();
        return value;
    }

    /**
     * 更新门店技师当前时间的被占用时长
     * @param shopId
     * @param technicianId
     * @param dateTime
     * @param key
     * @param value
     * @return
     */
    @Override
    public boolean updateShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, String key, String value) {
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("查询"+hashKey+":"+key+"被占用时间");
        redisTemplate.opsForHash().put(hashKey,key,value);
        return true;
    }

    /**
     * 删除门店技师当前时间的被占用时长
     * @param shopId
     * @param technicianId
     * @param dateTime
     * @param key
     * @return
     */
    @Override
    public boolean deleteShopTechnicianOccupyTimes(String shopId, String technicianId, String dateTime, String key) {
        //处理请求参数信息
        String hashKey=shopId+technicianId+dateTime;
        log.info("删除"+hashKey+":"+key+"被占用时间");
        redisTemplate.opsForHash().delete(hashKey,key);
        return true;
    }
}
