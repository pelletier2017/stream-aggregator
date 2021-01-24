package com.pell.streamaggregator.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Value("${application.title}")
    private String applicationTitle;

    @Value("${application.version}")
    private String applicationVersion;

    @Value("${application.description}")
    private String applicationDescription;

    @Value("${application.license}")
    private String license;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(applicationTitle)
                        .version(applicationVersion)
                        .description(applicationDescription)
                        .license(new License().name(license)));
    }
}
