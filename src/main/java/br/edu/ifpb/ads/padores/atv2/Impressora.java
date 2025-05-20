package br.edu.ifpb.ads.padores.atv2;

public class Impressora implements ItemVisitor {

    @Override
    public void visitProdutoFisico(ProdutoFisico produto) {
        System.out.println("Produto Físico valor: " + produto.getValor());
    }

    @Override
    public void visitServico(Servico servico) {
        System.out.println("Serviço valor: " + servico.getValor());
    }

}
