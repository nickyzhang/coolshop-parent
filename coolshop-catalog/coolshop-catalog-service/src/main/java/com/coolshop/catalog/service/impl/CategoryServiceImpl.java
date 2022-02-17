package com.coolshop.catalog.service.impl;

import com.coolshop.catalog.dao.CategoryDao;
import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.CategoryModel;
import com.coolshop.catalog.service.CategoryService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
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
public class CategoryServiceImpl implements CategoryService {

    private static Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @Autowired
    CategoryDao categoryDao;

    @Override
    public void save(CategoryModel model) {
        if (model == null) {
            logger.error("[CategoryService][save] 参数不允许为空");
            return;
        }
        this.categoryDao.save(model);
    }

    @Override
    public void saveList(List<CategoryModel> modelList) {
        if (CollectionUtils.isEmpty(modelList)) {
            logger.error("[CategoryService][saveList] 参数不允许为空");
            return;
        }
        this.categoryDao.saveList(modelList);
    }

    @Override
    public int update(CategoryModel model) {
        if (model == null) {
            logger.error("[CategoryService][update] 参数不允许为空");
            return 0;
        }
        return this.categoryDao.update(model);
    }

    @Override
    public int delete(Object id) {
        if (id == null) {
            logger.error("[CategoryService][delete] 参数不允许为空");
            return 0;
        }
        try {
            this.categoryDao.deleteCategoryAndBrand(id);
            this.categoryDao.deleteCategoryAttributeName(id);
        } catch (Exception e) {
            logger.error("[CategoryService][delete]不能正确删除分类的关联信息");
            return 1;
        }

        return this.categoryDao.delete(id);
    }

    @Override
    public CategoryModel find(Object id) {
        if (id == null) {
            logger.error("[CategoryService][find] 参数不允许为空");
            return null;
        }
        return this.categoryDao.find(id);
    }

    @Override
    public List<CategoryModel> findAll() {

        return this.categoryDao.findAll();
    }

    @Override
    public Long count() {

        return this.categoryDao.count();
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
    public CategoryModel findByName(String name) {
        if (StringUtils.isBlank(name)) {
            logger.error("[CategoryService][findByName] 参数名不能为空");
            return null;
        }
        return this.categoryDao.findByName(name);
    }

    @Override
    public List<CategoryModel> findCategoriesByBrandId(Object brandId) {
        if (brandId == null) {
            logger.error("[CategoryService][findCategoriesByBrandId] 参数不能为空");
            return null;
        }
        return this.categoryDao.findCategoriesByBrandId(brandId);
    }

    @Override
    public List<CategoryModel> findCategoriesByAttributeNameId(Object attributeNameId) {
        if (attributeNameId == null) {
            logger.error("[CategoryService][findCategoriesByAttributeNameId] 参数不能为空");
            return null;
        }
        return this.categoryDao.findCategoriesByAttributeNameId(attributeNameId);
    }

    @Override
    public void saveCategoryAndBrand(Map<String, Object> map) {
        if (MapUtils.isEmpty(map)) {
            logger.error("[CategoryService][saveCategoryAndBrand] 参数不能为空");
            return;
        }
        this.categoryDao.saveCategoryAndBrand(map);
    }

    @Override
    public void saveCategoryAndAttributeName(Map<String, Object> map) {
        if (MapUtils.isEmpty(map)) {
            logger.error("[CategoryService][saveCategoryAndAttributeName] 参数不能为空");
            return;
        }
        this.categoryDao.saveCategoryAndAttributeName(map);
    }

    @Override
    public int updateCategoryAndBrand(Map<String, Object> map) {
        if (MapUtils.isEmpty(map)) {
            logger.error("[CategoryService][updateCategoryAndBrand] 参数不能为空");
            return 0;
        }
        return this.categoryDao.updateCategoryAndBrand(map);
    }

    @Override
    public int updateCategoryAndAttributeName(Map<String, Object> map) {
        if (MapUtils.isEmpty(map)) {
            logger.error("[CategoryService][updateCategoryAndAttributeName] 参数不能为空");
            return 0;
        }
        return this.categoryDao.updateCategoryAndAttributeName(map);
    }

    @Override
    public int deleteCategoryAndBrand(Object categoryId) {
        if (categoryId == null) {
            logger.error("[CategoryService][deleteCategoryAndBrand] 参数不能为空");
            return 0;
        }
        return this.categoryDao.deleteCategoryAndBrand(categoryId);
    }

    @Override
    public int deleteCategoryAttributeName(Object categoryId) {
        if (categoryId == null) {
            logger.error("[CategoryService][deleteCategoryAttributeName] categoryId 参数不能为空");
            return 0;
        }
        return this.categoryDao.deleteCategoryAttributeName(categoryId);
    }

    @Override
    public List<AttributeNameModel> getCategoryAndAncestorAttributes(Object categoryId) {
        CategoryModel category = this.find(categoryId);
        List<AttributeNameModel> allCategoriesAttributes = new ArrayList<>();
        List<AttributeNameModel> attributes = null;
        while (category != null) {
            // 获取AttributeName，然后添加到集合里
            attributes = category.getAttributeNameList();
            // 如果没有属性或者是懒加载对象(代理)
            if (CollectionUtils.isNotEmpty(attributes) && !StringUtils.isBlank(attributes.get(0).getName())) {
                allCategoriesAttributes.addAll(attributes);
            }
            category = category.getParent();
        }
        return allCategoriesAttributes;
    }
}
