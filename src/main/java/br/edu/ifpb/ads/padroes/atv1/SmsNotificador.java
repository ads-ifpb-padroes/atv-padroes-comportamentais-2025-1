package br.edu.ifpb.ads.padroes.atv1;

public class SmsNotificador implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
