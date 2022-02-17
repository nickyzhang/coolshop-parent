package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum PromotionPlatformType {
    ALL(1,"所有"),
    PC(2,"主站"),
    APP(3,"App"),
    H5_MALL(4,"H5商城");

    private Integer code;
    private String value;

    PromotionPlatformType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    static Map<Integer,PromotionPlatformType> map = new HashMap<Integer, PromotionPlatformType>();
    static{
        for(PromotionPlatformType type : PromotionPlatformType.values()){
            map.put(type.getCode(), type);
        }
    }

    public static PromotionPlatformType getEnum(Integer code) {

        return map.get(code);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
