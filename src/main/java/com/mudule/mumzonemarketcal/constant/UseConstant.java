package com.mudule.mumzonemarketcal.constant;

/**
 * @Description 使用常量
 * @ClassName UseConstant
 * @Autor DZT
 * @Date 2019/3/18 10:48
 * @Version 1.0
 */
public interface UseConstant {
    String ZERO="0";
    String ONE="1";
    String TWO="2";
    String THREE="3";
    String FOUR="4";
    String FIVE="5";
    String SIX="6";
    String SEVEN="7";
    String EIGHT="8";
    String NINE="9";
    String TEN="10";
    String ELEVEN="11";
    String TWELVE="12";

    // 0-优惠活动 1-优惠券 2-体验券 3-抹零 4-次卡
    String ACTIVITY="0";
    String MARKET="1";
    String EXPERIENCETICKET="2";
    String MLPRICE="3";
    String TIMECARD="4";

    //优惠券 是否所有商品参加活动：0-全部参与，1-指定参与，2-指定不参与
    String TICKETUSETYPE0="0";
    String TICKETUSETYPE1="1";
    String TICKETUSETYPE2="2";
    //结果状态吗
    String SUCCESS="SUCCESS";
    String FAIL="FAIL";
    String CHARCODE_UTF_8="UTF-8";

    //名称
    String MLNAME="抹零";
    String CASH_NAME="现金";
    String BALANCE_NAME="余额";
    String INTEGRAL_PAY_NAME="积分抵现";

    String[] BOOLEANFIELDNAME={"ruleflag"};

    //计算结果提示
    String CALSUCCESS="计算成功！";


    //定义名称
    String SERVICEORDER_STR="SERVICEORDER";
    String GOODSORDER_STR="GOODSORDER";
    String TIMESCARDORDER_STR="TIMESCARDORDER";
    String EXPERIENCETICKET_TYPE_STR="EXPERIENCETICKET_TYPE";
    String TIMECARD_STR="TIMECARD";
    String DISCOUNTCOUPONS_STR="DISCOUNTCOUPONS";
    String WITHDISCOUNTCOUPONS_STR="WITHDISCOUNTCOUPONS";
    String CALSUCCESS_STR="CALSUCCESS";
}
