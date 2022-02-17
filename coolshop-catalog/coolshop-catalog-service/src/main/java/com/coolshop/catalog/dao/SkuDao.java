package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.SkuModel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface SkuDao extends BaseDao<SkuModel> {

    List<SkuModel> findSkusByProductId(Object productId);

    List<SkuModel> findSkusByBundleId(Object bundleId);

    List<AttributeValueModel> findPropertiesBySkuId(Object skuId);

    void saveSkuAndBundle(Map<String,Object> map);

    void saveSkuAndAttributeValue(Map<String,Object> map);

    int updateSkuAndBundle(Map<String,Object> map);

    int updateSkuAndAttributeValue(Map<String,Object> map);

    int deleteSkuAndBundle(Object skuId);

    int deleteSkuAndAttributeValue(Object skuId);
}
