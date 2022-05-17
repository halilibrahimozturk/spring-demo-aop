package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {


    @Bean
    public FortuneService notrFortuneService(){

        return new NotrFortuneService();
    }

    @Bean
    public Coach martialArtsCoach(){

        return new MartialArtsCoach(notrFortuneService());
    }
}
