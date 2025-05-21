package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.items.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.items.Servico;

public class ImpressaoVisitor implements Visitor {

    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        System.out.println("Valor - Produto Físico: R$ " + String.format("%.2f", produto.getValor()));
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.println("Valor - Serviço: R$ " + String.format("%.2f", servico.getValor()));
    }
}
