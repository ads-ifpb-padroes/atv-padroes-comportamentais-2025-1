package br.edu.ifpb.ads.padroes.atv1.notifications;

import br.edu.ifpb.ads.padroes.atv1.notifications.CanalNotificacao;

public class PushNotificacao implements CanalNotificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH NOTIFICATION: " + mensagem);
    }
}