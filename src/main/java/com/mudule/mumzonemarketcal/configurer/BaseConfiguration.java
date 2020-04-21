package com.mudule.mumzonemarketcal.configurer;

import com.github.pagehelper.PageInterceptor;
import com.mudule.mumzonemarketcal.interceptor.SqlCostInterceptor;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Description Base数据库构建配置
 * @ClassName BaseConfiguration
 * @Autor DZT
 * @Date 2019/3/16 9:34
 * @Version 1.0
 */
@Slf4j
@Configuration
@Order(-1000)
@MapperScan(basePackages = "com.mudule.mumzonemarketcal.component.mapper.base",sqlSessionFactoryRef = "sessionFactoryBeanBase")
public class BaseConfiguration {
    @Autowired
    @Qualifier(value = "db1")
    private DataSource dataSource;

    @Autowired
    private SqlCostInterceptor sqlCostInterceptor;

    @Bean
    public SqlSessionFactory sessionFactoryBeanBase() throws Exception {
        log.info("加载Base数据源配置...");
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mapper/base/*.xml"));
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("params", "count=countSql");
        pageInterceptor.setProperties(properties);
        factoryBean.setPlugins(new Interceptor[]{pageInterceptor});
        factoryBean.setPlugins(new Interceptor[]{sqlCostInterceptor});
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionBaseTemplateEcm() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sessionFactoryBeanBase());
        return template;
    }
}
