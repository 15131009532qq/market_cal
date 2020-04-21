package com.mudule.mumzonemarketcal.market.rules;

import org.kie.api.KieBase;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @Description Kie工具类
 *              储存KieContainer和KieSession获取的静态方法和静态属性
 * @ClassName KieContant
 * @Autor DZT
 * @Date 2019/6/27 19:14
 * @Version 1.0
 */
public class KieContant{
    private static KieContainer kieContainer;
    private static KieSession kieSession;
    private static KieBase kieBase;
    /**
     * 获取规则容器
     * @return
     */
    public static KieContainer getKieContainer(){
        return kieContainer;
    }

    /**
     * 创建新的KieSession和规则引擎交互的会话
     * @param kieContainer
     */
    public static void setKieContainer(KieContainer kieContainer){
        KieContant.kieContainer=kieContainer;
        kieSession=kieContainer.newKieSession();
    }

    /**
     * 获取新的KieSession和规则引擎交互的会话
     * @return
     */
    public static KieSession getKieSession(){
        return kieSession;
    }

    /**
     * 设置KieSession会话
     * @param kieSession
     */
    public static void setKieSession(KieSession kieSession){
        KieContant.kieSession=kieSession;
    }

}