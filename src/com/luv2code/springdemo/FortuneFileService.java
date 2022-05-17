package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class FortuneFileService implements FortuneService{
    @Override
    public String getFortune() throws IOException {


        // File path is passed as parameter
        File file = new File(
                "/home/veli/Masaüstü/Fortunes.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string

        List<String> fortunes=new ArrayList<String>();

        while ((st = br.readLine()) != null){

            // Print the string
            fortunes.add(st);
        }



        return fortunes.get((int) ((Math.random() * (fortunes.size() - 0)) + 0));
    }
}
