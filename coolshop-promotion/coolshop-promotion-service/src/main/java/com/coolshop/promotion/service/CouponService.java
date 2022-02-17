package com.coolshop.promotion.service;

import com.coolshop.base.service.BaseService;
import com.coolshop.promotion.model.Coupon;
import java.util.List;
import java.util.Map;

public interface CouponService extends BaseService<Coupon> {

    List<Coupon> findCouponsBySkuId(Long skuId);

    List<Coupon> findCouponsByShopId(Long shopId);

    Boolean saveCouponAndSku(Map<String,Object> paramMap);

    Boolean saveCouponAndShop(Map<String,Object> paramMap);

    Boolean updateCouponAndSku(Map<String,Object> paramMap);

    Boolean updateCouponAndShop(Map<String,Object> paramMap);

    Boolean deleteCouponAndSku(Long couponId);

    Boolean deleteCouponAndShop(Long couponId);
}
