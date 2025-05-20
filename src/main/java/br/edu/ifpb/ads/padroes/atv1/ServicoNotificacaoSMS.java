package br.edu.ifpb.ads.padroes.atv1;

public class ServicoNotificacaoSMS implements ServicoNotificacao{

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}