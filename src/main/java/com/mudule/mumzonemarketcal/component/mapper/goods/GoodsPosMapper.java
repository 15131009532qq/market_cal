package com.mudule.mumzonemarketcal.component.mapper.goods;

import com.mudule.mumzonemarketcal.component.po.goods.GoodsPos;
import com.mudule.mumzonemarketcal.component.po.goods.GoodsPosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface GoodsPosMapper {
    int countByExample(GoodsPosExample example);

    int deleteByExample(GoodsPosExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsPos record);

    int insertSelective(GoodsPos record);

    List<GoodsPos> selectByExample(GoodsPosExample example);

    GoodsPos selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsPos record, @Param("example") GoodsPosExample example);

    int updateByExample(@Param("record") GoodsPos record, @Param("example") GoodsPosExample example);

    int updateByPrimaryKeySelective(GoodsPos record);

    int updateByPrimaryKey(GoodsPos record);
    // 根据 公司id、goods_code商品货号 查询公司下 商品id
    GoodsPos selectGoodsId(@Param("companyId") String companyId, @Param("goodsCode") String goodsCode, @Param("barCode") String barCode);
    // 根据商品id 查询商品货号
    GoodsPos selectGoodsCode(String goodsId);
}