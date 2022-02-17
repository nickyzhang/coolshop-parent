package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum IssueMethodType {

    SEND_RECIEVE(1,"可发放可领取"),ONLY_SEND(2,"仅发放"),ONLY_RECIEVE(5,"仅领取");

    private Integer code;

    private String value;

    IssueMethodType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    static Map<Integer,IssueMethodType> map = new HashMap<Integer, IssueMethodType>();
    static{
        for(IssueMethodType type : IssueMethodType.values()){
            map.put(type.getCode(), type);
        }
    }


    public static IssueMethodType getEnum(Integer code) {

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
