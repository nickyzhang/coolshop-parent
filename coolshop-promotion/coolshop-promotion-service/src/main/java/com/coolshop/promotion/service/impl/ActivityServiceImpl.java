package com.coolshop.promotion.service.impl;

import com.coolshop.base.service.impl.BaseServiceImpl;
import com.coolshop.promotion.dao.ActivityDao;
import com.coolshop.promotion.model.Activity;
import com.coolshop.promotion.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ActivityServiceImpl extends BaseServiceImpl<Activity> implements ActivityService {

    @Autowired
    ActivityDao activityDao;

    @Override
    public List<Activity> findActivitiesBySkuId(Long skuId) {

        return this.activityDao.findActivitiesBySkuId(skuId);
    }

    @Override
    public List<Activity> findActivitiesByShopId(Long shopId) {

        return this.activityDao.findActivitiesByShopId(shopId);
    }

    @Override
    public Boolean saveActivityAndSku(Map<String, Object> paramMap) {

        return success(this.activityDao.saveActivityAndSku(paramMap));
    }

    @Override
    public Boolean saveActivityAndShop(Map<String, Object> paramMap) {

        return success(this.activityDao.saveActivityAndShop(paramMap));
    }

    @Override
    public Boolean updateActivityAndSku(Map<String, Object> paramMap) {

        return success(this.activityDao.updateActivityAndSku(paramMap));
    }

    @Override
    public Boolean updateActivityAndShop(Map<String, Object> paramMap) {

        return success(this.activityDao.updateActivityAndShop(paramMap));
    }

    @Override
    public Boolean deleteActivityAndSku(Long activityId) {

        return success(this.activityDao.deleteActivityAndSku(activityId));
    }

    @Override
    public Boolean deleteActivityAndShop(Long activityId) {

        return success(this.activityDao.deleteActivityAndShop(activityId));
    }
}
