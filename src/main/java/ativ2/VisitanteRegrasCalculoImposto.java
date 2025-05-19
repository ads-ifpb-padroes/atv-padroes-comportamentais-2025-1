package ativ2;

public class VisitanteRegrasCalculoImposto implements Visitante{
    @Override
    public double visitar(ProdutoFisico produto) {
        System.out.println("o imposto para produtos fisicos sera de: "+produto.getValor() * 0.1);
        return produto.getValor() * 0.1;
    }


    @Override
    public double visitar(Servico servico) {
        System.out.println("o imposto para produtos sera de: "+servico.getValor() * 0.15);
        return servico.getValor() * 0.15;
    }
}
