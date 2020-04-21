package com.mudule.mumzonemarketcal.mutiple;

/**
 * @Description 数据源上下文Holder类
 * @ClassName DataSourceContextHolder
 * @Autor DZT
 * @Date 2019/3/12 13:39
 * @Version 1.0
 */
public class DataSourceContextHolder {
    /**
     * 用于存储数据源信息,线程存储
     */
    private static final ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();

    /**
     *  设置数据源
     * @param db
     */
    public static void setDataSource(String db){
        contextHolder.set(db);
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDataSource(){
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear(){
        contextHolder.remove();
    }
}
