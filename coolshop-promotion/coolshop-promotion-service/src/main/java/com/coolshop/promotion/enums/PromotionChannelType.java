package com.coolshop.promotion.enums;

import java.util.HashMap;
import java.util.Map;

public enum PromotionChannelType {
    PC(1,"主站"),
    MOBILE(2,"手机"),
    EMAIL(3,"邮箱"),
    QQ(4,"QQ"),
    WECHAT(5,"微信"),
    ALIPAY(6,"支付宝");
    private Integer code;
    private String value;

    PromotionChannelType(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    static Map<Integer,PromotionChannelType> map = new HashMap<Integer, PromotionChannelType>();
    static{
        for(PromotionChannelType type : PromotionChannelType.values()){
            map.put(type.getCode(), type);
        }
    }


    public static PromotionChannelType getEnum(Integer code) {

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
