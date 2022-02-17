package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.BundleDao;
import com.coolshop.catalog.model.BundleModel;
import com.coolshop.catalog.service.BundleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BundleServiceImpl implements BundleService {

    private static Logger logger = LoggerFactory.getLogger(BundleServiceImpl.class);

    @Autowired
    BundleDao bundleDao;


    @Override
    public void save(BundleModel model) {
        this.bundleDao.save(model);
    }

    @Override
    public void saveList(List<BundleModel> modelList) {

        this.bundleDao.saveList(modelList);
    }

    @Override
    public int update(BundleModel model) {

        return this.bundleDao.update(model);
    }

    @Override
    public int delete(Object id) {

        return this.bundleDao.delete(id);
    }

    @Override
    public BundleModel find(Object id) {
        return this.bundleDao.find(id);
    }

    @Override
    public List<BundleModel> findAll() {
        return this.bundleDao.findAll();
    }

    @Override
    public Long count() {
        return this.bundleDao.count();
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
    public List<BundleModel> findBundlesBySkuId(Object skuId) {

        return this.bundleDao.findBundlesBySkuId(skuId);
    }

    @Override
    public void saveBundleAndSku(Map<String, Object> map) {
        this.bundleDao.saveBundleAndSku(map);
    }

    @Override
    public int updateBundleAndSku(Map<String, Object> map) {

        return this.bundleDao.updateBundleAndSku(map);
    }

    @Override
    public int deleteBundleAndSku(Object bundleId) {

        return this.bundleDao.deleteBundleAndSku(bundleId);
    }
}
