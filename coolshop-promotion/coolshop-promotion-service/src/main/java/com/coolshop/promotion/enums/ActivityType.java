package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum ActivityType {

    MONEY_OFF(1,"直减型"),CONDITIONAL_MONEY_OFF(2,"满减型"),SUIT_OFF(3,"套装型"),GIFT_OFF(4,"赠品型"),COUPON_OFF(5,"返券型");

    private Integer code;

    private String value;

    ActivityType(Integer code, String value) {
        this.code = code;
        this.value = value;
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
