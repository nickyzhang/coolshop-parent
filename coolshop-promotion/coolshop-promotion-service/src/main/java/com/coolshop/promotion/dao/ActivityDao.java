package com.coolshop.promotion.dao;

import com.coolshop.base.mapper.BaseMapper;
import com.coolshop.promotion.model.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ActivityDao extends BaseMapper<Activity> {

    List<Activity> findActivitiesBySkuId(Long skuId);

    List<Activity> findActivitiesByShopId(Long shopId);

    Integer saveActivityAndSku(Map<String,Object> paramMap);

    Integer saveActivityAndShop(Map<String,Object> paramMap);

    Integer updateActivityAndSku(Map<String,Object> paramMap);

    Integer updateActivityAndShop(Map<String,Object> paramMap);

    Integer updateBatchById(List<Activity> entityList);

    Integer deleteActivityAndSku(Long activityId);

    Integer deleteActivityAndShop(Long activityId);
}
