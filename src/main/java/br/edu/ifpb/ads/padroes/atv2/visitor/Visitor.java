package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.model.Produto;
import br.edu.ifpb.ads.padroes.atv2.model.Servico;

public interface Visitor {
        void visitarProduto(Produto produto);
        void visitarServico(Servico servico);
}
