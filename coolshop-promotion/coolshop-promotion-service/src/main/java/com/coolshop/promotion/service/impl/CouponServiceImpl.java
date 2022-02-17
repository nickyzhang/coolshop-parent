package com.coolshop.promotion.service.impl;

import com.coolshop.base.service.impl.BaseServiceImpl;
import com.coolshop.promotion.dao.CouponDao;
import com.coolshop.promotion.model.Coupon;
import com.coolshop.promotion.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CouponServiceImpl extends BaseServiceImpl<Coupon> implements CouponService {

    @Autowired
    CouponDao couponDao;

    @Override
    public List<Coupon> findCouponsBySkuId(Long skuId) {

        return this.couponDao.findCouponsBySkuId(skuId);
    }

    @Override
    public List<Coupon> findCouponsByShopId(Long shopId) {

        return this.couponDao.findCouponsByShopId(shopId);
    }

    @Override
    public Boolean saveCouponAndSku(Map<String, Object> paramMap) {

        return success(couponDao.saveCouponAndSku(paramMap));
    }

    @Override
    public Boolean saveCouponAndShop(Map<String, Object> paramMap) {

        return success(couponDao.saveCouponAndShop(paramMap));
    }

    @Override
    public Boolean updateCouponAndSku(Map<String, Object> paramMap) {

        return success(couponDao.updateCouponAndSku(paramMap));
    }

    @Override
    public Boolean updateCouponAndShop(Map<String, Object> paramMap) {

        return success(couponDao.updateCouponAndSku(paramMap));
    }

    @Override
    public Boolean deleteCouponAndSku(Long couponId) {

        return success(couponDao.deleteCouponAndSku(couponId));
    }

    @Override
    public Boolean deleteCouponAndShop(Long couponId) {

        return success(couponDao.deleteCouponAndShop(couponId));
    }
}
