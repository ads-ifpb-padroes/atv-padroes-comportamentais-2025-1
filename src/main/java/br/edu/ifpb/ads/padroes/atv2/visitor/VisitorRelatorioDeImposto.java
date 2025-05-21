package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.Item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Item.Servico;

public class VisitorRelatorioDeImposto implements Visitor {
    @Override
    public void visitar(ProdutoFisico produtoFisico) {
        double imposto = produtoFisico.getValor() * 0.10;
        System.out.println("Produto: " + produtoFisico.getNome() + " | Valor do imposto é: R$ " + imposto);
    }

    @Override
    public void visitar(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        System.out.println("Serviço: " + servico.getNome() + " | Valor do imposto é: R$ " + imposto);

    }
}
