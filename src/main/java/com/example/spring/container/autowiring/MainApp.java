package com.example.spring.container.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    //private static String CONTEXT = "container/autowiring/contextAutowireByName.xml";
    //private static String CONTEXT = "container/autowiring/contextAutowireByType.xml";
    private static String CONTEXT = "container/autowiring/contextAutowireByConstructor.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT);

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}