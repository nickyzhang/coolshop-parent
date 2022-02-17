package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum ActivityStatusType {

    NO_START(1,"未开始"),IN_PROGRSS(2,"进行中"),End(3,"已结束");

    private Integer code;

    private String value;

    ActivityStatusType(Integer code, String value) {
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

