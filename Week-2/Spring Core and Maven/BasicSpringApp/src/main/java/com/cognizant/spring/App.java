package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
class AppConfig {
    @Bean
    public String greeting() {
        return "Hello Spring Core!";
    }
}

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String greeting = context.getBean("greeting", String.class);
        System.out.println(greeting);
    }
}
