package br.edu.ifpb.ads.padroes.atv1.atv2;

public interface Visitor {
    void visitor (ProdutoFisico produto);
    void visitor (Servico servico);
}
