package com.coolshop.base.tool;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;

public class JSONTools {
    public static Map<String,Object> toMap(String json) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> result = null;
        try {
            result = mapper.readValue(json, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static <T> T toValue(Object src, Class<T> dest) {
        ObjectMapper mapper = new ObjectMapper();
        if (src == null) {
            return null;
        }

        if (src instanceof String) {
            return mapper.convertValue((String)src, dest);
        }
        return null;
    }
}
