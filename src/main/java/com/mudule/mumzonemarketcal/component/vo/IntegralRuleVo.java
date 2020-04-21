package com.mudule.mumzonemarketcal.component.vo;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * @Description 积分规则实体
 * @ClassName IntegralRuleVo
 * @Autor DZT
 * @Date 2019/9/26 11:49
 * @Version 1.0
 */
@Data
public class IntegralRuleVo {
    private String shopId;
    private String ruleName;
    private String getType;
    private String howMuthOne;
    private String isNoIntegral;
    private String rechargeRule;
    private String timeCardRule;
    private String isNoIntegralOne;
    private String isNoIntegralTwo;
    private String isNoIntegralThree;
    private String paymentDesc;
    private String goodDesc;
    private String isAtCash;
    private String atCathRuleType;
    private String howManyOne;
    private String gradeRule;
    private String newMemberIntegralMultiple;
    private String memberBirthdayIntegralMultiple;
    private String memberDayType;
    private String memberDayYearStartMonth;
    private String memberDayYearStartDay;
    private String memberDayYearEndMonth;
    private String memberDayYearEndDay;
    private String membeDayYearIntegralMultiple;
    private String memberDayMonth;
    private String memberDayMonthIntegralMultiple;
    private String ruleDesc;
    private String isIntegralGood;
    private String isNewMember;
    private String isMemberBirthday;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
