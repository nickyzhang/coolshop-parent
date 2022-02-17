package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class AttributeNameModel implements Serializable {

    private Long id;

    private String name;

    private int type;

    private String fieldName;

    private String fieldType;

    private int inputType;

    private boolean required;

    private String group;

    private int displayOrder;

    private int status;

    private boolean skuAttribute;

    private LocalDateTime createTime;

    private List<CategoryModel> categoryList;

    public AttributeNameModel() {
    }

    public AttributeNameModel(Long id, String name, int type, String fieldName, String fieldType, int inputType, boolean required, String group, int displayOrder, int status, boolean skuAttribute, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.inputType = inputType;
        this.required = required;
        this.group = group;
        this.displayOrder = displayOrder;
        this.status = status;
        this.skuAttribute = skuAttribute;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public int getInputType() {
        return inputType;
    }

    public void setInputType(int inputType) {
        this.inputType = inputType;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSkuAttribute() {
        return skuAttribute;
    }

    public void setSkuAttribute(boolean skuAttribute) {
        this.skuAttribute = skuAttribute;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public List<CategoryModel> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryModel> categoryList) {
        this.categoryList = categoryList;
    }
}
