package com.coolshop.promotion.service;

import com.coolshop.base.service.BaseService;
import com.coolshop.promotion.model.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityService extends BaseService<Activity>{

    List<Activity> findActivitiesBySkuId(Long skuId);

    List<Activity> findActivitiesByShopId(Long shopId);

    Boolean saveActivityAndSku(Map<String,Object> paramMap);

    Boolean saveActivityAndShop(Map<String,Object> paramMap);

    Boolean updateActivityAndSku(Map<String,Object> paramMap);

    Boolean updateActivityAndShop(Map<String,Object> paramMap);

    Boolean updateBatchById(List<Activity> entityList);

    Boolean deleteActivityAndSku(Long activityId);

    Boolean deleteActivityAndShop(Long activityId);
}
