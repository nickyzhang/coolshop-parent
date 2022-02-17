package com.coolshop.promotion.model;


import com.coolshop.promotion.enums.*;

import java.time.LocalDateTime;

public class Activity extends Promotion {

    private ActivityType type;

    private ActivityStatusType status;

    private String area;

    private Integer limitedQuantity;

    private Integer limitedStock;

    private String tag;

    private String promotionLink;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Rule rule;

    public Activity() {}

    public Activity(Long id, String name, String desc, Integer priority, PromotionCreatorType creator,
                    PromotionPlatformType platform, PromotionChannelType channel, UserScopeType userScopeType,
                    LocalDateTime createTime, ActivityType type, ActivityStatusType status, String area,
                    Integer limitedQuantity, Integer limitedStock, String tag, String promotionLink,
                    LocalDateTime startTime, LocalDateTime endTime, Rule rule) {
        super(id, name, desc, priority, creator, platform, channel, userScopeType, createTime);
        this.type = type;
        this.status = status;
        this.area = area;
        this.limitedQuantity = limitedQuantity;
        this.limitedStock = limitedStock;
        this.tag = tag;
        this.promotionLink = promotionLink;
        this.startTime = startTime;
        this.endTime = endTime;
        this.rule = rule;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public ActivityStatusType getStatus() {
        return status;
    }

    public void setStatus(ActivityStatusType status) {
        this.status = status;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getLimitedQuantity() {
        return limitedQuantity;
    }

    public void setLimitedQuantity(Integer limitedQuantity) {
        this.limitedQuantity = limitedQuantity;
    }

    public Integer getLimitedStock() {
        return limitedStock;
    }

    public void setLimitedStock(Integer limitedStock) {
        this.limitedStock = limitedStock;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPromotionLink() {
        return promotionLink;
    }

    public void setPromotionLink(String promotionLink) {
        this.promotionLink = promotionLink;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }
}

