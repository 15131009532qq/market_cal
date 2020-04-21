package com.mudule.mumzonemarketcal.configurer;

import com.mudule.mumzonemarketcal.constant.RulePathConstant;
import com.mudule.mumzonemarketcal.market.rules.KieContant;
import lombok.extern.slf4j.Slf4j;
import org.drools.core.event.DebugRuleRuntimeEventListener;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.spring.KModuleBeanFactoryPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * @Description Drools规则引擎配置加载
 * @ClassName DroolsConfiguration
 * @Autor DZT
 * @Date 2019/6/27 11:57
 * @Version 1.0
 */
@Configuration
@Slf4j
public class DroolsConfiguration {
    /**
     * 规则集路径
     */
    private static final String DROOLS_RULE_PATH= RulePathConstant.RULES_PATH;

    /**
     * 加载KieFile规则文件
     * @return
     */
    @Bean
    @Order(3)
    @ConditionalOnMissingBean(KieFileSystem.class)
    public KieFileSystem kieFileSystem() throws IOException {
        log.info("加载规则文件...");
        KieFileSystem kieFileSystem=getKieServices().newKieFileSystem();
        for (Resource resource:getRuleFiles()) {
            log.info("规则文件--->"+resource.getFilename());
            kieFileSystem.write(ResourceFactory.newClassPathResource(DROOLS_RULE_PATH+resource.getFilename(),"utf-8"));
        }
        return kieFileSystem;
    }

    /**
     * 获取知识仓库kieBase的容器KieContainer
     * @return
     */
    @Bean
    @Order(2)
    @ConditionalOnMissingBean(KieContainer.class)
    public KieContainer kieContainer() throws IOException {
        log.info("获取规则仓库的容器...");
        /**
         * KieRepository是一个单例对象
         * 存放KieModule的仓库 KieModule由KieModule.xml文件定义
         */
        final KieRepository kieRepository=getKieServices().getRepository();
        kieRepository.addKieModule(new KieModule() {
            @Override
            public ReleaseId getReleaseId() {
                return kieRepository.getDefaultReleaseId();
            }
        });
        //加载规则文件生成规则仓库KieBase
        KieBuilder kieBuilder=getKieServices().newKieBuilder(kieFileSystem());
        kieBuilder.buildAll();
        //生成规则仓库KieBase的容器
        KieContainer kieContainer=getKieServices().newKieContainer(kieRepository.getDefaultReleaseId());
        KieContant.setKieContainer(kieContainer);
        return getKieServices().newKieContainer(kieRepository.getDefaultReleaseId());
    }

    /**
     * 获取知识仓库
     * @return
     * @throws IOException
     */
    @Bean
    @Order(1)
    @ConditionalOnMissingBean(KieBase.class)
    public KieBase kieBase() throws IOException {
        log.info("加载知识仓库");
        return kieContainer().getKieBase();
    }

    /**
     * 获取和规则引擎交互会话KieSession
     * @return
     * @throws IOException
     */
    @Bean
    @Order(4)
    @ConditionalOnMissingBean(KieSession.class)
    public KieSession kieSession() throws IOException {
        KieSession kieSession=kieBase().newKieSession();
        kieSession.addEventListener(new DebugRuleRuntimeEventListener());
        KieContant.setKieSession(kieSession);
        return kieSession;
    }

    /**
     * 获取KModule的Bean管理工厂
     * @return
     */
    @Bean
    @Order(5)
    @ConditionalOnMissingBean(KModuleBeanFactoryPostProcessor.class)
    public KModuleBeanFactoryPostProcessor kiePostProcessor() {
        return new KModuleBeanFactoryPostProcessor();
    }

    /**
     * 获取加载的规则文件资源
     * @return
     * @throws IOException
     */
    private Resource[] getRuleFiles() throws IOException {
        ResourcePatternResolver resourcePatternResolver= new PathMatchingResourcePatternResolver();
        Resource[] resources=resourcePatternResolver.getResources("classpath*:"+DROOLS_RULE_PATH+"**/*.drl");
        log.info("加载规则文件资源数量[{}]",resources.length);
        return resources;
    }
    /**
     * 获取访问规则引擎的服务中心 线程安全的单例
     * @return
     */
    private KieServices getKieServices(){
        return KieServices.Factory.get();
    }
}
