package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class NotificacaoPush implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("PUSH: " + mensagem);
    }
}
