package br.edu.ifpb.ads.padroes.atv1.Strategy;

public class StrategyEmail implements StrategyCanal{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
