package com.example.springstudy.space.configuration;

import com.example.springstudy.space.Mineral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MineralConfig {

    @Bean(name = "gold")
    public Mineral gold() {
        return new Mineral(100, "gold");
    }
}
