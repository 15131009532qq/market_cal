package com.mudule.mumzonemarketcal.service.impl;

import cn.egg.cloud.enums.PayStatusEnum;
import cn.egg.cloud.market.MarketServiceClient;
import cn.egg.cloud.model.ResultModel;
import cn.egg.cloud.query.GoodsListQuery;
import cn.egg.cloud.query.IntegralRuleQuery;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mudule.mumzonemarketcal.common.ClientReqPath;
import com.mudule.mumzonemarketcal.common.SUCCESS;
import com.mudule.mumzonemarketcal.component.vo.IntegralRuleVo;
import com.mudule.mumzonemarketcal.component.vo.OrderSubVo;
import com.mudule.mumzonemarketcal.component.vo.OrderVo;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.exception.MarketException;
import com.mudule.mumzonemarketcal.service.FeiginService;
import com.mudule.mumzonemarketcal.utils.OkHttpUtil;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;


/**
 * @Description 请输入类描述信息
 * @ClassName FeiginServiceImpl
 * @Autor DZT
 * @Date 2019/10/12 13:29
 * @Version 1.0
 */
@Component
@Slf4j
public class FeiginServiceImpl implements FeiginService {

    /**
     * 查询积分规则信息
     * @param shopId
     * @return
     */
    @Override
    public IntegralRuleVo getAllIntetralRuleInfo(String  shopId) {
        try {
            log.info("查询积分规则信息...");
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("shopId",shopId);
            String url=SpringContext.getContext().getEnvironment().getProperty(ClientReqPath.MARKET_SERVICE_UR)+ClientReqPath.EGG_MARKET+ClientReqPath.GETALLINTETRALRULEINFO;
//            String url="http://192.168.3.110:8084"+ClientReqPath.GETALLINTETRALRULEINFO;
            JSONObject result=JSONObject.parseObject(OkHttpUtil.fireInfoByPost(url,jsonObject.toJSONString()));
            ResultModel resultModel=getResultModel(result);
            return  JSONObject.parseObject(SUCCESS.check(resultModel),IntegralRuleVo.class);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询规则失败！",e);
            throw new MarketException(500,"查询规则失败！");
        }
    }

    /**
     * 批量查询品牌和商品分类
     * @param param
     * @return
     */
    @Override
    public List<String> getGoodsList(JSONObject param) {
        try {
            log.info("批量查询品牌和分类...");
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("shopId",param.getString("shopId").replaceAll("\\[","").replaceAll("]","").replaceAll(" ",""));
            jsonObject.put("goodsIds",param.getString("goodsIds").replaceAll("\\[","").replaceAll("]","").replaceAll(" ",""));
            jsonObject.put("brandIds",param.getString("brandIds").replaceAll("\\[","").replaceAll("]","").replaceAll(" ",""));
            jsonObject.put("classifyIds",param.getString("classifyIds").replaceAll("\\[","").replaceAll("]","").replaceAll(" ",""));
            String url=SpringContext.getContext().getEnvironment().getProperty(ClientReqPath.GOODS_SERVICE_UR)+ClientReqPath.EGG_GOODS+ClientReqPath.GETGOODSLIST;
//            String url="http://192.168.3.110:8044"+ClientReqPath.GETGOODSLIST;
            JSONObject result=JSONObject.parseObject(OkHttpUtil.fireInfoByPost(url,jsonObject.toJSONString()));
            ResultModel resultModel=getResultModel(result);
            return  JSONArray.parseArray(SUCCESS.check(resultModel),String.class);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询规则失败！",e);
            throw new MarketException(500,"查询规则失败！");
        }
    }



    /**
     * 查询会员的价格信息
     * @param orderVo
     * @return
     */
    @Override
    public List<OrderSubVo> selectGoodsPrice(OrderVo orderVo) {
        try {
            log.info("查询会员商品价格信息...");
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("shopId",orderVo.getShopId());
            jsonObject.put("memberId", StringUtils.isNotEmpty(orderVo.getMemberCompanyId())?orderVo.getMemberCompanyId():orderVo.getBillingUser());
            jsonObject.put("memberDiscountType",orderVo.getMemberDiscountType());
            jsonObject.put("memberDiscount",orderVo.getGoods().get(0).getMemberDiscountRatio().setScale(2,BigDecimal.ROUND_DOWN).toPlainString());
            jsonObject.put("memberRank",orderVo.getMemberRank());
            JSONArray jsonArray=new JSONArray();
            orderVo.getGoods().stream().forEach(x->jsonArray.add(x.getGoodsSkuId()));
            jsonObject.put("goodsIds",jsonArray.toJSONString());
            String url=SpringContext.getContext().getEnvironment().getProperty(ClientReqPath.GOODS_SERVICE_UR)+ClientReqPath.EGG_GOODS+ClientReqPath.SELECTGOODSPRICE;
//            String url="http://192.168.3.128:8044"+ClientReqPath.SELECTGOODSPRICE;
            JSONObject result=JSONObject.parseObject(OkHttpUtil.payFireInfoByGet(paramGet(url,jsonObject)));
            ResultModel resultModel=getResultModel(result);
            JSONObject jsonObject1=JSONObject.parseObject(SUCCESS.check(resultModel));
            return JSONArray.parseArray(jsonObject1.getJSONArray("list").toJSONString(),OrderSubVo.class);
        }catch (Exception e){
            e.printStackTrace();
            log.error("查询会员价格失败！",e);
            throw new MarketException(500,"查询会员价格失败！");
        }
    }


    /**
     * 获取数据
     * @param jsonObject
     * @return
     */
    private ResultModel getResultModel(JSONObject jsonObject) {
        if (ObjectUtils.isEmpty(jsonObject)) {
            return ResultModel.getErrorResult("查询失败");
        }
        String status = jsonObject.getString("code");
        if ("200".equals(status)) {
            return ResultModel.getSuccessResult(jsonObject.get("data"));
        } else {
            return ResultModel.getErrorResult(jsonObject.getString("msg") == null ? "网络差~" : jsonObject.getString("msg"));
        }
    }

    /**
     * 参数GET
     * @param jsonObject
     * @return
     */
    public String paramGet(String url,JSONObject jsonObject){
        StringBuffer stringBuffer=new StringBuffer("");
        stringBuffer.append(url);
        stringBuffer.append("?");
        for (Map.Entry<String,Object> entry:jsonObject.entrySet()){
            stringBuffer.append(entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append(entry.getValue());
            stringBuffer.append("&");
        }
        return stringBuffer.substring(0,stringBuffer.length()-1);
    }
}
