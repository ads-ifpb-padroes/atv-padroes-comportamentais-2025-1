package br.edu.ifpb.ads.padroes.atv1.notification;

public class Push implements CanalNotificacao {
    @Override
    public void enviar(String message) {
        System.out.println("Enviando Push: " + message);
    }
}
