package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Servico;

public class ImpressaoVisitor implements Visitor {
    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        System.out.println("Produto Físico - Valor: R$ " + produto.getValor());
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.println("Serviço - Valor: R$ " + servico.getValor());
    }
}
