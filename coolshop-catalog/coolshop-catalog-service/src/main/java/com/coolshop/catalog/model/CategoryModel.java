package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class CategoryModel implements Serializable{

    private Long id;

    private String name;

    private String description;

    private String imagePath;

    private int displayOrder;

    private LocalDateTime createTime;

    private CategoryModel parent;

    private List<BrandModel> brandList;

    private List<ProductModel> productList;

    private List<AttributeNameModel> attributeNameList;

    public CategoryModel() {

    }

    public CategoryModel(Long id, String name, String description, String imagePath, int displayOrder, LocalDateTime createTime, CategoryModel parent) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.displayOrder = displayOrder;
        this.createTime = createTime;
        this.parent = parent;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    public CategoryModel getParent() {
        return parent;
    }

    public void setParent(CategoryModel parent) {
        this.parent = parent;
    }

    public List<BrandModel> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<BrandModel> brandList) {
        this.brandList = brandList;
    }

    public List<ProductModel> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductModel> productList) {
        this.productList = productList;
    }

    public List<AttributeNameModel> getAttributeNameList() {
        return attributeNameList;
    }

    public void setAttributeNameList(List<AttributeNameModel> attributeNameList) {
        this.attributeNameList = attributeNameList;
    }
}
