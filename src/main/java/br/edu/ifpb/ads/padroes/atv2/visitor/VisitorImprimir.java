package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.Item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Item.Servico;

public class VisitorImprimir implements Visitor {
    @Override
    public void visitar(ProdutoFisico produtoFisico) {
        System.out.println("Produto: " + produtoFisico.getNome() + " | Valor: R$ " + produtoFisico.getValor());
    }

    @Override
    public void visitar(Servico servico) {
        System.out.println("Serviço: " + servico.getNome() + " | Valor: R$ " + servico.getValor());

    }
}
