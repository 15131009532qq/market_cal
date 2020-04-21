package com.mudule.mumzonemarketcal.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description 请输入类描述信息
 * @ClassName BigDecimalCheckAmount
 * @Autor DZT
 * @Date 2019/6/20 15:15
 * @Version 1.0
 */
public class BigDecimalCheckAmount {
    /**
     * 校验极端金额
     * 如果尾数是.9999999则需要进行进位
     * 如果尾数是.000001则需要进行舍去
     * @param amount
     * @return
     */
    public static BigDecimal checkExtreme(BigDecimal amount){
        //设置他的位数 默认只截取6位
        amount=amount.setScale(6,RoundingMode.DOWN);
        //获取整数
        BigDecimal bigDecimal=new BigDecimal("0").setScale(0, RoundingMode.DOWN);
        bigDecimal=bigDecimal.add(amount).setScale(0,RoundingMode.DOWN);
        //获取精度
        BigDecimal bigDecimal1=new BigDecimal("0").setScale(6,RoundingMode.DOWN);
        bigDecimal1=bigDecimal1.add(amount.subtract(bigDecimal));
        //
        BigDecimal bigDecimal2=new BigDecimal("0.999999").setScale(6,RoundingMode.DOWN);
        BigDecimal bigDecimal3=new BigDecimal("0.000000").setScale(6,RoundingMode.DOWN);
        if (bigDecimal1.subtract(bigDecimal2).compareTo(BigDecimal.ZERO)==0){
            bigDecimal=bigDecimal.add(new BigDecimal(1)).setScale(8,RoundingMode.DOWN);
            return bigDecimal;
        }
        if (bigDecimal1.subtract(bigDecimal3).compareTo(BigDecimal.ZERO)==0){
            bigDecimal=bigDecimal.add(BigDecimal.ZERO).setScale(8,RoundingMode.DOWN);
            return bigDecimal;
        }
        return amount;
    }
}
