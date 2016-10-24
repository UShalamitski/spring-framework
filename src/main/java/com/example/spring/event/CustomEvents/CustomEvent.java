package com.example.spring.event.CustomEvents;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Uladzislau_Shalamits on 10/14/2016.
 */
public class CustomEvent extends ApplicationEvent{

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }
}