package com.coolshop.catalog.service;

import com.coolshop.catalog.model.AttributeValueModel;
import com.coolshop.catalog.model.ProductModel;
import java.util.List;
import java.util.Map;

public interface ProductService {

    void save(ProductModel model);

    void saveList(List<ProductModel> modelList);

    int update(ProductModel model);

    int delete(Object id);

    ProductModel find(Object id);

    List<ProductModel> findAll();

    Long count();

    int delete(Object[] ids);

    List<ProductModel> findProductsByCategoryId(Object categoryId);

    List<ProductModel> findProductsByBrandId(Object brandId);

    List<AttributeValueModel> findPropertiesByProductId(Object productId);

    void saveProductAndAttributeValue(Map<String,Object> map);

    int updateProductAndAttributeValue(Map<String,Object> map);

    int deleteProductAndAttributeValue(Object productId);
}
