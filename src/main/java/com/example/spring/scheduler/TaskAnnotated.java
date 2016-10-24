package com.example.spring.scheduler;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

public class TaskAnnotated {

    @Scheduled(cron = "*/20 * * * * *")
    public void execute() {
        System.out.println("[TaskAnnotated] Current date : " + new Date());
    }
}
