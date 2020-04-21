package com.mudule.mumzonemarketcal.component.mapper.base;

import com.mudule.mumzonemarketcal.component.po.base.BaseMessageRecommend;
import com.mudule.mumzonemarketcal.component.po.base.BaseMessageRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMessageRecommendMapper {
    int countByExample(BaseMessageRecommendExample example);

    int deleteByExample(BaseMessageRecommendExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseMessageRecommend record);

    int insertSelective(BaseMessageRecommend record);

    List<BaseMessageRecommend> selectByExample(BaseMessageRecommendExample example);

    BaseMessageRecommend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseMessageRecommend record, @Param("example") BaseMessageRecommendExample example);

    int updateByExample(@Param("record") BaseMessageRecommend record, @Param("example") BaseMessageRecommendExample example);

    int updateByPrimaryKeySelective(BaseMessageRecommend record);

    int updateByPrimaryKey(BaseMessageRecommend record);
}