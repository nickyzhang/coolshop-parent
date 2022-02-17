package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class BundleModel implements Serializable {

    private Long id;

    private String name;

    private String description;

    private Integer quantity;

    private LocalDateTime createTime;

    private List<SkuModel> skuList;

    public BundleModel() {
    }

    public BundleModel(Long id, String name, String description, Integer quantity, LocalDateTime createTime, List<SkuModel> skuList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.createTime = createTime;
        this.skuList = skuList;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public List<SkuModel> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<SkuModel> skuList) {
        this.skuList = skuList;
    }
}
