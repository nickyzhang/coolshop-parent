package com.coolshop.catalog.service;

import com.coolshop.catalog.model.BrandModel;

import java.util.List;
import java.util.Map;

public interface BrandService {

    void save(BrandModel model);

    void saveList(List<BrandModel> modelList);

    int update(BrandModel model);

    int delete(Object id);

    BrandModel find(Object id);

    List<BrandModel> findAll();

    Long count();

    int delete(Object[] ids);

    BrandModel findByName(String name);

    List<BrandModel> findBrandsByCategoryId(Object categoryId);

    void saveBrandAndCategory(Map<String,Object> map);

    int updateBrandAndCategory(Map<String,Object> map);

    int deleteBrandAndCategory(Object brandId);

}
