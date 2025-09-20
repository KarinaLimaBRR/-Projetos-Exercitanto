package com.example;

/**
 * Interface que define o contrat para qualquer tipo de notificação
 */
public interface Notifier {
    void send(String message, String to);
}
