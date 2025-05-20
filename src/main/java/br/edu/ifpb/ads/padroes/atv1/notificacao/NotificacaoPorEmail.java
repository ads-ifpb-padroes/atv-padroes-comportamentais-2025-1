package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class NotificacaoPorEmail implements CanalNotificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
