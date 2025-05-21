package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.Item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Item.Servico;

public interface Visitor {
    void visitar(ProdutoFisico produtoFisico);
    void visitar(Servico servico);
}
