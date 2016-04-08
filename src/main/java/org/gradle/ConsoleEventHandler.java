package org.gradle;

public class ConsoleEventHandler implements EventLogger{

    public void logEvent(String msg) {
        System.out.println(msg);
    }

}
