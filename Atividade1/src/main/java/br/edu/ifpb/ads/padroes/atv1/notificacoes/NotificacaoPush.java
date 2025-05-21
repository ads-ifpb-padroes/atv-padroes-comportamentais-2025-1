package br.edu.ifpb.ads.padroes.atv1.notificacoes;

public class NotificacaoPush implements ServicoNotificacoes {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Notificacao Push: "+message);
    }
}
