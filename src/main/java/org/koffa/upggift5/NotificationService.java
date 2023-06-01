package org.koffa.upggift5;

public class NotificationService {
    private MessageSender messageSender;
    public NotificationService(MessageSender messageSender) {

    }
    private void sendMessage(String message, String recipient) {
        messageSender.send(message, recipient);
    }
}
