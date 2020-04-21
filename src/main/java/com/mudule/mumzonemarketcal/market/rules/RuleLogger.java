package com.mudule.mumzonemarketcal.market.rules;

import com.mudule.mumzonemarketcal.constant.UseConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

/**
 * @Description 规则日志集
 * @ClassName RuleLogger
 * @Autor DZT
 * @Date 2019/6/28 17:30
 * @Version 1.0
 */
public class RuleLogger {
    private final static Logger log= LoggerFactory.getLogger(RuleLogger.class);

    /**
     * 日志级别 info
     * @param info
     * @param objects
     */
    public static void info(String info,Object ...objects){
        log.info(getMsg(info),objects);
    }
    /**
     * 日志级别 info
     * @param info
     */
    public static void info(String info){
        log.info(getMsg(info));
    }
    /**
     * 日志级别 debug
     * @param debug
     */
    public static void debug(String debug){
        log.debug(getMsg(debug));
    }
    /**
     * 日志级别 debug
     * @param debug
     * @param objects
     */
    public static void debug(String debug,Object ...objects){
        log.debug(getMsg(debug),objects);
    }
    /**
     * 日志级别 error
     * @param error
     */
    public static void error(String error){
        log.error(getMsg(error));
    }

    /**
     * 日志级别 error
     * @param error
     * @param objects
     */
    public static void error(String error,Object ...objects){
        log.error(getMsg(error),objects);
    }

    public static String getMsg(String msg){
        String str=msg;
        try {
            str=new String(msg.getBytes(), UseConstant.CHARCODE_UTF_8);
            return str;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            log.error("字符集转换异常!",e);
        }
        return str;
    }

}
