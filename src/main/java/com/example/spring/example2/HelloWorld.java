package com.example.spring.example2;

import org.apache.log4j.Logger;

public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    private void init(){
        System.out.println("Init method");
    }

    private void destroy(){
        System.out.println("Destroy method");
    }

}
