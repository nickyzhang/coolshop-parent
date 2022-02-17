package com.coolshop.promotion.dao;

import com.coolshop.base.mapper.BaseMapper;
import com.coolshop.promotion.model.Coupon;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface CouponDao extends BaseMapper<Coupon> {

    List<Coupon> findCouponsBySkuId(Long skuId);

    List<Coupon> findCouponsByShopId(Long shopId);

    Integer saveCouponAndSku(Map<String,Object> paramMap);

    Integer saveCouponAndShop(Map<String,Object> paramMap);

    Integer updateCouponAndSku(Map<String,Object> paramMap);

    Integer updateCouponAndShop(Map<String,Object> paramMap);

    Integer deleteCouponAndSku(Long couponId);

    Integer deleteCouponAndShop(Long couponId);

}
