package br.edu.ifpb.ads.padroes.atv1.notifications;

import br.edu.ifpb.ads.padroes.atv1.notifications.CanalNotificacao;

public class EmailNotificacao implements CanalNotificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}