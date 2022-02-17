package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.AttributeValueDao;
import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.service.AttributeNameService;
import com.coolshop.catalog.service.AttributeValueService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
    public class AttributeValueServiceImpl implements AttributeValueService {

    private static Logger logger = LoggerFactory.getLogger(AttributeValueServiceImpl.class);

    @Autowired
    AttributeValueDao attributeValueDao;


    @Override
    public void save(AttributeValueModel model) {
        this.attributeValueDao.save(model);
    }

    @Override
    public void saveList(List<AttributeValueModel> modelList) {
        this.attributeValueDao.saveList(modelList);
    }

    @Override
    public int update(AttributeValueModel model) {
        return  this.attributeValueDao.update(model);
    }

    @Override
    public AttributeValueModel find(Object id) {
        return this.attributeValueDao.find(id);
    }

    @Override
    public List<AttributeValueModel> findAll() {
        return this.attributeValueDao.findAll();
    }

    @Override
    public Long count() {
        return  this.attributeValueDao.count();
    }

    @Override
    public int delete(Object id) {
        return this.attributeValueDao.delete(id);
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
}
