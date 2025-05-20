package br.edu.ifpb.ads.padroes.atv1.atv1.Services;

public class ServicePush implements ServiceNotificationStrategy {

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando PUSH NOTIFICATION: "+ message);
    }

    @Override
    public String getServico() {
        return "PUSH NOTIFICATION";
    }

}
