package com.coolshop.catalog.service;

import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.SkuModel;
import java.util.List;
import java.util.Map;

public interface SkuService {

    void save(SkuModel model);

    void saveList(List<SkuModel> modelList);

    int update(SkuModel model);

    int delete(Object id);

    SkuModel find(Object id);

    List<SkuModel> findAll();

    Long count();

    int delete(Object[] ids);

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
