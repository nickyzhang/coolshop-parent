package com.coolshop.promotion.model;

import com.coolshop.promotion.enums.*;

import java.time.LocalDateTime;

public class Coupon extends Promotion {

    private CouponType type; // 优惠券类型

    private Long issueNum; // 优惠券发行量

    private Integer issueFaceValue; // 优惠券发行面值

    private Integer minSpendAmount; // 最小消费金额，即使用门槛

    private IssueMethodType issueMethod; // 发行方式

    private Boolean open; // 是否公开

    private Boolean consumed; // 已核销，已消费

    private Integer receiveNum; // 已经领券数量

    private Integer limitReceiveNum; // 限领数量

    private Integer limitReceiveNumPerDay; // 每天限领数量

    private LocalDateTime issueStartTime; // 开始发行时间

    private LocalDateTime issueEndTime; // 结束发行时间

    private LocalDateTime receiveStartTime; // 开始领券时间

    private LocalDateTime receiveEndTime; // 领券结束时间

    private LocalDateTime effectiveTime; //生效时间

    private LocalDateTime expiredTime; // 过期时间

    public Coupon() { }

    public Coupon(Long id, String name, String desc, Integer priority, PromotionCreatorType creator,
                  PromotionPlatformType platform, PromotionChannelType channel, UserScopeType userScopeType,
                  LocalDateTime createTime, CouponType type, Long issueNum, Integer issueFaceValue,
                  Integer minSpendAmount, IssueMethodType issueMethod, Boolean open, Boolean consumed,
                  Integer receiveNum, Integer limitReceiveNum, Integer limitReceiveNumPerDay,
                  LocalDateTime issueStartTime, LocalDateTime issueEndTime, LocalDateTime receiveStartTime,
                  LocalDateTime receiveEndTime, LocalDateTime effectiveTime, LocalDateTime expiredTime) {
        super(id, name, desc, priority, creator, platform, channel, userScopeType, createTime);
        this.type = type;
        this.issueNum = issueNum;
        this.issueFaceValue = issueFaceValue;
        this.minSpendAmount = minSpendAmount;
        this.issueMethod = issueMethod;
        this.open = open;
        this.consumed = consumed;
        this.receiveNum = receiveNum;
        this.limitReceiveNum = limitReceiveNum;
        this.limitReceiveNumPerDay = limitReceiveNumPerDay;
        this.issueStartTime = issueStartTime;
        this.issueEndTime = issueEndTime;
        this.receiveStartTime = receiveStartTime;
        this.receiveEndTime = receiveEndTime;
        this.effectiveTime = effectiveTime;
        this.expiredTime = expiredTime;
    }

    public CouponType getType() {
        return type;
    }

    public void setType(CouponType type) {
        this.type = type;
    }

    public Long getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(Long issueNum) {
        this.issueNum = issueNum;
    }

    public Integer getIssueFaceValue() {
        return issueFaceValue;
    }

    public void setIssueFaceValue(Integer issueFaceValue) {
        this.issueFaceValue = issueFaceValue;
    }

    public Integer getMinSpendAmount() {
        return minSpendAmount;
    }

    public void setMinSpendAmount(Integer minSpendAmount) {
        this.minSpendAmount = minSpendAmount;
    }

    public IssueMethodType getIssueMethod() {
        return issueMethod;
    }

    public void setIssueMethod(IssueMethodType issueMethod) {
        this.issueMethod = issueMethod;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public Integer getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(Integer receiveNum) {
        this.receiveNum = receiveNum;
    }

    public Integer getLimitReceiveNum() {
        return limitReceiveNum;
    }

    public void setLimitReceiveNum(Integer limitReceiveNum) {
        this.limitReceiveNum = limitReceiveNum;
    }

    public Integer getLimitReceiveNumPerDay() {
        return limitReceiveNumPerDay;
    }

    public void setLimitReceiveNumPerDay(Integer limitReceiveNumPerDay) {
        this.limitReceiveNumPerDay = limitReceiveNumPerDay;
    }

    public LocalDateTime getIssueStartTime() {
        return issueStartTime;
    }

    public void setIssueStartTime(LocalDateTime issueStartTime) {
        this.issueStartTime = issueStartTime;
    }

    public LocalDateTime getIssueEndTime() {
        return issueEndTime;
    }

    public void setIssueEndTime(LocalDateTime issueEndTime) {
        this.issueEndTime = issueEndTime;
    }

    public LocalDateTime getReceiveStartTime() {
        return receiveStartTime;
    }

    public void setReceiveStartTime(LocalDateTime receiveStartTime) {
        this.receiveStartTime = receiveStartTime;
    }

    public LocalDateTime getReceiveEndTime() {
        return receiveEndTime;
    }

    public void setReceiveEndTime(LocalDateTime receiveEndTime) {
        this.receiveEndTime = receiveEndTime;
    }

    public LocalDateTime getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(LocalDateTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public LocalDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(LocalDateTime expiredTime) {
        this.expiredTime = expiredTime;
    }
}
