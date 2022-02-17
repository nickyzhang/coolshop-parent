package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum UserScopeType {

    ALL(1,"所有用户"), NEW_REGISTER_CUSTOMER(2,"新注册用户"), VIP(3,"VIP用户");

    private Integer code;
    private String value;

    UserScopeType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    static Map<Integer,UserScopeType> map = new HashMap<Integer, UserScopeType>();
    static{
        for(UserScopeType type : UserScopeType.values()){
            map.put(type.getCode(), type);
        }
    }


    public static UserScopeType getEnum(Integer code) {

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
