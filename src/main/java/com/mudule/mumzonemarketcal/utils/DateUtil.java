package com.mudule.mumzonemarketcal.utils;


import com.mudule.mumzonemarketcal.exception.MarketException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author qi_grui
 */
public class DateUtil {

    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String DATE_PATTERN1 = "yyyyMMdd";
    public static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_PLAIN_PATTERN = "yyyyMMddHHmmss";

    /**
     * 字符串为转换日期（带时间）
     *
     * @param date
     * @return
     */
    public static Date stringToDate(String date) {
        if (StringUtils.isEmpty(date)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_PATTERN);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new MarketException(new Integer("500"),"字符串转日期异常!");
        }
    }

    /**
     * 字符串为转换日期（不带时间）
     *
     * @param date
     * @return
     */
    public static Date stringToDateTime(String date) {
        if (StringUtils.isEmpty(date)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new MarketException(new Integer("500"),"字符串转日期异常!");
        }
    }
    /**
     * 字符串为转换日期（不带时间）
     *
     * @param date
     * @return
     */
    public static Date stringToDateTime1(String date) {
        if (StringUtils.isEmpty(date)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN1);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new MarketException(new Integer("500"),"字符串转日期异常!");
        }
    }
    /**
     * 字符串为转换日期（不带时间）
     *
     * @param date
     * @return
     */
    public static Date stringToDateTime2(String date) {
        if (StringUtils.isEmpty(date)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_PATTERN);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new MarketException(new Integer("500"),"字符串转日期异常!");
        }
    }

    /**
     * 获取系统当前时间"yyyyMMddHHmmss"格式
     *
     * @return
     */
    public static String getCurrentDateTimes() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATETIME_PLAIN_PATTERN);
        return simpleDateFormat.format(new Date());
    }

    /**
     * 计算从startTime开始添加多少秒结束
     *
     * @param times
     * @return
     */
    public static String getExprieDateTime(String times, String startTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATETIME_PLAIN_PATTERN);
        try {
            Date date1 = simpleDateFormat.parse(startTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);
            calendar.add(Calendar.SECOND, Integer.parseInt(times));
            Date date11 = calendar.getTime();
            return simpleDateFormat.format(date11);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MarketException(new Integer("500"),"日期异常!");
        }
    }

    /**
     * 获取当前月份
     * @return
     */
    public static int getCurrentMonth(){
        Calendar calendar1=Calendar.getInstance();
        calendar1.setTime(new Date());
        int month = calendar1.get(Calendar.MONTH) + 1;
        return month;
    }

    /**
     * 获取当前日
     * @return
     */
    public static int getCurrentDay(){
        Calendar calendar1=Calendar.getInstance();
        calendar1.setTime(new Date());
        int day = calendar1.get(Calendar.DATE);
        return day;
    }

}