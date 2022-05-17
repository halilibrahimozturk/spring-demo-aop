package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MartialArtsCoach implements Coach {


     private FortuneService fortuneService;



     public MartialArtsCoach(FortuneService fortuneService){

         this.fortuneService=fortuneService;
     }


     @Override
    public String getDailyWorkout() {
        return "work hard";
    }

    @Override
    public String getDailyFortune() throws IOException {
        return fortuneService.getFortune();
    }
}
