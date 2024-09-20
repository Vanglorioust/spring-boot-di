package com.jose.curso.springboot.di.app.springbootdi;

import com.jose.curso.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.jose.curso.springboot.di.app.springbootdi.repositories.ProductRepositoryJson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {
    @Bean
    @Primary
    public ProductRepository productRepositoryJson() {
        return new ProductRepositoryJson();
    }
}
