package br.edu.ifpb.ads.padroes.atv1.strategy;

public class SmsNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
