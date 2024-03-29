package com.coolshop.base.mapper;

import java.util.List;

public interface BaseMapper<T> {

    Integer save(T entity);

    Integer saveBatch(List<T> entityList);

    Integer delete(T entity);

    Integer deleteById(Long id);

    Integer deleteAll();

    Integer update(T entity);

    Integer updateBatchById(List<T> entityList);

    T selectOne(Long id);

    List<T> selectAll();

    Long count();
}
