package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public class Imprimir implements Visitor{
    @Override
    public void visit(ProdutoFisico item) {
        System.out.println("Valor do produto fisico: "+item.getValor());

    }

    @Override
    public void visit(Servico item) {
        System.out.println("Valor do servico: "+item.getValor());
    }
}
