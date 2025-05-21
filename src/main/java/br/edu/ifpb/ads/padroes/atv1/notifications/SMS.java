package br.edu.ifpb.ads.padroes.atv1.notifications;

public class SMS implements CanalNotificacao {
    @Override
    public void enviar(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
