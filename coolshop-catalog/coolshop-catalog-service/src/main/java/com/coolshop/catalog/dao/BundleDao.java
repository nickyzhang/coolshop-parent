package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.BundleModel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface BundleDao extends BaseDao<BundleModel> {

    List<BundleModel> findBundlesBySkuId(Object skuId);

    void saveBundleAndSku(Map<String,Object> map);

    int updateBundleAndSku(Map<String,Object> map);

    int deleteBundleAndSku(Object bundleId);

}
