package br.edu.ifpb.ads.padroes.atv1;

public class PushNotificador implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH NOTIFICATION:" + mensagem);
    }
}
