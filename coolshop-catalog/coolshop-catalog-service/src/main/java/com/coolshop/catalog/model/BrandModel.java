package com.coolshop.catalog.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class BrandModel implements Serializable {

    private Long id;

    private String chineseName;

    private String englishName;

    private String description;

    private String logo;

    private String origin;

    private LocalDateTime createTime;

    List<String> nicknames;

    private List<CategoryModel> categoryList;

    public BrandModel() {
    }

    public BrandModel(Long id, String chineseName, String englishName, String description, String logo, String origin, LocalDateTime createTime) {
        this.id = id;
        this.chineseName = chineseName;
        this.englishName = englishName;
        this.description = description;
        this.logo = logo;
        this.origin = origin;
        this.createTime = createTime;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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
