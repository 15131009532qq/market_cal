package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsCompany;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCompanyMapper {
    int countByExample(GoodsCompanyExample example);

    int deleteByExample(GoodsCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsCompany record);

    int insertSelective(GoodsCompany record);

    List<GoodsCompany> selectByExample(GoodsCompanyExample example);

    GoodsCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsCompany record, @Param("example") GoodsCompanyExample example);

    int updateByExample(@Param("record") GoodsCompany record, @Param("example") GoodsCompanyExample example);

    int updateByPrimaryKeySelective(GoodsCompany record);

    int updateByPrimaryKey(GoodsCompany record);
}