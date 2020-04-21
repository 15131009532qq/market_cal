package com.mudule.mumzonemarketcal.common;

import cn.egg.cloud.enums.ResultModelStatusEnum;
import cn.egg.cloud.model.ResultModel;
import com.alibaba.fastjson.JSON;
import com.mudule.mumzonemarketcal.exception.MarketException;
import com.mudule.mumzonemarketcal.utils.StringUtils;

/**
 * @Description 请输入类描述信息
 * @ClassName SUCCESS
 * @Autor DZT
 * @Date 2019/4/18 16:06
 * @Version 1.0
 */
public class SUCCESS {
    /**
     * 判断结果信息
     * @param resultModel
     * @return
     */
    public static  String check(ResultModel resultModel){
        if (ResultModelStatusEnum.success.getCode()!=resultModel.getCode()){
            throw new MarketException(StringUtils.isEmpty(resultModel.getMsg())?"服务中断...":resultModel.getMsg());
        }else {
            return resultModel.getData()==null?"": JSON.toJSONString(resultModel.getData());
        }
    }
}
