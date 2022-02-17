package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class SkuModel implements Serializable  {

    private Long id;

    private String name;

    private String description;

    private Long costPrice;

    private Long listPrice;

    private Long salePrice;

    private String code;

    private String barCode;

    private boolean status;

    private int displayOrder;

    private LocalDateTime createTime;

    private ProductModel product;

    private List<BundleModel> bundleList;

    private List<AttributeValueModel> properties;

    public SkuModel() {
    }

    public SkuModel(Long id, String name, String description, Long costPrice, Long listPrice, Long salePrice, String code, String barCode, boolean status, int displayOrder, LocalDateTime createTime, ProductModel product) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.costPrice = costPrice;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
        this.code = code;
        this.barCode = barCode;
        this.status = status;
        this.displayOrder = displayOrder;
        this.createTime = createTime;
        this.product = product;
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

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getListPrice() {
        return listPrice;
    }

    public void setListPrice(Long listPrice) {
        this.listPrice = listPrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public List<BundleModel> getBundleList() {
        return bundleList;
    }

    public void setBundleList(List<BundleModel> bundleList) {
        this.bundleList = bundleList;
    }

    public List<AttributeValueModel> getProperties() {
        return properties;
    }

    public void setProperties(List<AttributeValueModel> properties) {
        this.properties = properties;
    }
}
