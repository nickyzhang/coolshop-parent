package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ProductModel implements Serializable {

    private Long id;

    private String name;

    private String description;

    private float rating;

    private int review;

    private LocalDateTime createTime;

    private int displayOrder;

    private LocalDate launchDate;

    private BrandModel brand;

    private CategoryModel category;

    private List<SkuModel> skuList;

    private List<AttributeValueModel> properties;

    public ProductModel() {
    }

    public ProductModel(Long id, String name, String description, float rating, int review, LocalDateTime createTime, LocalDate launchDate, int displayOrder, BrandModel brand, CategoryModel category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.review = review;
        this.createTime = createTime;
        this.launchDate = launchDate;
        this.displayOrder = displayOrder;
        this.brand = brand;
        this.category = category;
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public BrandModel getBrand() {
        return brand;
    }

    public void setBrand(BrandModel brand) {
        this.brand = brand;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public List<SkuModel> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<SkuModel> skuList) {
        this.skuList = skuList;
    }

    public List<AttributeValueModel> getProperties() {
        return properties;
    }

    public void setProperties(List<AttributeValueModel> properties) {
        this.properties = properties;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }
}
