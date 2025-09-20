# Notifier

Projeto simples em **Java + Maven** para praticar **Orientação a Objetos**.  

## Objetivo
- Enviar notificações via diferentes estratégias:
  - **Email** (implementado com Jakarta Mail)
  - **SMS** (simulado / mock)

## Estrutura
- `Notifier.java` → interface base
- `EmailNotifier.java` → envia emails
- `SmsNotifier.java` → simula envio SMS
- `NotificationService.java` → aplica o padrão Strategy
- `App.java` → classe principal

## Como rodar
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.example.App"
