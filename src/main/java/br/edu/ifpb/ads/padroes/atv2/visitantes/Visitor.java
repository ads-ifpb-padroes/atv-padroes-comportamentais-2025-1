package br.edu.ifpb.ads.padroes.atv2.visitantes;

import br.edu.ifpb.ads.padroes.atv2.item.Produto;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public interface Visitor {
    void visitarProduto(Produto produto);
    void visitarServico(Servico servico);
}
