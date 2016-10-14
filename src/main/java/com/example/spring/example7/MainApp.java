package com.example.spring.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    //private static String CONTEXT = "example7/contextAutowireByName.xml";
    //private static String CONTEXT = "example7/contextAutowireByType.xml";
    private static String CONTEXT = "example7/contextAutowireByConstructor.xml";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT);

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}