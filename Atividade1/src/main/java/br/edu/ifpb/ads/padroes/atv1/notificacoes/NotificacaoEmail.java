package br.edu.ifpb.ads.padroes.atv1.notificacoes;

public class NotificacaoEmail implements ServicoNotificacoes{
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Notificacao via Email: "+message);
    }
}
