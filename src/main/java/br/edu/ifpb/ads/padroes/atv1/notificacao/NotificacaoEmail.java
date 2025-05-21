package br.edu.ifpb.ads.padroes.atv1.notificacao;

public class NotificacaoEmail implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("EMAIL: " + mensagem);
    }
}
