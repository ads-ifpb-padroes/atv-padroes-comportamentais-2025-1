package br.edu.ifpb.ads.padroes.atv1.refactor.Notificacao;

public class Push implements CanalNotificacao {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando PUSH NOTIFICATION: " + message);
    }
}
