package com.cyt.cunyuetang.api.common.config;


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

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // api接口包扫描路径
                .apis(RequestHandlerSelectors.basePackage("com.janis.controller"))
                //可以根据url路径设置哪些请求加入文档，忽略哪些请求
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档的标题
                .title("第一个框架")
                //设置文档的描述
                .description("第一个框架 API 文档")
                //设置文档的License信息
                .termsOfServiceUrl("http://swagger.io/")
                //设置文档的联系方式 Contact 是 通讯录
                .contact(new Contact("song", "127.0.0.1", ""))
                //设置文档的版本信息
                .version("1.0")
                .build();
    }

}
