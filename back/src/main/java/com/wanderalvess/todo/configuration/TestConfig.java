package com.wanderalvess.todo.configuration;

import com.wanderalvess.todo.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Autowired
    private DBService dbService;

    @Bean
    public Boolean instantiate() {
        this.dbService.instantiateDatabase();
        return true;
    }
}
