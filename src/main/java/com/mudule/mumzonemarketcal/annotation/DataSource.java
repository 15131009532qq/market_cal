package com.mudule.mumzonemarketcal.annotation;

import com.mudule.mumzonemarketcal.enums.DataSourceEnum;

import java.lang.annotation.*;

/**
 * @Description 用于切换数据源的注解
 * @ClassName DataSource
 * @Autor DZT
 * @Date 2019/3/12 13:50
 * @Version 1.0
 */
@Target(value={ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    //设置数据源以及默认数据源--order库
    DataSourceEnum value() default DataSourceEnum.ORDER_DATA_SOURCE;
}

