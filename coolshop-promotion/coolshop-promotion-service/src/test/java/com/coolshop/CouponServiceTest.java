package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.base.tool.DateTools;
import com.coolshop.promotion.enums.*;
import com.coolshop.promotion.model.Coupon;
import com.coolshop.promotion.model.Rule;
import com.coolshop.promotion.service.CouponService;
import com.coolshop.promotion.service.RuleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringPromotionApplication.class})
public class CouponServiceTest {
    @Autowired
    IdGenerator idGenerator;

    @Autowired
    CouponService couponService;

    @Test
    public void save() {
        Coupon coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满200减20");
        coupon.setDesc("满200减20");
        coupon.setPriority(0);
        coupon.setUserScopeType(UserScopeType.ALL);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.PC);
        coupon.setType(CouponType.CASH);
        coupon.setIssueMethod(IssueMethodType.SEND_RECIEVE);
        coupon.setIssueNum(10000L);
        coupon.setIssueFaceValue(20);
        coupon.setMinSpendAmount(200);
        coupon.setLimitReceiveNum(3);
        coupon.setLimitReceiveNum(1);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-07-15 12:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-07-15 13:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-07-15 14:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-07-18 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-08-18 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);

        coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满100减10");
        coupon.setDesc("满100减10");
        coupon.setPriority(0);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.PC);
        coupon.setType(CouponType.CASH);
        coupon.setIssueMethod(IssueMethodType.SEND_RECIEVE);
        coupon.setIssueNum(10000L);
        coupon.setIssueFaceValue(10);
        coupon.setMinSpendAmount(100);
        coupon.setLimitReceiveNum(1);
        coupon.setLimitReceiveNum(0);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-07-15 12:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-07-15 13:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-07-15 14:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-07-18 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-08-18 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);


        coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满399减100");
        coupon.setDesc("满399减100");
        coupon.setPriority(0);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.PC);
        coupon.setType(CouponType.CASH);
        coupon.setIssueMethod(IssueMethodType.SEND_RECIEVE);
        coupon.setIssueNum(10000L);
        coupon.setIssueFaceValue(399);
        coupon.setMinSpendAmount(100);
        coupon.setLimitReceiveNum(1);
        coupon.setLimitReceiveNum(0);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-07-15 12:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-07-15 13:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-07-15 14:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-07-18 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-08-18 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);


        coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满1000减100");
        coupon.setDesc("满1000减100");
        coupon.setPriority(0);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.PC);
        coupon.setType(CouponType.CASH);
        coupon.setIssueMethod(IssueMethodType.SEND_RECIEVE);
        coupon.setIssueNum(10000L);
        coupon.setIssueFaceValue(1000);
        coupon.setMinSpendAmount(100);
        coupon.setLimitReceiveNum(1);
        coupon.setLimitReceiveNum(0);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-07-16 06:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-07-16 07:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-07-16 09:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-07-22 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-08-01 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);


        coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满200打9折");
        coupon.setDesc("满200打9折");
        coupon.setPriority(0);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.MOBILE);
        coupon.setType(CouponType.DISCOUNT);
        coupon.setIssueMethod(IssueMethodType.ONLY_SEND);
        coupon.setIssueNum(8000L);
        coupon.setIssueFaceValue(90);
        coupon.setMinSpendAmount(200);
        coupon.setLimitReceiveNum(1);
        coupon.setLimitReceiveNum(0);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-06-15 12:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-06-15 13:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-06-15 14:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-06-18 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-07-18 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);


        coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满399打8折");
        coupon.setDesc("满399打8折");
        coupon.setPriority(0);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.MOBILE);
        coupon.setType(CouponType.DISCOUNT);
        coupon.setIssueMethod(IssueMethodType.ONLY_SEND);
        coupon.setIssueNum(8000L);
        coupon.setIssueFaceValue(80);
        coupon.setMinSpendAmount(399);
        coupon.setLimitReceiveNum(1);
        coupon.setLimitReceiveNum(0);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-06-15 12:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-06-15 13:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-06-15 14:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-06-18 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-08-18 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);


        coupon = new Coupon();
        coupon.setId(idGenerator.generateId());
        coupon.setName("满1000打8.5折");
        coupon.setDesc("满1000打8.5折");
        coupon.setPriority(0);
        coupon.setCreator(PromotionCreatorType.SHOP);
        coupon.setPlatform(PromotionPlatformType.ALL);
        coupon.setChannel(PromotionChannelType.MOBILE);
        coupon.setType(CouponType.DISCOUNT);
        coupon.setIssueMethod(IssueMethodType.ONLY_SEND);
        coupon.setIssueNum(5000L);
        coupon.setIssueFaceValue(85);
        coupon.setMinSpendAmount(1000);
        coupon.setLimitReceiveNum(1);
        coupon.setLimitReceiveNum(0);
        coupon.setIssueStartTime(DateTools.toLocalDateTime("2018-06-15 12:00:00"));
        coupon.setIssueEndTime(DateTools.toLocalDateTime("2018-06-15 13:00:00"));
        coupon.setReceiveStartTime(DateTools.toLocalDateTime("2018-06-15 14:00:00"));
        coupon.setReceiveEndTime(DateTools.toLocalDateTime("2018-06-15 23:59:59"));
        coupon.setExpiredTime(DateTools.toLocalDateTime("2018-08-19 23:59:59"));
        coupon.setCreateTime(LocalDateTime.now());
        this.couponService.save(coupon);
    }

    @Test
    public void saveCouponAndSku(){
        // 满100减10 120111953740824579
        // 满200减20 120113026408906755
        Map<String,Object> map = new HashMap<>();
        map.put("couponId",120113026408906755L);
        map.put("skuId",120095254907982851L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120111953740824579L);
        map.put("skuId",120095254907982851L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120113026408906755L);
        map.put("skuId",120095254907983875L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120111953740824579L);
        map.put("skuId",120095254907983875L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);


        // 	满399减100；满100减10
        map = new HashMap<>();
        map.put("couponId",120113026408908803L);
        map.put("skuId",120095254907980803L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120111953740824579L);
        map.put("skuId",120095254907980803L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120113026408908803L);
        map.put("skuId",120095254907981827L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120111953740824579L);
        map.put("skuId",120095254907981827L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);


        // 满1000减100；满200减20
        map = new HashMap<>();
        map.put("couponId",120113026408909827L);
        map.put("skuId",118894019127279619L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120113026408906755L);
        map.put("skuId",118894019127279619L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120113026408909827L);
        map.put("skuId",118895868110700547L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120113026408906755L);
        map.put("skuId",118895868110700547L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        // 满1000打8.5折
        map = new HashMap<>();
        map.put("couponId",120113026408912899L);
        map.put("skuId",118896029171974147L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

        map = new HashMap<>();
        map.put("couponId",120113026408912899L);
        map.put("skuId",118896221371760643L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);


        map = new HashMap<>();
        map.put("couponId",120113026408912899L);
        map.put("skuId",118896283648786435L);
        map.put("createTime",LocalDateTime.now());
        this.couponService.saveCouponAndSku(map);

    }
}
