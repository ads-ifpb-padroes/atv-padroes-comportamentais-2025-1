package br.edu.ifpb.ads.padroes.atv1.canaisNotificacao;

import br.edu.ifpb.ads.padroes.atv1.interfaces.CanalNotificacao;

public class SMSNotificacao implements CanalNotificacao {
    public void enviar(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
