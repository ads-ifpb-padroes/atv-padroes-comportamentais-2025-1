package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public interface Visitor {
    void visit(ProdutoFisico item);
    void visit(Servico item);
}
