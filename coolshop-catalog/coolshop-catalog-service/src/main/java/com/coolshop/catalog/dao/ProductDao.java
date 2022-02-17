package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.ProductModel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProductDao extends BaseDao<ProductModel> {

    List<ProductModel> findProductsByCategoryId(Object categoryId);

    List<ProductModel> findProductsByBrandId(Object brandId);

    List<AttributeValueModel> findPropertiesByProductId(Object productId);

    void saveProductAndAttributeValue(Map<String,Object> map);

    int updateProductAndAttributeValue(Map<String,Object> map);

    int deleteProductAndAttributeValue(Object productId);
}
