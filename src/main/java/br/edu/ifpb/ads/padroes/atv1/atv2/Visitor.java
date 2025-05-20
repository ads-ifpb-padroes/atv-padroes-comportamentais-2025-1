package br.edu.ifpb.ads.padroes.atv1.atv2;

public interface Visitor {
    Object visit(ProdutoFisico produto);

    Object visit(Servico servico);
}