package com.mudule.mumzonemarketcal.configurer;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Description spring上下文
 * @ClassName SpringContext
 * @Autor DZT
 * @Date 2019/3/20 17:51
 * @Version 1.0
 */
@Service
public class SpringContext implements ApplicationContextAware {
    /**
     * 上下文
     */
    protected static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
    public static ApplicationContext getContext() {
        return context;
    }
}
