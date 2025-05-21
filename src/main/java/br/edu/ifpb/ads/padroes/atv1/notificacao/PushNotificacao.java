package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class PushNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH NOTIFICATION: " + mensagem);
    }
}