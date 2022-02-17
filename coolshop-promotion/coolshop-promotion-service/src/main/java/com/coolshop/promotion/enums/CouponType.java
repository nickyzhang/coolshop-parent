package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum CouponType {

    CASH(1,"现金券"),DISCOUNT(2,"折扣券");

    private Integer code;

    private String value;

    CouponType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    static Map<Integer,CouponType> map = new HashMap<Integer, CouponType>();
    static{
        for(CouponType type : CouponType.values()){
            map.put(type.getCode(), type);
        }
    }


    public static CouponType getEnum(Integer code) {

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
