package org.gradle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private Client client;
    private ConsoleEventHandler logEvent;

    public App() {
    }

    public App(Client client, ConsoleEventHandler logEvent) {
        this.client = client;
        this.logEvent = logEvent;
    }

    private void logEvent(String msg) {
        String message = msg.replace(client.getId(), client.getFullName());
        logEvent.logEvent(message);
    }

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) context.getBean("app");

        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");
    }

}
