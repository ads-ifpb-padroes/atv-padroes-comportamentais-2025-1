package br.edu.ifpb.ads.padroes.atv1.canal;

public class EmailCanal implements Canal{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
