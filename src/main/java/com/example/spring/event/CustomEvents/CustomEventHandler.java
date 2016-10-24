package com.example.spring.event.CustomEvents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Uladzislau_Shalamits on 10/14/2016.
 */

public class CustomEventHandler implements ApplicationListener<ApplicationEvent> {

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
    }

}
