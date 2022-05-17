package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class PracticeActivitySevenDemoApp {

    public static void main(String[] args) throws IOException {

        // read spring config java class
       AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(NewConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("martialArtsCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());


        // close the context
        context.close();

    }

}

