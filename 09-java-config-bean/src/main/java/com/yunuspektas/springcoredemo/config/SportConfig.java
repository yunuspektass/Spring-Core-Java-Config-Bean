package com.yunuspektas.springcoredemo.config;

import com.yunuspektas.springcoredemo.common.Coach;
import com.yunuspektas.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
@Bean("aquatic")
    public Coach swimCoach(){
    return  new SwimCoach();
}

}
