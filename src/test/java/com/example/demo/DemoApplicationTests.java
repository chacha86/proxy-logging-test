package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt.AnnotationConfigApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Test
    @DisplayName("모든 빈 출력하기")
    void t1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beans = context.getBeanDefinitionNames();

        for(String beanName : beans) {
            Object bean = context.getBean(beanName);

            System.out.println("beanName = " + beanName + " / bean = " + bean);
        }
    }
    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void t2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beans = context.getBeanDefinitionNames();

        for(String beanName : beans) {
            BeanDefinition beanDefinition = context.getBeanDefinition(beanName);
            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                Object bean = context.getBean(beanName);
                System.out.println("beanName = " + beanName + " / bean = " + bean);
            }
        }
    }

}
