package br.edu.ifpb.ads.padroes.atv1;

public class NotificacaoPush implements FormaNotificacao{
    @Override
    public void enviarNotificacao( String message) {
        System.out.println("Enviando PUSH NOTIFICATION: " + message);
    }
}
