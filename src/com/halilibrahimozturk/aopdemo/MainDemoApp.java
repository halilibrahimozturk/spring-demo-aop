package com.halilibrahimozturk.aopdemo;

import com.halilibrahimozturk.aopdemo.dao.AccountDAO;
import com.halilibrahimozturk.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        //read spring config java class

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);


        //get the bean from spring container

        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);


        //get membership bean from spring container

        MembershipDAO theMembershipDAO= context.getBean("membershipDAO",MembershipDAO.class);

        //call the business method
        Account myAccount = new Account();
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();
        //call the membership business method
        theMembershipDAO.addAccount();
        theMembershipDAO.goToSleep();

        //close the spring context

        context.close();

    }
}
