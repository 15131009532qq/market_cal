package com.mudule.mumzonemarketcal.annotation;


import java.lang.annotation.*;

/**
 * @Description 异常类接口
 * @ClassName DataSource
 * @Autor DZT
 * @Date 2019/3/12 13:50
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExceptionMessage {

    /**
     * Value string.
     * 异常返回信息
     *
     * @return the string
     */
    String value() default "";
    /**
     * Show exception boolean.
     * 是否显示异常消息
     */
    boolean showException() default true;
}

