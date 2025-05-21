package ativ2;

public class RegrasImprimir implements Visitante{
    @Override
    public double visitar(ProdutoFisico produto) {
        System.out.println("o valor do produto fisico: "+produto.getValor());
        return produto.getValor();
    }

    @Override
    public double visitar(Servico servico) {
        System.out.println("o valor do servico: "+servico.getValor());
        return servico.getValor();
    }
}
