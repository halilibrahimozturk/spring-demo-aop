package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
public class NotrFortuneService implements FortuneService {
    @Override
    public String getFortune() throws IOException {
        return "Neither lucky nor bad ..";
    }
}
