package com.example.demo;


import org.springframework.context.annotation.Bean;

public class MyConfig {
    @Bean
    public ByeWorld byeWorld() {
        return new ByeWorld();
    }

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public Test test() {
        return new Test();
    }
}
