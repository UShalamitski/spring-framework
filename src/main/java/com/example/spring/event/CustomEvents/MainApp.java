package com.example.spring.event.CustomEvents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Uladzislau_Shalamits on 10/14/2016.
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("event/CustomEvents/context.xml");
        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();
    }
}