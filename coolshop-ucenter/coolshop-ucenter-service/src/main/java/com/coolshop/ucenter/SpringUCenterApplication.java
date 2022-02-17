package com.coolshop.ucenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.coolshop.ucenter.dao")
@ComponentScan(basePackages = "com.coolshop")
public class SpringUCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringUCenterApplication.class, args);
    }
}
