package com.coolshop.catalog.service;

import com.coolshop.catalog.model.AttributeNameModel;
import com.coolshop.catalog.model.CategoryModel;

import java.util.List;
import java.util.Map;

public interface CategoryService {

    void save(CategoryModel model);

    void saveList(List<CategoryModel> modelList);

    int update(CategoryModel model);

    int delete(Object id);

    CategoryModel find(Object id);

    List<CategoryModel> findAll();

    Long count();

    int delete(Object[] ids);

    CategoryModel findByName(String name);

    List<CategoryModel> findCategoriesByBrandId(Object brandId);

    List<CategoryModel> findCategoriesByAttributeNameId(Object attributeNameId);

    void saveCategoryAndBrand(Map<String,Object> map);

    void saveCategoryAndAttributeName(Map<String,Object> map);

    int updateCategoryAndBrand(Map<String,Object> map);

    int updateCategoryAndAttributeName(Map<String,Object> map);

    int deleteCategoryAndBrand(Object categoryId);

    int deleteCategoryAttributeName(Object categoryId);

    List<AttributeNameModel> getCategoryAndAncestorAttributes(Object categoryId);
}
