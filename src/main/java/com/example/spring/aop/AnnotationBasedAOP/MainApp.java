package com.example.spring.aop.AnnotationBasedAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Uladzislau_Shalamits on 10/17/2016.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/AnnotationBasedAOP/context.xml");

        Student student = (Student) context.getBean("student");

        student.getName();
        student.getAge();

        student.printThrowException();
    }
}