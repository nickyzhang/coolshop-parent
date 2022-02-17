package com.coolshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringPromotionApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringPromotionApplication.class,args);
    }
}
