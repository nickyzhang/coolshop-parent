package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AttributeValueModel implements Serializable {

    private Long id;

    private String value;

    private int displayOrder;

    private LocalDateTime createTime;

    private AttributeNameModel name;

    public AttributeValueModel() {
    }

    public AttributeValueModel(Long id, String value, int displayOrder, LocalDateTime createTime, AttributeNameModel name) {
        this.id = id;
        this.value = value;
        this.displayOrder = displayOrder;
        this.createTime = createTime;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public AttributeNameModel getName() {
        return name;
    }

    public void setName(AttributeNameModel name) {
        this.name = name;
    }
}
