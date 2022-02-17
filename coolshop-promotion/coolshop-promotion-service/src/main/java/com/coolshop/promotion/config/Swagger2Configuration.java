package com.coolshop.promotion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class Swagger2Configuration {

//    @Bean
    public Docket buildRestAPI() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
            .apiInfo(buildApiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.coolshop.controller"))
            .paths(PathSelectors.any()).build();
        return docket;
    }

    private ApiInfo buildApiInfo() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder
            .title("促销中心")
            .description("促销中心")
            .contact(new Contact("nicky","","zhang.lehui@foxmail.com"))
            .termsOfServiceUrl("http://local.coolshop.com/")
            .version("1.0");
        return apiInfoBuilder.build();
    }
}
