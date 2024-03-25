package com.example.demo;

import com.example.demo.proxy.MyClass1;
import com.example.demo.proxy.MyLoggingClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        MyLoggingClass myLoggingClass = new MyLoggingClass(new MyClass1());

        myLoggingClass.doSomething();


    }

}
