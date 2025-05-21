package br.edu.ifpb.ads.padroes.atv1.strategy;

public class PushNotificationStrategy implements NotificationStrategy {

    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando PUSH NOTIFICATION: " + message);
    }
}
