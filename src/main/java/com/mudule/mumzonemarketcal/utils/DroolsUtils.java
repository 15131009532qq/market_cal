package com.mudule.mumzonemarketcal.utils;

import org.drools.core.spi.KnowledgeHelper;

/**
 * @Description 请输入类描述信息
 * @ClassName DroolsUtils
 * @Autor DZT
 * @Date 2019/7/4 15:45
 * @Version 1.0
 */
public class DroolsUtils {

    public static void help(final KnowledgeHelper drools, final String message){
        System.out.println(message);
        System.out.println("\nrule triggered: " + drools.getRule().getName());
    }
    public static void helper(final KnowledgeHelper drools){
        System.out.println("\nrule triggered: " + drools.getRule().getName());
    }
}
