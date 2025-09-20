package com.example;

/**
 * Implementação concreta de Notifier que envia notificações por email.
 */

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message, String to) {
        System.out.println("Sending email to " + to + " with message: " + message);
    }
}
