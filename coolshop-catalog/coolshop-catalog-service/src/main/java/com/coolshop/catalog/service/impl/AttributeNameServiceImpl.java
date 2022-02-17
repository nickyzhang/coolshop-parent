package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.AttributeNameDao;
import com.coolshop.catalog.dao.CategoryDao;
import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.CategoryModel;
import com.coolshop.catalog.service.AttributeNameService;
import com.coolshop.catalog.service.CategoryService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AttributeNameServiceImpl implements AttributeNameService {

    private static Logger logger = LoggerFactory.getLogger(AttributeNameServiceImpl.class);

    @Autowired
    AttributeNameDao attributeNameDao;


    @Override
    public void save(AttributeNameModel model) {

        this.attributeNameDao.save(model);
    }

    @Override
    public void saveList(List<AttributeNameModel> modelList) {

        this.attributeNameDao.saveList(modelList);
    }

    @Override
    public int update(AttributeNameModel model) {

        return this.attributeNameDao.update(model);
    }

    @Override
    public int delete(Object id) {

        return this.attributeNameDao.delete(id);
    }

    @Override
    public AttributeNameModel find(Object id) {

        return this.attributeNameDao.find(id);
    }

    @Override
    public List<AttributeNameModel> findAll() {

        return this.attributeNameDao.findAll();
    }

    @Override
    public Long count() {
        return this.attributeNameDao.count();
    }

    @Override
    public int delete(Object[] ids) {
        if (ids == null) {
            logger.error("没有要删除的品牌!");
            return 0;
        }

        for (Object id : ids) {
            this.delete(id);
        }
        return 1;
    }

    @Override
    public List<AttributeNameModel> findAttributeNamesByCategoryId(Object categoryId) {

        return this.attributeNameDao.findAttributeNamesByCategoryId(categoryId);
    }

    @Override
    public void saveAttributeNameAndCategory(Map<String, Object> map) {

        this.attributeNameDao.saveAttributeNameAndCategory(map);
    }

    @Override
    public int updateAttributeNameAndCategory(Map<String, Object> map) {

        return this.attributeNameDao.updateAttributeNameAndCategory(map);
    }

    @Override
    public int deleteAttributeNameAndCategory(Object attributeNameId) {

        return this.attributeNameDao.deleteAttributeNameAndCategory(attributeNameId);
    }
}
