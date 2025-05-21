package br.edu.ifpb.ads.padroes.atv1;

public class PushNotificacaoStrategy implements CanalNotificacaoStrategy{
    @Override
    public void enviar(String message) {
        System.out.println("Enviando PUSH NOTIFICATION: " + message);
    }
}
