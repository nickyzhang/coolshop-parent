package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.ProductDao;
import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.CategoryModel;
import com.coolshop.catalog.model.ProductModel;
import com.coolshop.catalog.service.AttributeNameService;
import com.coolshop.catalog.service.ProductService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {


    private static Logger logger = LoggerFactory.getLogger(SkuServiceImpl.class);

    @Autowired
    ProductDao productDao;

    @Override
    public void save(ProductModel model) {
        this.productDao.save(model);
    }

    @Override
    public void saveList(List<ProductModel> modelList) {
        this.productDao.saveList(modelList);
    }

    @Override
    public int update(ProductModel model) {
        return this.productDao.update(model);
    }

    @Override
    public int delete(Object id) {
        deleteProductAndAttributeValue(id);
        return this.productDao.delete(id);
    }

    @Override
    public ProductModel find(Object id) {
        return this.productDao.find(id);
    }

    @Override
    public List<ProductModel> findAll() {
        return this.productDao.findAll();
    }

    @Override
    public Long count() {
        return this.productDao.count();
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
    public List<ProductModel> findProductsByCategoryId(Object categoryId) {
        return this.productDao.findProductsByCategoryId(categoryId);
    }

    @Override
    public List<ProductModel> findProductsByBrandId(Object brandId) {
        return this.productDao.findProductsByCategoryId(brandId);
    }

    @Override
    public List<AttributeValueModel> findPropertiesByProductId(Object productId) {
        return this.productDao.findPropertiesByProductId(productId);
    }

    @Override
    public void saveProductAndAttributeValue(Map<String, Object> map) {
        this.productDao.saveProductAndAttributeValue(map);
    }

    @Override
    public int updateProductAndAttributeValue(Map<String, Object> map) {
        return this.productDao.updateProductAndAttributeValue(map);
    }

    @Override
    public int deleteProductAndAttributeValue(Object productId) {
        return this.productDao.deleteProductAndAttributeValue(productId);
    }
}
