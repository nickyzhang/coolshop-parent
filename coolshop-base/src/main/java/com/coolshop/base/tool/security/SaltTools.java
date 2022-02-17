package com.coolshop.base.tool.security;

import com.coolshop.base.UserNameTools;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.codec.Hex;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class SaltTools {

    public static String getSalt(Object... fields) {
        if (ArrayUtils.isEmpty(fields)) return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            sb.append(fields[i]);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
//        long t1 = System.currentTimeMillis();
//        SecureRandom random = new SecureRandom();
//        byte[] bytes = new byte[32];
//        random.nextBytes(bytes);
//        String salt = Base64.encodeBase64String(bytes);
//        System.out.println(salt);
//        System.out.println("耗时: "+(System.currentTimeMillis() - t1));

        long t2 = System.currentTimeMillis();
        String salt = BCrypt.gensalt();
        System.out.println(salt);
        System.out.println("耗时: "+(System.currentTimeMillis() - t2));


    }
}
