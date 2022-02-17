package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.AttributeNameModel;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface AttributeNameDao extends BaseDao<AttributeNameModel> {

    List<AttributeNameModel> findAttributeNamesByCategoryId(Object categoryId);

    void saveAttributeNameAndCategory(Map<String,Object> map);

    int updateAttributeNameAndCategory(Map<String,Object> map);

    int deleteAttributeNameAndCategory(Object attributeNameId);
}
