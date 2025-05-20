package br.edu.ifpb.ads.padroes.atv1.strategy;

public class Push implements ServicoNotificacaoStrategy {

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando PUSH NOTIFICATION: " + message);
    }
}
