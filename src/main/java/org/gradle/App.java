package org.gradle;

public class App {

    private Client client;
    private ConsoleEventHandler logEvent;

    private void logEvent(String msg) {
        String message = msg.replace(client.getId(), client.getFullName());
        logEvent.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "Aureliano");
        app.logEvent = new ConsoleEventHandler();

        app.logEvent("Some event for user 1");
    }

}
