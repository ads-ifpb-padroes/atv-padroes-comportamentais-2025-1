package br.edu.ifpb.ads.padroes.atv1.atv1.Services;

public class ServiceSms implements ServiceNotificationStrategy {

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando SMS: " + message);
    }

    @Override
    public String getServico() {
        return "SMS";
    }

}
