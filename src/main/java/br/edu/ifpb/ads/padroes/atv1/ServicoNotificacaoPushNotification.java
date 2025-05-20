package br.edu.ifpb.ads.padroes.atv1;

public class ServicoNotificacaoPushNotification implements ServicoNotificacao{
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando Push Notification: " + message);
    }
}