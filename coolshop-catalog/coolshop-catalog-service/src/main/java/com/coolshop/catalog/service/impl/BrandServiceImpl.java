package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.BrandDao;
import com.coolshop.catalog.model.BrandModel;
import com.coolshop.catalog.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BrandServiceImpl implements BrandService {

    private static Logger logger = LoggerFactory.getLogger(BrandServiceImpl.class);

    @Autowired
    BrandDao brandDao;


    @Override
    public void save(BrandModel model) {
        this.brandDao.save(model);
    }

    @Override
    public void saveList(List<BrandModel> modelList) {
        this.brandDao.saveList(modelList);
    }

    @Override
    public int update(BrandModel model) {
        return this.brandDao.update(model);
    }

    @Override
    public int delete(Object id) {
        if (id == null) {
            logger.error("[BrandService][delete] 参数不允许为空");
            return 0;
        }
        try {
            deleteBrandAndCategory(id);
        } catch (Exception e) {
            logger.error("[BrandService][delete]不能正确删除分类的关联信息");
            return 1;
        }

        return this.brandDao.delete(id);
    }

    @Override
    public BrandModel find(Object id) {
        return this.brandDao.find(id);
    }

    @Override
    public List<BrandModel> findAll() {
        return this.brandDao.findAll();
    }

    @Override
    public Long count() {
        return this.brandDao.count();
    }

    @Override
    public int delete(Object[] ids) {
        if (ids == null) {
            logger.error("没有要删除的品牌!");
            return 0;
        }

        for (Object id : ids) {
            delete(id);
        }
        return 1;
    }

    @Override
    public BrandModel findByName(String name) {

        return this.brandDao.findByName(name);
    }

    @Override
    public List<BrandModel> findBrandsByCategoryId(Object categoryId) {

        return this.brandDao.findBrandsByCategoryId(categoryId);
    }

    @Override
    public void saveBrandAndCategory(Map<String, Object> map) {

        this.brandDao.saveBrandAndCategory(map);
    }

    @Override
    public int updateBrandAndCategory(Map<String, Object> map) {

        return this.brandDao.updateBrandAndCategory(map);
    }

    @Override
    public int deleteBrandAndCategory(Object brandId) {

        return this.brandDao.deleteBrandAndCategory(brandId);
    }
}
