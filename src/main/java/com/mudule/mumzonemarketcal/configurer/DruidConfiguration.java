package com.mudule.mumzonemarketcal.configurer;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @Description 使用Druid德鲁伊数据源配置
 * @ClassName DruidConfiguration
 * @Autor DZT
 * @Date 2019/3/12 14:02
 * @Version 1.0
 */
@Configuration
@Order(-1000)
public class DruidConfiguration {
    /**
     *  spring boot默认是不支持jsp的
     * 需要保留Druid对SQL的监控，所以需要 Spring boot 支持 Servlet 功能
     * Spring boot 默认为我们提供了注册 Servlet 三大组件 Servlet、Filter、Listener 的接口。我们只需按需配置和添加少量的代码即可实现添加 Servlet 的功能
     * 注册 Servlet 三大组件 Servlet、Filter、Listener 的接口。我们只需按需配置和添加少量的代码即可实现添加 Servlet 的功能
     * @return
     */
    @Bean
    public ServletRegistrationBean startViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/mumzone/*");
        // IP白名单
//        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        // IP黑名单(共同存在时，deny优先于allow)
//        servletRegistrationBean.addInitParameter("deny","127.0.0.1");
        //控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername","admin");
        servletRegistrationBean.addInitParameter("loginPassword","123456");
        //是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }

    /**
     * 添加Servlet对应的Filter的拦截器功能
     * @return
     */
    @Bean
    public FilterRegistrationBean statFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("profileEnable", "true");
        filterRegistrationBean.addInitParameter("principalCookieName", "USER_COOKIE");
        filterRegistrationBean.addInitParameter("principalSessionName", "USER_SESSION");
        //忽略过滤的格式
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
