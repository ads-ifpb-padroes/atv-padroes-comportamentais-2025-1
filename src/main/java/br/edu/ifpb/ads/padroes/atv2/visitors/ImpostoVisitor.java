package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.items.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.items.Servico;

public class ImpostoVisitor implements Visitor {

    @Override
    public void visitarProdutoFisico(ProdutoFisico produto) {
        double imposto = produto.getValor() * .10;
        System.out.println("Imposto de Produto Físico: R$ " + String.format("%.2f", imposto));
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * .15;
        System.out.println("Imposto de Serviço: R$ " + String.format("%.2f", imposto));
    }
}
