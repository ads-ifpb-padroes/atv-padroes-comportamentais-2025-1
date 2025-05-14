package br.edu.ifpb.ads.padroes.atv2.visitors;

import br.edu.ifpb.ads.padroes.atv2.models.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.models.ProdutoServico;

public class XmlLog implements ProdutoVisitor {

    @Override
    public void visit(ProdutoFisico produto) {
        System.out.print("""
            <ProdutoFisico>
                <name>%s</name>
                <basePrice>%.2f</basePrice>
                <weight>%.2f</weight>
            </ProdutoFisico>
            """.formatted(produto.getName(), produto.getBasePrice(), produto.getWeight()));
    }

    @Override
    public void visit(ProdutoServico servico) {
        System.out.print("""
            <ProdutoServico>
                <name>%s</name>
                <basePrice>%.2f</basePrice>
                <durationInDays>%d</durationInDays>
                <providerName>%s</providerName>
            </ProdutoServico>
            """.formatted(servico.getName(), servico.getBasePrice(), servico.getDurationInDays(),
            servico.getProviderName()));
    }
}
