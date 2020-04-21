package com.mudule.mumzonemarketcal.enums;

/**
 * @Description 数据源枚举类
 * @ClassName DataSourceEnum
 * @Autor DZT
 * @Date 2019/3/12 13:43
 * @Version 1.0
 */
public enum DataSourceEnum {
    //base数据源
    BASE_DATA_SOURCE("db1"),
    //goods数据源
    GOODS_DATA_SOURCE("db2"),
    //market数据源
    MARKET_DATA_SOURCE("db3"),
    //member数据源
    MEMBER_DATA_SOURCE("db4"),
    //order数据源
    ORDER_DATA_SOURCE("db5");

    /**
     * 数据源
     */
    private String value;
    DataSourceEnum(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
