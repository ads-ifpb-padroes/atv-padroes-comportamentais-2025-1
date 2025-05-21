package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class NotificadorPush implements Notificador {
    public void notificar(String mensagem) {
        System.out.println("PUSH NOTIFICATION: " + mensagem);
    }
}
