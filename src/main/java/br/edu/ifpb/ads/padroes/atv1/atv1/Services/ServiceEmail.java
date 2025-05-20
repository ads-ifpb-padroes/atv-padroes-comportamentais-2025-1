package br.edu.ifpb.ads.padroes.atv1.atv1.Services;

public class ServiceEmail implements ServiceNotificationStrategy {

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando email: "+ message);
    }

    @Override
    public String getServico() {
        return "Email";
    }

}
