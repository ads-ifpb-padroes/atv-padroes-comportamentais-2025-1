package br.edu.ifpb.ads.padroes.atv1.strategy;

public class Sms implements ServicoNotificacaoStrategy {

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
