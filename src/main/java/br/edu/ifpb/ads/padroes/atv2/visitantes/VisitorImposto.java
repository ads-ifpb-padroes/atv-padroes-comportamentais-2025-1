package br.edu.ifpb.ads.padroes.atv2.visitantes;

import br.edu.ifpb.ads.padroes.atv2.item.Produto;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public class VisitorImposto implements Visitor{
    @Override
    public void visitarProduto(Produto produto) {
        double impostoP = produto.getValor() * 0.10;
        System.out.printf("Imposto de Produto: R$ %.2f%n ", impostoP);
    }

    @Override
    public void visitarServico(Servico servico) {
        double impostoS = servico.getValor() * 0.10;
        System.out.printf("Imposto de Produto: R$ %.2f%n ", impostoS);
    }
}
