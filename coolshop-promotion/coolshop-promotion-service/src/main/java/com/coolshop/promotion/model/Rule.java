package com.coolshop.promotion.model;

import java.time.LocalDateTime;

public class Rule {

    private Long id;

    private String name;

    private Long ladderSpendMoney;

    private Long perSpendMoney;

    private Long quantity;

    private Long moneyOff;

    private Integer discountOff;

    private Boolean freeShip;

    private Boolean presentGift;

    private LocalDateTime createTime;

    public Rule() {}

    public Rule(Long id, String name, Long ladderSpendMoney, Long perSpendMoney, Long quantity,
                Long moneyOff, Integer discountOff, Boolean freeShip, Boolean presentGift,
                LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.ladderSpendMoney = ladderSpendMoney;
        this.perSpendMoney = perSpendMoney;
        this.quantity = quantity;
        this.moneyOff = moneyOff;
        this.discountOff = discountOff;
        this.freeShip = freeShip;
        this.presentGift = presentGift;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLadderSpendMoney() {
        return ladderSpendMoney;
    }

    public void setLadderSpendMoney(Long ladderSpendMoney) {
        this.ladderSpendMoney = ladderSpendMoney;
    }

    public Long getPerSpendMoney() {
        return perSpendMoney;
    }

    public void setPerSpendMoney(Long perSpendMoney) {
        this.perSpendMoney = perSpendMoney;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getMoneyOff() {
        return moneyOff;
    }

    public void setMoneyOff(Long moneyOff) {
        this.moneyOff = moneyOff;
    }

    public Integer getDiscountOff() {
        return discountOff;
    }

    public void setDiscountOff(Integer discountOff) {
        this.discountOff = discountOff;
    }

    public Boolean getFreeShip() {
        return freeShip;
    }

    public void setFreeShip(Boolean freeShip) {
        this.freeShip = freeShip;
    }

    public Boolean getPresentGift() {
        return presentGift;
    }

    public void setPresentGift(Boolean presentGift) {
        this.presentGift = presentGift;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
