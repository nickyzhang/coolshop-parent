package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum PromotionCreatorType {
    PLATFORM(1,"平台"),
    SHOP(2,"店铺");

    private Integer code;
    
    private String value;

    PromotionCreatorType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    static Map<Integer,PromotionCreatorType> map = new HashMap<Integer, PromotionCreatorType>();
    static{
        for(PromotionCreatorType type : PromotionCreatorType.values()){
            map.put(type.getCode(), type);
        }
    }

    public static PromotionCreatorType getEnum(Integer code) {

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
