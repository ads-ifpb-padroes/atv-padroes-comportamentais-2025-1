package br.edu.ifpb.ads.padroes.atv1;


import br.edu.ifpb.ads.padroes.atv1.notificacao.NotificacaoStrategy;

public class EmailNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}