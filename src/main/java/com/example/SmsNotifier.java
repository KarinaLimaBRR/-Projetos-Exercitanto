package com.example;

/**
 * Implementação concreta de Notifier para envio de SMS
 */
public class SmsNotifier implements Notifier {

    @Override
    public void send(String message, String to) {
        System.out.println("Sending SMS to " + to + " with message: " + message);

    }
}
