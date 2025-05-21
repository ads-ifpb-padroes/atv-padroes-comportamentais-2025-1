package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.items.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.items.Servico;

public interface Visitor {
    void visitarProdutoFisico(ProdutoFisico produto);
    void visitarServico(Servico servico);
}
