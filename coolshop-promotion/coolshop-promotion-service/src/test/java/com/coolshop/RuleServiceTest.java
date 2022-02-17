package com.coolshop;

import com.coolshop.base.generator.IdGenerator;
import com.coolshop.promotion.model.Rule;
import com.coolshop.promotion.service.RuleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringPromotionApplication.class})
public class RuleServiceTest {
    @Autowired
    IdGenerator idGenerator;

    @Autowired
    RuleService ruleService;

    @Test
    public void save() {
//        Rule rule = new Rule();
//        rule.setId(this.idGenerator.generateId());
//        rule.setName("满200减20");
//        rule.setLadderSpendMoney(200L);
//        rule.setPerSpendMoney(0L);
//        rule.setQuantity(0L);
//        rule.setMoneyOff(20L);
//        rule.setDiscountOff(0);
//        rule.setFreeShip(Boolean.FALSE);
//        rule.setPresentGift(Boolean.FALSE);
//        rule.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule);
//
//
//        Rule rule1 = new Rule();
//        rule1.setId(this.idGenerator.generateId());
//        rule1.setName("满400减50");
//        rule1.setLadderSpendMoney(400L);
//        rule1.setPerSpendMoney(0L);
//        rule1.setQuantity(0L);
//        rule1.setMoneyOff(50L);
//        rule1.setDiscountOff(0);
//        rule1.setFreeShip(Boolean.FALSE);
//        rule1.setPresentGift(Boolean.FALSE);
//        rule1.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule1);
//
//
//        Rule rule2 = new Rule();
//        rule2.setId(this.idGenerator.generateId());
//        rule2.setName("每满100减10");
//        rule2.setLadderSpendMoney(0L);
//        rule2.setPerSpendMoney(100L);
//        rule2.setQuantity(0L);
//        rule2.setMoneyOff(10L);
//        rule2.setDiscountOff(0);
//        rule2.setFreeShip(Boolean.FALSE);
//        rule2.setPresentGift(Boolean.FALSE);
//        rule2.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule2);
//
//
//
//
//        Rule rule3 = new Rule();
//        rule3.setId(this.idGenerator.generateId());
//        rule3.setName("满150打85折");
//        rule3.setLadderSpendMoney(150L);
//        rule3.setPerSpendMoney(0L);
//        rule3.setQuantity(0L);
//        rule3.setMoneyOff(0L);
//        rule3.setDiscountOff(85);
//        rule3.setFreeShip(Boolean.FALSE);
//        rule3.setPresentGift(Boolean.FALSE);
//        rule3.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule3);
//
//        Rule rule4 = new Rule();
//        rule4.setId(this.idGenerator.generateId());
//        rule4.setName("满300打8折");
//        rule4.setLadderSpendMoney(300L);
//        rule4.setPerSpendMoney(0L);
//        rule4.setQuantity(0L);
//        rule4.setMoneyOff(0L);
//        rule4.setDiscountOff(80);
//        rule4.setFreeShip(Boolean.FALSE);
//        rule4.setPresentGift(Boolean.FALSE);
//        rule4.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule4);
//
//
//        Rule rule5 = new Rule();
//        rule5.setId(this.idGenerator.generateId());
//        rule5.setName("满2件减25");
//        rule5.setLadderSpendMoney(0L);
//        rule5.setPerSpendMoney(0L);
//        rule5.setQuantity(2L);
//        rule5.setMoneyOff(25L);
//        rule5.setDiscountOff(0);
//        rule5.setFreeShip(Boolean.FALSE);
//        rule5.setPresentGift(Boolean.FALSE);
//        rule5.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule5);
//
//        Rule rule6 = new Rule();
//        rule6.setId(this.idGenerator.generateId());
//        rule6.setName("满4件8折");
//        rule6.setLadderSpendMoney(0L);
//        rule6.setPerSpendMoney(0L);
//        rule6.setQuantity(4L);
//        rule6.setMoneyOff(0L);
//        rule6.setDiscountOff(80);
//        rule6.setFreeShip(Boolean.FALSE);
//        rule6.setPresentGift(Boolean.FALSE);
//        rule6.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule6);
//
//
//        Rule rule7 = new Rule();
//        rule7.setId(this.idGenerator.generateId());
//        rule7.setName("满200免运费");
//        rule7.setLadderSpendMoney(200L);
//        rule7.setPerSpendMoney(0L);
//        rule7.setQuantity(0L);
//        rule7.setMoneyOff(0L);
//        rule7.setDiscountOff(0);
//        rule7.setFreeShip(Boolean.TRUE);
//        rule7.setPresentGift(Boolean.FALSE);
//        rule7.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule7);
//
//
//        Rule rule8 = new Rule();
//        rule8.setId(this.idGenerator.generateId());
//        rule8.setName("满2件免运费");
//        rule8.setLadderSpendMoney(0L);
//        rule8.setPerSpendMoney(0L);
//        rule8.setQuantity(2L);
//        rule8.setMoneyOff(0L);
//        rule8.setDiscountOff(0);
//        rule8.setFreeShip(Boolean.TRUE);
//        rule8.setPresentGift(Boolean.FALSE);
//        rule8.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule8);
//
//
//        Rule rule9 = new Rule();
//        rule9.setId(this.idGenerator.generateId());
//        rule9.setName("满2件送赠品");
//        rule9.setLadderSpendMoney(0L);
//        rule9.setPerSpendMoney(0L);
//        rule9.setQuantity(2L);
//        rule9.setMoneyOff(0L);
//        rule9.setDiscountOff(0);
//        rule9.setFreeShip(Boolean.FALSE);
//        rule9.setPresentGift(Boolean.TRUE);
//        rule9.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule9);
//
//
//        Rule rule9 = new Rule();
//        rule9.setId(this.idGenerator.generateId());
//        rule9.setName("满2件送赠品");
//        rule9.setLadderSpendMoney(0L);
//        rule9.setPerSpendMoney(0L);
//        rule9.setQuantity(2L);
//        rule9.setMoneyOff(0L);
//        rule9.setDiscountOff(0);
//        rule9.setFreeShip(Boolean.FALSE);
//        rule9.setPresentGift(Boolean.TRUE);
//        rule9.setCreateTime(LocalDateTime.now());
//        this.ruleService.save(rule9);


        Rule rule10 = new Rule();
        rule10.setId(this.idGenerator.generateId());
        rule10.setName("直减20");
        rule10.setLadderSpendMoney(0L);
        rule10.setPerSpendMoney(0L);
        rule10.setQuantity(0L);
        rule10.setMoneyOff(0L);
        rule10.setDiscountOff(0);
        rule10.setFreeShip(Boolean.FALSE);
        rule10.setPresentGift(Boolean.FALSE);
        rule10.setCreateTime(LocalDateTime.now());
        this.ruleService.save(rule10);


        rule10 = new Rule();
        rule10.setId(this.idGenerator.generateId());
        rule10.setName("直减100");
        rule10.setLadderSpendMoney(0L);
        rule10.setPerSpendMoney(0L);
        rule10.setQuantity(0L);
        rule10.setMoneyOff(0L);
        rule10.setDiscountOff(0);
        rule10.setFreeShip(Boolean.FALSE);
        rule10.setPresentGift(Boolean.FALSE);
        rule10.setCreateTime(LocalDateTime.now());
        this.ruleService.save(rule10);

        rule10 = new Rule();
        rule10.setId(this.idGenerator.generateId());
        rule10.setName("VIP专享价100");
        rule10.setLadderSpendMoney(0L);
        rule10.setPerSpendMoney(0L);
        rule10.setQuantity(0L);
        rule10.setMoneyOff(0L);
        rule10.setDiscountOff(0);
        rule10.setFreeShip(Boolean.FALSE);
        rule10.setPresentGift(Boolean.FALSE);
        rule10.setCreateTime(LocalDateTime.now());
        this.ruleService.save(rule10);


        rule10 = new Rule();
        rule10.setId(this.idGenerator.generateId());
        rule10.setName("VIP专享价2800");
        rule10.setLadderSpendMoney(0L);
        rule10.setPerSpendMoney(0L);
        rule10.setQuantity(0L);
        rule10.setMoneyOff(0L);
        rule10.setDiscountOff(0);
        rule10.setFreeShip(Boolean.FALSE);
        rule10.setPresentGift(Boolean.FALSE);
        rule10.setCreateTime(LocalDateTime.now());
        this.ruleService.save(rule10);


        rule10 = new Rule();
        rule10.setId(this.idGenerator.generateId());
        rule10.setName("秒杀价");
        rule10.setLadderSpendMoney(0L);
        rule10.setPerSpendMoney(0L);
        rule10.setQuantity(0L);
        rule10.setMoneyOff(0L);
        rule10.setDiscountOff(0);
        rule10.setFreeShip(Boolean.FALSE);
        rule10.setPresentGift(Boolean.FALSE);
        rule10.setCreateTime(LocalDateTime.now());
        this.ruleService.save(rule10);
    }
}
