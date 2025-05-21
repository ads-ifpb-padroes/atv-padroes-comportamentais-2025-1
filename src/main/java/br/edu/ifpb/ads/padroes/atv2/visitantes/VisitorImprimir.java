package br.edu.ifpb.ads.padroes.atv2.visitantes;

import br.edu.ifpb.ads.padroes.atv2.item.Produto;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public class VisitorImprimir implements Visitor{
    @Override
    public void visitarProduto(Produto produto) {
        System.out.printf("Produto - Valor: R$ %.2f%n", produto.getValor());
    }

    @Override
    public void visitarServico(Servico servico) {
        System.out.printf("Serviço - Valor: R$ %.2f%n", servico.getValor());
    }
}
