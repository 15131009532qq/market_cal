package com.mudule.mumzonemarketcal.service.impl;

import com.mudule.mumzonemarketcal.component.mapper.order.OrderAppointmentMapper;
import com.mudule.mumzonemarketcal.component.mapper.order.OrderSubAppointmentMapper;
import com.mudule.mumzonemarketcal.component.po.order.OrderAppointment;
import com.mudule.mumzonemarketcal.component.po.order.OrderSubAppointment;
import com.mudule.mumzonemarketcal.component.po.order.OrderSubAppointmentExample;
import com.mudule.mumzonemarketcal.enums.DlStatusEnum;
import com.mudule.mumzonemarketcal.enums.ExecutorResultStatusEnum;
import com.mudule.mumzonemarketcal.enums.JoinValuesEnum;
import com.mudule.mumzonemarketcal.enums.OrderSubAppointmentStatusEnum;
import com.mudule.mumzonemarketcal.executor.AsyScheduledThreadPoolExecutor;
import com.mudule.mumzonemarketcal.executor.IConcurrentThreadPool;
import com.mudule.mumzonemarketcal.executor.TaskServiceHandler;
import com.mudule.mumzonemarketcal.service.AppointmentService;
import com.mudule.mumzonemarketcal.service.AsynTaskService;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


/**
 * @Description 异步任务服务实现类
 * @ClassName AsynTaskServiceImpl
 * @Autor DZT
 * @Date 2019/4/3 11:12
 * @Version 1.0
 */
@Service
@Slf4j
public class AsynTaskServiceImpl implements AsynTaskService {

    @Autowired
    private IConcurrentThreadPool iConcurrentThreadPool;

    @Resource
    private OrderSubAppointmentMapper orderSubAppointmentMapper;

    @Autowired
    private AsyScheduledThreadPoolExecutor asyScheduledThreadPoolExecutor;

    @Resource
    private OrderAppointmentMapper orderAppointmentMapper;

    @Autowired
    private AppointmentService appointmentService;

    /**
     * 设置异步任务
     * @param id
     * @param minutes
     * @return
     */
    @Override
    public boolean setChildrenSwimTimes(String id, String minutes) {
        log.info("生成子任务【"+id+"】");
        TaskServiceHandler taskServiceHandler=new TaskServiceHandler(id,minutes);
        try {
            iConcurrentThreadPool.submit(taskServiceHandler);
        } catch (InterruptedException e) {
            e.printStackTrace();
            log.info("生成子任务失败!",e);
        } catch (ExecutionException e) {
            e.printStackTrace();
            log.info("生成子任务失败!",e);
        }
        return true;
    }

    @Override
    public boolean setChildrenSwimTimesBatch(List<Map<String, String>> list) {
//        try {
            for (Map<String,String> map:list){
                log.info("生成子任务【"+map.get("id")+"】---"+"休眠时间【"+map.get("time")+"】分钟");
                TaskServiceHandler taskServiceHandler=new TaskServiceHandler(map.get("id"),"");
                asyScheduledThreadPoolExecutor.schdule(taskServiceHandler,Long.valueOf(map.get("time")),TimeUnit.MINUTES);
            }
        return true;
    }

    /**
     * 释放小儿游泳技师占用时间
     * @param id
     * @return
     */
    @Override
    public Map<String, String> exectuorRelaseChildrenSwimTime(String id) throws ParseException {
        //首先判断预约字段的订单状态
        Map<String,String> map=new HashMap<>();
        OrderSubAppointmentExample orderSubAppointmentExample=new OrderSubAppointmentExample();
        orderSubAppointmentExample
                .createCriteria()
                .andIdEqualTo(id)
                .andSuborderStatusEqualTo(new Byte(OrderSubAppointmentStatusEnum.SERVICEING.getCode()))
                .andDlEqualTo(new Byte(DlStatusEnum.DL_0.getCode()));
        List<OrderSubAppointment> orderSubAppointmentsList=orderSubAppointmentMapper.selectByExample(orderSubAppointmentExample);
        if (StringUtils.isEmpty(orderSubAppointmentsList)){
            log.error("预约子服务订单【"+id+"】订单状态异常！");
            map.put(JoinValuesEnum.CODE.getValue(), ExecutorResultStatusEnum.FAIL.getCode());
            return map;
        }else{
            log.info("预约子服务订单【"+id+"】订单状态正常!");
        }
        //判断预约单技师是否已经被释放
        boolean flag=false;
        OrderSubAppointment orderSubAppointmentFlag=orderSubAppointmentMapper.selectByPrimaryKey(id);
        //子订单已经完成
        if (new Byte(OrderSubAppointmentStatusEnum.FINSHING.getCode()).equals(orderSubAppointmentFlag.getSuborderStatus())){
            flag=true;
        }else {
            flag=false;
        }
        if (!flag){
            //释放技师时间
            releaseChildrenTimesInDB(id);
            //将预约子订单状态设置为已完成释放技师的占用时间
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            OrderSubAppointment orderSubAppointment=new OrderSubAppointment();
            orderSubAppointment.setId(id);
            orderSubAppointment.setUpdateTime(simpleDateFormat.format(new Date()));
            orderSubAppointment.setSuborderStatus(new Byte(OrderSubAppointmentStatusEnum.FINSHING.getCode()));
            int result=orderSubAppointmentMapper.updateByPrimaryKeySelective(orderSubAppointment);
            if (result>=1){
                map.put(JoinValuesEnum.CODE.getValue(), ExecutorResultStatusEnum.SUCCESS.getCode());
            }else {
                map.put(JoinValuesEnum.CODE.getValue(), ExecutorResultStatusEnum.FAIL.getCode());
            }
        }else{
            map.put(JoinValuesEnum.CODE.getValue(), ExecutorResultStatusEnum.SUCCESS.getCode());
        }
        return map;
    }

    /**
     * 释放数据库中技师占用时间结果集
     * @param id
     * @return
     */
    public boolean releaseChildrenTimesInDB(String id) throws ParseException {
        log.info("进行技师时间释放");
        //获取年月日
        DateFormat dateFormat  = new SimpleDateFormat("yyyyMMdd");
        //获取时分
        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm");
        //获取年月日
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=null;
        Date date2=null;
        boolean flag=false;
        //查询子订单信息
        OrderSubAppointment orderSubAppointment=orderSubAppointmentMapper.selectByPrimaryKey(id);
        //查询总订单信息
        OrderAppointment orderAppointment=orderAppointmentMapper.selectByPrimaryKey(orderSubAppointment.getAppointmentId());
        //设置请求参数集
        String time=orderAppointment.getAppointmentTime();
        Date dateTime=dateFormat2.parse(time);
        String shopId=orderAppointment.getShopId();
        String date=dateFormat.format(dateTime);
        log.info("预约日期:"+date);
        //计算该笔订单技师的占用时间 ---  进行释放
        Date date0=dateFormat1.parse(dateFormat1.format(new Date()));
        Map<String,String> maps=appointmentService.queryShopTechnicianOccupyTimes(shopId,orderSubAppointment.getTechnicianId(),date);
        if (StringUtils.isEmpty(maps)){
            return false;
        }
        for (Map.Entry<String,String> map:maps.entrySet()){
            date1=dateFormat1.parse(map.getValue());
            if (date1.getTime()==date0.getTime()){
                flag=true;
                date2=dateFormat1.parse(map.getKey());
                break;
            }
        }
        if (flag){
            appointmentService.deleteShopTechnicianOccupyTimes(shopId,orderSubAppointment.getTechnicianId(),date,dateFormat1.format(date2));
        }else {
            for (Map.Entry<String,String> map:maps.entrySet()){
                Calendar calendar1=Calendar.getInstance();
                date1=dateFormat1.parse(map.getValue());
                calendar1.setTime(date1);
                date2=dateFormat1.parse(map.getKey());
                calendar1.add(Calendar.MINUTE,-1);
                Date date3=calendar1.getTime();
                if (date3.getTime()==date0.getTime()){
                    appointmentService.deleteShopTechnicianOccupyTimes(shopId,orderSubAppointment.getTechnicianId(),date,dateFormat1.format(date2));
                }
                calendar1.add(Calendar.MINUTE,2);
                Date date4=calendar1.getTime();
                if (date4.getTime()==date0.getTime()){
                    appointmentService.deleteShopTechnicianOccupyTimes(shopId,orderSubAppointment.getTechnicianId(),date,dateFormat1.format(date2));
                }
            }
        }
        return true;
    }
}
