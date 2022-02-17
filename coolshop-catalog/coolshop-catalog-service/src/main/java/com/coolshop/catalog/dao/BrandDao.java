package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.BrandModel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface BrandDao extends BaseDao<BrandModel> {

    BrandModel findByName(String name);

    List<BrandModel> findBrandsByCategoryId(Object categoryId);

    void saveBrandAndCategory(Map<String,Object> map);

    int updateBrandAndCategory(Map<String,Object> map);

    int deleteBrandAndCategory(Object brandId);
}
