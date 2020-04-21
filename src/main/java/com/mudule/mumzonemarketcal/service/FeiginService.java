package com.mudule.mumzonemarketcal.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.component.vo.IntegralRuleVo;

import java.util.List;
import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;

import java.util.List;

import java.util.List;

/**
 * @Description 请输入类描述信息
 * @ClassName FeiginService
 * @Autor DZT
 * @Date 2019/10/12 13:27
 * @Version 1.0
 */
public interface FeiginService {
    /**
     * 查询积分规则信息
     * @param shopId
     * @return
     */
    IntegralRuleVo getAllIntetralRuleInfo(String  shopId);

    /**
     * 查询会员的商品价格信息
     * @param orderVo
     * @return
     */
    List<OrderSubVo> selectGoodsPrice(OrderVo orderVo);

    /**
     * 根据商品ID集合和品牌ID集合和分类ID集合 进行过滤分类
     * @param param
     * @return
     */
    List<String> getGoodsList(JSONObject param);

}
