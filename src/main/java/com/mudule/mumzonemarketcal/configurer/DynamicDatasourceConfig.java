package com.mudule.mumzonemarketcal.configurer;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.mudule.mumzonemarketcal.enums.DataSourceEnum;
import com.mudule.mumzonemarketcal.mutiple.MultipleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.StandardEnvironment;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Description mybatis配置
 * @ClassName MyBatiesConfiguration
 * @Autor DZT
 * @Date 2019/3/12 14:13
 * @Version 1.0
 */
@Configuration
@Order(-1000)
public class DynamicDatasourceConfig {

    @Autowired
    ApplicationContext applicationContext;
    /**
     * 分页插件
     * @return
     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        // 开启 PageHelper 的支持
//        paginationInterceptor.setLocalPage(true);
//        return paginationInterceptor;
//    }

//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor page = new PaginationInterceptor();
//        page.setDialectType("mysql");
//        return page;
//    }
    /**
     * 进行SQL执行效率插件--->开启dev和test环境-->进行校验
     * Profile 注解用来标注开发环境
     */
//    @Bean
//    @Profile({"dev","test"})
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        performanceInterceptor.setMaxTime(1000);
//        performanceInterceptor.set(true);
//        return performanceInterceptor;
//    }

    /**
     * 配置数据源  base的数据源
     * @return
     */
    @Bean(name = "db1")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db1")
    public DataSource db1(StandardEnvironment env) {
        return common(env,DruidDataSourceBuilder.create().build());
    }

    /**
     * 配置数据源 goods的数据源
     * @return
     */
    @Bean(name = "db2")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db2")
    public DataSource db2(StandardEnvironment env) {
        return common(env,DruidDataSourceBuilder.create().build());
    }

    /**
     * 配置数据源 market的数据源
     * @return
     */
    @Bean(name = "db3")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db3")
    public DataSource db3(StandardEnvironment env) {
        return common(env,DruidDataSourceBuilder.create().build());
    }

    /**
     * 配置数据源 member的数据源
     * @return
     */
    @Bean(name = "db4")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db4")
    public DataSource db4(StandardEnvironment env) {
        return common(env,DruidDataSourceBuilder.create().build());
    }

    /**
     * 配置数据源 order的数据源
     * @return
     */
    @Bean(name = "db5")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db5")
    public DataSource db5(StandardEnvironment env)
    {
        return common(env,DruidDataSourceBuilder.create().build());
    }

//    /**
//     * 动态数据源配置
//     * @Primary注解是设置优先级防止多个实现类的不确定类型的注入
//     * @return
//     */
//    @Bean("dataSource")
//    public DataSource multipleDataSource(StandardEnvironment env) {
//        /**
//         * 用于获取数据源
//         */
//        MultipleDataSource multipleDataSource = new MultipleDataSource();
//        /**
//         * 享元模式存储公用的数据源
//         */
//        Map< Object, Object > targetDataSources = new HashMap<>();
//        targetDataSources.put(DataSourceEnum.BASE_DATA_SOURCE.getValue(), applicationContext.getBean("db1"));
//        targetDataSources.put(DataSourceEnum.GOODS_DATA_SOURCE.getValue(), applicationContext.getBean("db2"));
//        targetDataSources.put(DataSourceEnum.MARKET_DATA_SOURCE.getValue(), applicationContext.getBean("db3"));
//        targetDataSources.put(DataSourceEnum.MEMBER_DATA_SOURCE.getValue(), applicationContext.getBean("db4"));
//        targetDataSources.put(DataSourceEnum.ORDER_DATA_SOURCE.getValue(), applicationContext.getBean("db5"));
//        /**
//         * 添加数据源集合
//         */
//        multipleDataSource.setTargetDataSources(targetDataSources);
//        /**
//         * 设置默认的数据源 一般是order数据源
//         */
//        multipleDataSource.setDefaultTargetDataSource(applicationContext.getBean("db5"));
//        return multipleDataSource;
//    }

//    /**
//     * 创建sqlSessionFactory
//     *  SQL session 会话工厂
//     * @return
//     * @throws Exception
//     */
//    @Bean("sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        /**
//         * 加载SqlSessionFactory工厂
//         */
//        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(multipleDataSource(db1(),db2(),db3(),db4(),db5()));
//        MybatisConfiguration configuration = new MybatisConfiguration();
//        configuration.setJdbcTypeForNull(JdbcType.NULL);
//        configuration.setMapUnderscoreToCamelCase(true);
//        configuration.setCacheEnabled(false);
//        sqlSessionFactory.setConfiguration(configuration);
//        /**
//         * 暂时先不添加分页功能
//         */
////        sqlSessionFactory.setPlugins(new Interceptor[]{
////                //PerformanceInterceptor(),OptimisticLockerInterceptor()
////                paginationInterceptor() //添加分页功能
////        });
//        //sqlSessionFactory.setGlobalConfig(globalConfiguration());
//        return sqlSessionFactory.getObject();
//    }
    /**
     * 全局配置 -->暂时先不用
     */
    /*@Bean
    public GlobalConfiguration globalConfiguration() {
        GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
        conf.setLogicDeleteValue("-1");
        conf.setLogicNotDeleteValue("1");
        conf.setIdType(0);
        //conf.setMetaObjectHandler(new MyMetaObjectHandler());
        conf.setDbColumnUnderline(true);
        conf.setRefresh(true);
        return conf;
    }*/

    /**
     * 设置不同的环境
     * @param env
     * @param druidDataSource
     * @return
     */
    public DataSource common(StandardEnvironment env, DruidDataSource druidDataSource){
        Properties properties = new Properties();
        PropertySource<?> appProperties =  env.getPropertySources().get("applicationConfig: [classpath:/config/application.yml]");
        Map<String,Object> source = (Map<String, Object>) appProperties.getSource();
        properties.putAll(source);
        druidDataSource.configFromPropety(properties);
        return druidDataSource;
    }
}
