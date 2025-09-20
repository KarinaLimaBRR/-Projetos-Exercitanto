package com.example;

/*
 * Classe principal da aplicação
 * Aqui escolhemos qual "estratégia" de notificação usar
 */
public class App {
    public static void main(String[] args) {

        // Estratégia 1: envio por Email
        Notifier emailNotifier = new EmailNotifier();
        NotificationService serviceEmail = new NotificationService(emailNotifier);
        serviceEmail.notify("karinasoareslima2@gmail.com", "Olá, esta é uma notificação por EMAIL!");
 
        // Estratégia 2: envio por SMS
        
        Notifier smsNotifier = new SmsNotifier();
        NotificationService serviceSMS = new NotificationService(smsNotifier);
    serviceSMS.notify("+5511999999999", "Olá, esta é uma notificação por SMS!");
 }
}
