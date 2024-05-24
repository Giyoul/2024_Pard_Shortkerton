package com.example.giyoungpyoryugi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("기영이의 Pyo류기 숏커톤 조")
                        .description("나의 청춘이 우리 가족의 청춘이 될 수 있도록, 틈틈히 서로의 진심을 모아 전할 수 있도록 도와주는 서비스")
                        .version("1.0.0"));
    }
}
