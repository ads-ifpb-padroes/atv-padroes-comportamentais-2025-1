package br.edu.ifpb.ads.padroes.atv1;

public class EmailNotificador implements Notificacao {

        public void enviar(String mensagem) {
            System.out.println("Enviando EMAIL: " + mensagem);
        }

}
