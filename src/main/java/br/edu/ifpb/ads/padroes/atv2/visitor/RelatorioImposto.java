package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public class RelatorioImposto implements Visitor{
    private final double PORCETAGEM_PRODUTO = 0.1;
    private final double PORCETAGEM_SERVICO = 0.15;
    @Override
    public void visit(ProdutoFisico item) {
        double imposto = item.getValor() * PORCETAGEM_PRODUTO;
        System.out.println("Imposto do produto fisico: "+imposto);

    }

    @Override
    public void visit(Servico item) {
        double imposto = item.getValor() * PORCETAGEM_SERVICO;
        System.out.println("Imposto do servico: "+imposto);
    }
}
