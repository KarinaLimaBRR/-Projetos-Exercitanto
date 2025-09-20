package com.example;

/*
 * Classe de serviço que usa notifier sem saber qual implemetação será usada
 * Usamos conceito de injeção de dependência
 */
public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String to, String message) {
        notifier.send(to, message);
    }

}
