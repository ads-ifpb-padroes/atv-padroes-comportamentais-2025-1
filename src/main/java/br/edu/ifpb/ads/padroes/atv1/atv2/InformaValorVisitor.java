package br.edu.ifpb.ads.padroes.atv1.atv2;

public class InformaValorVisitor implements  Visitor{

    @Override
    public void visitor(Servico servico) {
        System.out.println("O valor do servico é - R$: " + servico.getValor());
    }

    @Override
    public void visitor(ProdutoFisico produto) {
        System.out.println("O valor do produto fiisico é - R$: " +produto.getValor());
    }
}
