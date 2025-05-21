package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class SmsNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}