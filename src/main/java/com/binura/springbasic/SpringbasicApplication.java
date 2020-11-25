package com.binura.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbasicApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbasicApplication.class, args);
        System.out.println("Hello world");
        Alien obj = context.getBean(Alien.class);
        obj.code();
    }

}
