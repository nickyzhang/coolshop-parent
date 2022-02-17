package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.SkuDao;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.SkuModel;
import com.coolshop.catalog.service.SkuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SkuServiceImpl implements SkuService {

    private static Logger logger = LoggerFactory.getLogger(SkuServiceImpl.class);

    @Autowired
    SkuDao skuDao;


    @Override
    public void save(SkuModel model) {

        this.skuDao.save(model);
    }

    @Override
    public void saveList(List<SkuModel> modelList) {

        this.skuDao.saveList(modelList);
    }

    @Override
    public int update(SkuModel model) {

        return this.skuDao.update(model);
    }

    @Override
    public int delete(Object id) {

        return this.skuDao.delete(id);
    }

    @Override
    public SkuModel find(Object id) {

        return this.skuDao.find(id);
    }

    @Override
    public List<SkuModel> findAll() {

        return this.skuDao.findAll();
    }

    @Override
    public Long count() {

        return this.skuDao.count();
    }

    @Override
    public int delete(Object[] ids) {
        if (ids == null) {
            logger.error("没有要删除的分类!");
            return 0;
        }

        for (Object id : ids) {
            delete(id);
        }
        return 1;
    }

    @Override
    public List<SkuModel> findSkusByProductId(Object productId) {

        return this.skuDao.findSkusByProductId(productId);
    }

    @Override
    public List<SkuModel> findSkusByBundleId(Object bundleId) {

        return this.skuDao.findSkusByBundleId(bundleId);
    }

    @Override
    public List<AttributeValueModel> findPropertiesBySkuId(Object skuId) {

        return this.skuDao.findPropertiesBySkuId(skuId);
    }

    @Override
    public void saveSkuAndBundle(Map<String, Object> map) {

        this.skuDao.saveSkuAndBundle(map);
    }

    @Override
    public void saveSkuAndAttributeValue(Map<String, Object> map) {

        this.skuDao.saveSkuAndAttributeValue(map);
    }

    @Override
    public int updateSkuAndBundle(Map<String, Object> map) {

        return this.skuDao.updateSkuAndBundle(map);
    }

    @Override
    public int updateSkuAndAttributeValue(Map<String, Object> map) {

        return this.skuDao.updateSkuAndAttributeValue(map);
    }

    @Override
    public int deleteSkuAndBundle(Object skuId) {

        return this.skuDao.deleteSkuAndBundle(skuId);
    }

    @Override
    public int deleteSkuAndAttributeValue(Object skuId) {

        return this.skuDao.deleteSkuAndAttributeValue(skuId);
    }
}
