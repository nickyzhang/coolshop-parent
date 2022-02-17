package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.base.tool.DateTools;
import com.coolshop.promotion.enums.*;
import com.coolshop.promotion.model.Activity;
import com.coolshop.promotion.model.Rule;
import com.coolshop.promotion.service.ActivityService;
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
public class ActivityServiceTest {
    @Autowired
    IdGenerator idGenerator;

    @Autowired
    RuleService ruleService;

    @Autowired
    ActivityService activityService;

    @Test
    public void save() {
        Activity activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满400减50");
        activity1.setDesc("满400减50");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.ALL);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/cQT4LqhyBrkF.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-18 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-20 01:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        Rule rule = ruleService.selectOne(120040764657894403L);
        activity1.setRule(rule);
        this.activityService.save(activity1);

        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满200减20");
        activity1.setDesc("满200减20");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.ALL);
        activity1.setChannel(PromotionChannelType.MOBILE);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/bEF4LasyFrkJ.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657893379L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("每满100减10");
        activity1.setDesc("每满100减10 ");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.ALL);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.VIP);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(4);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/aRE2LasyYrO.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657895427L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满150打85折");
        activity1.setDesc("满150打85折");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.ALL);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/pCC4LaseFrvB.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657896451L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满300打8折");
        activity1.setDesc("满300打8折");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.APP);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/xYU8LagdFriO.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657897475L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满2件减25");
        activity1.setDesc("满2件减25");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.APP);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/uCE8LsddFrvB.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657898499L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满4件8折");
        activity1.setDesc("满4件8折");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.APP);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/iCE2LagdFrvH.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657899523L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满200免运费");
        activity1.setDesc("满200免运费");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.APP);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("满减");
        activity1.setPromotionLink("/promotion/activity/pCL8CagdFrcF.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-19 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657900547L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满2件免运费");
        activity1.setDesc("满2件免运费");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.APP);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.CONDITIONAL_MONEY_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(20);
        activity1.setTag("免运费");
        activity1.setPromotionLink("/promotion/activity/xHG8LagdFr1B.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-15 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-21 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657901571L);
        activity1.setRule(rule);
        this.activityService.save(activity1);


        activity1 = new Activity();
        activity1.setId(idGenerator.generateId());
        activity1.setName("满2件送赠品");
        activity1.setDesc("满2件送赠品");
        activity1.setCreator(PromotionCreatorType.PLATFORM);
        activity1.setPlatform(PromotionPlatformType.APP);
        activity1.setChannel(PromotionChannelType.PC);
        activity1.setUserScopeType(UserScopeType.ALL);
        activity1.setType(ActivityType.GIFT_OFF);
        activity1.setArea("全国");
        activity1.setLimitedQuantity(0);
        activity1.setLimitedStock(10);
        activity1.setTag("赠品");
        activity1.setPromotionLink("/promotion/activity/zQW5XsdOuiP.html");
        activity1.setStartTime(DateTools.toLocalDateTime("2018-07-16 01:00:00"));
        activity1.setEndTime(DateTools.toLocalDateTime("2018-07-20 12:00:00"));
        activity1.setCreateTime(LocalDateTime.now());
        rule = ruleService.selectOne(120040764657902595L);
        activity1.setRule(rule);
        this.activityService.save(activity1);
    }

    @Test
    public void saveActivityAndSku() {
        // 满100减10
        Map<String,Object> map = new HashMap<>();
        map.put("activityId",120075557114216451L);
        map.put("skuId",120095254907978755L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);
        // 满100减10
        map = new HashMap<>();
        map.put("activityId",120075557114216451L);
        map.put("skuId",120093938500502531L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);
        // 满100减10
        map = new HashMap<>();
        map.put("activityId",120107230350540803L);
        map.put("skuId",120093938500504579L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);

        // 每满100减10
        map = new HashMap<>();
        map.put("activityId",120107230350540803L);
        map.put("skuId",120093938500505603L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        map = new HashMap<>();
        map.put("activityId",120107230350540803L);
        map.put("skuId",120093938500506627L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);

        // 参与满150打85折 满300打8折
        map = new HashMap<>();
        map.put("activityId",120107230350541827L);
        map.put("skuId",120095254907980803L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        map = new HashMap<>();
        map.put("activityId",120107230350542851L);
        map.put("skuId",120095254907980803L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        map = new HashMap<>();
        map.put("activityId",120107230350541827L);
        map.put("skuId",120095254907981827L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        map = new HashMap<>();
        map.put("activityId",120107230350542851L);
        map.put("skuId",120095254907981827L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);

        // 满2件减25
        map = new HashMap<>();
        map.put("activityId",120107230350543875L);
        map.put("skuId",120105306205192195L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        map = new HashMap<>();
        map.put("activityId",120107230350543875L);
        map.put("skuId",120105306205193219L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        // 满200免运费
        map = new HashMap<>();
        map.put("activityId",120107230350545923L);
        map.put("skuId",120095254907982851L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);


        map = new HashMap<>();
        map.put("activityId",120107230350545923L);
        map.put("skuId",120095254907983875L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);

        // 满2件免运费
        map = new HashMap<>();
        map.put("activityId",120107230350546947L);
        map.put("skuId",120105306205192195L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);

        map = new HashMap<>();
        map.put("activityId",120107230350546947L);
        map.put("skuId",120105306205193219L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);

        // 	满2件送赠品
        map = new HashMap<>();
        map.put("activityId",120107230350547971L);
        map.put("skuId",118894019127279619L);
        map.put("createTime",LocalDateTime.now());
        this.activityService.saveActivityAndSku(map);
    }
}
