package br.edu.ifpb.ads.padroes.atv1.atv2;

public class CalculaImpostoVisitor implements Visitor{

    private double valorTotalImposto=0;

    @Override
    public void visitor(ProdutoFisico produto) {
        valorTotalImposto += produto.getValor()*0.10;
    }

    @Override
    public void visitor(Servico servico) {
        valorTotalImposto+= servico.getValor()*0.15;
    }

    public double getValorTotalImposto() {
        return valorTotalImposto;
    }
}
