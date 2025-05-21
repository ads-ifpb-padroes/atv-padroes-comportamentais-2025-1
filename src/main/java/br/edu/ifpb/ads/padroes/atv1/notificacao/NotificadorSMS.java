package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class NotificadorSMS implements Notificador {
    public void notificar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
