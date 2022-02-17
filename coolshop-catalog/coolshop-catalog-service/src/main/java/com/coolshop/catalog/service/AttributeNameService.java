package com.coolshop.catalog.service;

import com.coolshop.catalog.model.AttributeNameModel;
import java.util.List;
import java.util.Map;

public interface AttributeNameService {

    void save(AttributeNameModel model);

    void saveList(List<AttributeNameModel> modelList);

    int update(AttributeNameModel model);

    int delete(Object id);

    AttributeNameModel find(Object id);

    List<AttributeNameModel> findAll();

    Long count();

    int delete(Object[] ids);

    List<AttributeNameModel> findAttributeNamesByCategoryId(Object categoryId);

    void saveAttributeNameAndCategory(Map<String,Object> map);

    int updateAttributeNameAndCategory(Map<String,Object> map);

    int deleteAttributeNameAndCategory(Object attributeNameId);

}
