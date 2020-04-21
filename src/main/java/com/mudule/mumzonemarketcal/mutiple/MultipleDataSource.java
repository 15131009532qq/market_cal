package com.mudule.mumzonemarketcal.mutiple;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

/**
 * @Description 多种多样数据源--->数据源路由实现类--->用于路由数据源
 * @ClassName MultipleDataSource
 * @Autor DZT
 * @Date 2019/3/12 13:41
 * @Version 1.0
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Nullable
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
