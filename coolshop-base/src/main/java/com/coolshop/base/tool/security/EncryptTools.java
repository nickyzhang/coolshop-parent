package com.coolshop.base.tool.security;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 加盐的目的：
 * Salt主要是想让彩虹表失效，它不能阻止密码被破解，但是应用了Salt后，哪怕是123456这样的简单密码，
 * 黑客也要从头跑起，从而大大增加破解难度。 所以Salt不需要安全的保存，直接写在程序里即可。
 */
public class EncryptTools {
    // 使用sha256进行第一次加密，因为md5和sha1已经不安全了
    public static String sha256Crypt(String key, Object salt) {
        ShaPasswordEncoder sha256Encoder = new ShaPasswordEncoder(256);
        String cipher = sha256Encoder.encodePassword(key, salt);
        return cipher;
    }

    // 使用Bcrypt进行第二次加密，此时Spring Security的BCryptPasswordEncoder会自动加随机盐
    public static String bcryptEncode(String key) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(key);
    }

    // Spring Security的BCryptPasswordEncoder会自动加随机盐
    public static String encrypt(String password, Object salt) {
        String cipher = sha256Crypt(password,salt);
        return bcryptEncode(cipher);
    }

    // 判断是不是匹配成功
    public static boolean match(String src, String dest) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(src,dest);
    }

    public static void main(String[] args) {
        String username = "liruotong123";
        String phone = "13211114534";
        String password = "123abcABC";
        String dest = EncryptTools.encrypt(password,SaltTools.getSalt(username,phone));
        String src = EncryptTools.sha256Crypt(password,SaltTools.getSalt(username,phone));
        System.out.println(dest);
        boolean result = EncryptTools.match(src,dest);
        System.out.println(result);

        encrypt();
    }

    public static void encrypt() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        for (int i = 0; i < 5; ++i) {
            // 每次生成的密码都不一样
            String dest = passwordEncoder.encode("123abcABC");
            System.out.println(dest);
            System.out.println(passwordEncoder.matches("123abcABC", dest)); // true
            System.out.println(passwordEncoder.matches("123abcABC", dest)); // false
        }
    }
}
