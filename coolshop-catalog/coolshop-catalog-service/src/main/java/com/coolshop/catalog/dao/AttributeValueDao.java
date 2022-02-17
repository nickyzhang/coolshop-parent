package com.coolshop.catalog.dao;

import com.coolshop.base.dao.BaseDao;
import com.coolshop.catalog.model.AttributeValueModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttributeValueDao extends BaseDao<AttributeValueModel> {
}
