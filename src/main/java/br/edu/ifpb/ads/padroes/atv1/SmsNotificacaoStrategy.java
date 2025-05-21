package br.edu.ifpb.ads.padroes.atv1;

public class SmsNotificacaoStrategy implements  CanalNotificacaoStrategy{
    @Override
    public void enviar(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
