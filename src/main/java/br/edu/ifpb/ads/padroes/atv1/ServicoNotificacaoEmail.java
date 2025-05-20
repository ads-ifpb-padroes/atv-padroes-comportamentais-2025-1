package br.edu.ifpb.ads.padroes.atv1;

public class ServicoNotificacaoEmail implements ServicoNotificacao{

    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando Email: " + message);
    }
}