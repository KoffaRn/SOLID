package org.koffa.upggift5;

public class EmailSender implements MessageSender {

    @Override
    public void send(String message, String email) {
        System.out.println(message + " sent to " + email + "!");
    }
}
