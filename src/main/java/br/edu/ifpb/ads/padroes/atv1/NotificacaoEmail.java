package br.edu.ifpb.ads.padroes.atv1;

public class NotificacaoEmail implements FormaNotificacao{
    @Override
    public void enviarNotificacao( String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
