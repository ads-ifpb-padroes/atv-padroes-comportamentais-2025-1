package br.edu.ifpb.ads.padores.atv2;

public interface ItemVisitor {

    void visitProdutoFisico(ProdutoFisico produto);
    void visitServico(Servico servico);

}
