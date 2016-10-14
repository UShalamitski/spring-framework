package com.example.spring.example8_EventHandling;

/**
 * Created by Uladzislau_Shalamits on 10/11/2016.
 */

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}