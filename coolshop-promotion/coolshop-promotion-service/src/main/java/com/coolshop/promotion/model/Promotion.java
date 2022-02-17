package com.coolshop.promotion.model;

import com.coolshop.promotion.enums.PromotionChannelType;
import com.coolshop.promotion.enums.PromotionCreatorType;
import com.coolshop.promotion.enums.PromotionPlatformType;
import com.coolshop.promotion.enums.UserScopeType;

import java.time.LocalDateTime;

public class Promotion {

    private Long id;

    private String name; // 名字

    private String desc; // 描述

    private Integer priority; // 优先级

    private PromotionCreatorType creator; // 创建者

    private PromotionPlatformType platform; // 促销(推广)的平台类型

    private PromotionChannelType channel; // 促销(发行)渠道

    private UserScopeType userScopeType; // 用户类型

    private LocalDateTime createTime; // 创建时间

    public Promotion() {}

    public Promotion(Long id, String name, String desc, Integer priority, PromotionCreatorType creator, PromotionPlatformType platform, PromotionChannelType channel, UserScopeType userScopeType, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.priority = priority;
        this.creator = creator;
        this.platform = platform;
        this.channel = channel;
        this.userScopeType = userScopeType;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PromotionCreatorType getCreator() {
        return creator;
    }

    public void setCreator(PromotionCreatorType creator) {
        this.creator = creator;
    }

    public PromotionPlatformType getPlatform() {
        return platform;
    }

    public void setPlatform(PromotionPlatformType platform) {
        this.platform = platform;
    }

    public PromotionChannelType getChannel() {
        return channel;
    }

    public void setChannel(PromotionChannelType channel) {
        this.channel = channel;
    }

    public UserScopeType getUserScopeType() {
        return userScopeType;
    }

    public void setUserScopeType(UserScopeType userScopeType) {
        this.userScopeType = userScopeType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
