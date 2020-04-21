package com.mudule.mumzonemarketcal.common;

/**
 * @Description 请输入类描述信息
 * @ClassName ClientReqPath
 * @Autor DZT
 * @Date 2019/10/12 15:13
 * @Version 1.0
 */
public interface ClientReqPath {
    String EGG_MARKET="/egg_market";
    String EGG_MEMBER="/egg_member";
    String EGG_BASIC="/egg_basic";
    String EGG_ORDER="/egg_order";
    String EGG_GOODS="/egg_goods";
    String EGG_STOCK="/egg_stock";
    String EGG_PUBLIC="/egg_public";
    String MARKET_SERVICE_UR="market.service.url";
    String GOODS_SERVICE_UR="goods.service.url";
    String  GETALLINTETRALRULEINFO="/api/v1/integral/getAllIntetralRuleInfo";
    String  GETMEMBERCOMPANY="/api/v1/member/memberCompany/getMemberCompany";
    String  GETGOODSLIST="/api/v2.3/goods/getGoodsList";
    String  SELECTGOODSPRICE="/api/v2.2/pos/business/selectGoodsPrice";
}
