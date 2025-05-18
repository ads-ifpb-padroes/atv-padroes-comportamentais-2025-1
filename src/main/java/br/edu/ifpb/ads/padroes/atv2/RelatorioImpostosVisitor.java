package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Itens.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Itens.Servico;

import java.math.BigDecimal;

public class RelatorioImpostosVisitor implements Visitor{

    @Override
    public void visitar(ProdutoFisico produto) {
        BigDecimal imposto = produto.getValor().multiply(new BigDecimal("0.10"));
        BigDecimal valorFinal = produto.getValor().add(imposto);
        System.out.println("O preço do produto com o imposto é de: R$"+valorFinal);

    }

    @Override
    public void visitar(Servico servico) {
        BigDecimal imposto = servico.getValor().multiply(new BigDecimal("0.15"));
        BigDecimal valorFinal = servico.getValor().add(imposto);
        System.out.println("O preço do serviço com o imposto é de: R$"+valorFinal);
    }
}
