package com.coolshop.base.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

    void save(T model);

    void saveList(List<T> modelList);

    int update(T model);

    int delete(Object id);

    T find(Object id);

    List<T> findAll();

    Long count();

    int delete(Object[] ids);

}
