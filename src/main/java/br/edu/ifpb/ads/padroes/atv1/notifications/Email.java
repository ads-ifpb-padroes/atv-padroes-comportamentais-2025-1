package br.edu.ifpb.ads.padroes.atv1.notifications;

public class Email implements CanalNotificacao {
    @Override
    public void enviar(String massage) {
        System.out.println("Enviando E-mail: " + massage);
    }
}
