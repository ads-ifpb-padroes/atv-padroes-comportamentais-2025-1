package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class NotificadorEmail implements Notificador {
    public void notificar(String mensagem) {
        System.out.println("EMAIL: " + mensagem);
    }
}
