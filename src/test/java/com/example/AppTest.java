package com.example;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void simpleTest() {
        Notifier notifier = new EmailNotifier();
        NotificationService service = new NotificationService(notifier);
        service.notify("Hello, World!", "Eu gosto muito de Você! =]");
        assert true; // Dummy assertion for illustration
    }
}
