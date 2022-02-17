package com.coolshop.catalog.service;

import com.coolshop.catalog.model.AttributeValueModel;
import java.util.List;

public interface AttributeValueService {

    void save(AttributeValueModel model);

    void saveList(List<AttributeValueModel> modelList);

    int update(AttributeValueModel model);

    int delete(Object id);

    AttributeValueModel find(Object id);

    List<AttributeValueModel> findAll();

    Long count();

    int delete(Object[] ids);
}
