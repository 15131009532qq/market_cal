package com.mudule.mumzonemarketcal.component.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description 请输入类描述信息
 * @ClassName CalDiscontActivityVo
 * @Autor DZT
 * @Date 2019/10/12 17:53
 * @Version 1.0
 */
@Data
public class CalDiscontActivityVo {
    private List<OrderSubVo> orderSubVoList;
    private BigDecimal discountAmount;
}
