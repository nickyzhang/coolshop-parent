package com.coolshop.promotion.dao;

import com.coolshop.base.mapper.BaseMapper;
import com.coolshop.promotion.model.Rule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RuleDao extends BaseMapper<Rule> {
}
