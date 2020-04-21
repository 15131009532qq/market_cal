package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

/**
 * @Description 子订单Base
 * @ClassName BaseOrderSubVo
 * @Autor DZT
 * @Date 2019/3/14 14:38
 * @Version 1.0
 */
@Data
public class BaseOrderSubVo {
    //订单Id
    private String orderId;
    //总订单编号
    private String orderCode;
    //订单编号
    private String subCode;
    //公司会员ID
    private String memberCompanyId;
    //创建时间
    private String createTime;
    //修改时间
    private String updateTime;
}
