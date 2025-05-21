package br.edu.ifpb.ads.padroes.atv1;


public class EmailNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}