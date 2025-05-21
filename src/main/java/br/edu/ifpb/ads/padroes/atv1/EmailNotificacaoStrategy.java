package br.edu.ifpb.ads.padroes.atv1;

public class EmailNotificacaoStrategy implements CanalNotificacaoStrategy{

    @Override
    public void enviar(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
