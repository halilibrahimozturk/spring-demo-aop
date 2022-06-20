package com.halilibrahimozturk.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // Spring AOP Proxy Support
@ComponentScan("com.halilibrahimozturk.aopdemo") //Component scan for components and aspects
public class DemoConfig {



}
