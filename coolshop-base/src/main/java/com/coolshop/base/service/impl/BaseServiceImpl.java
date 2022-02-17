package com.coolshop.base.service.impl;

import com.coolshop.base.mapper.BaseMapper;
import com.coolshop.base.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    @Autowired
    protected BaseMapper<T> mapper;

    public <M extends BaseMapper<T>> M getMapper() {

        return (M)mapper;
    }

    public boolean success(Integer result) {

        return result != null && result > 0;
    }

    @Override
    public Boolean save(T entity) {

        return success(getMapper().save(entity));
    }

    @Override
    public Boolean saveBatch(List<T> entityList) {

        return success(getMapper().saveBatch(entityList));
    }

    @Override
    public Boolean delete(T entity) {

        return success(getMapper().delete(entity));
    }

    @Override
    public Boolean deleteById(Long id) {

        return success(getMapper().deleteById(id));
    }

    @Override
    public Boolean deleteAll() {
        return success(getMapper().deleteAll());
    }

    @Override
    public Boolean update(T entity) {

        return success(getMapper().update(entity));
    }

    @Override
    public Boolean updateBatchById(List<T> entityList) {

        return success(getMapper().updateBatchById(entityList));
    }

    @Override
    public T selectOne(Long id) {

        return getMapper().selectOne(id);
    }

    @Override
    public List<T> selectAll() {

        return getMapper().selectAll();
    }

    @Override
    public Long count() {

        return getMapper().count();
    }
}
