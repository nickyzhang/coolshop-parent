package com.coolshop.base.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {

    Boolean save(T entity);

    Boolean saveBatch(List<T> entityList);

    Boolean delete(T entity);

    Boolean deleteById(Long id);

    Boolean deleteAll();

    Boolean update(T entity);

    Boolean updateBatchById(List<T> entityList);

    T selectOne(Long id);

    List<T> selectAll();

    Long count();
}
