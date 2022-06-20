package com.halilibrahimozturk.aopdemo;

import com.halilibrahimozturk.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        //read spring config java class

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);


        //get the bean from spring container

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);


        //call the business method

        theAccountDAO.addAccount();

        //close the spring context

        context.close();

    }
}
