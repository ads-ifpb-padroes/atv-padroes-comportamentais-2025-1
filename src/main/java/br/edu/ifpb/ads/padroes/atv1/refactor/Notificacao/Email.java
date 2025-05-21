package br.edu.ifpb.ads.padroes.atv1.refactor.Notificacao;

public class Email implements CanalNotificacao {
    @Override
    public void enviarNotificacao(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
