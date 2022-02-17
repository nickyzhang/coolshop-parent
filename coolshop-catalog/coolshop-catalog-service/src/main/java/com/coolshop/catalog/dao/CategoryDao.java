package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.CategoryModel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface CategoryDao extends BaseDao<CategoryModel> {

    CategoryModel findByName(String name);

    List<CategoryModel> findCategoriesByBrandId(Object brandId);

    List<CategoryModel> findCategoriesByAttributeNameId(Object attributeNameId);

    void saveCategoryAndBrand(Map<String,Object> map);

    void saveCategoryAndAttributeName(Map<String,Object> map);

    int updateCategoryAndBrand(Map<String,Object> map);

    int updateCategoryAndAttributeName(Map<String,Object> map);

    int deleteCategoryAndBrand(Object categoryId);

    int deleteCategoryAttributeName(Object categoryId);

}
