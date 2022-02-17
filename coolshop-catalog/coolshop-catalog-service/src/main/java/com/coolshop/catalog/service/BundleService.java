package com.coolshop.catalog.service;

import com.coolshop.catalog.model.BundleModel;
import java.util.List;
import java.util.Map;

public interface BundleService {

    void save(BundleModel model);

    void saveList(List<BundleModel> modelList);

    int update(BundleModel model);

    int delete(Object id);

    BundleModel find(Object id);

    List<BundleModel> findAll();

    Long count();

    int delete(Object[] ids);

    List<BundleModel> findBundlesBySkuId(Object skuId);

    void saveBundleAndSku(Map<String,Object> map);

    int updateBundleAndSku(Map<String,Object> map);

    int deleteBundleAndSku(Object bundleId);
}
