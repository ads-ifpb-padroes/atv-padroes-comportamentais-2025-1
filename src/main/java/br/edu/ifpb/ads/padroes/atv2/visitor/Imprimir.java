package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.model.Produto;
import br.edu.ifpb.ads.padroes.atv2.model.Servico;

public class Imprimir implements Visitor {
    @Override
    public void visitarProduto(Produto produto) {
        System.out.println("Valor do produto: " + produto.getValor());
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.println("Valor do serviço: " + servico.getValor());
    }
}
