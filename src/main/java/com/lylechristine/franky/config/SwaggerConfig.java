package com.lylechristine.franky.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInformation());
    }

    private ApiInfo getApiInformation(){
        return new ApiInfo("Franky -  REST API",
                "Franky is the app that's had all sorts bolted and screwed onto it for the sake of testing and " +
                        "experimentation.",
                "1.0",
                "API Terms of Service URL",
                new Contact("Lyle Christine", "https://github.com/lylio", "nope@nope.com"),
                "API License",
                "API License URL",
                Collections.emptyList()
        );
    }

}