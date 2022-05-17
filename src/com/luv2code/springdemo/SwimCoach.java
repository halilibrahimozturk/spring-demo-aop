package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }



    public String getTeam() {
        return team;
    }



    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }





}
