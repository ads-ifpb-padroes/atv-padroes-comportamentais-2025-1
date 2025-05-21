package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.visitors.ImpressaoVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitors.RelatorioImpostoVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new ProdutoFisico(100.0),
                new Servico(200.0)
        );

        Visitor relatorioImposto = new RelatorioImpostoVisitor();
        Visitor impressao = new ImpressaoVisitor();

        System.out.println("Relatório de Impostos:");
        for (Item item : itens) {
            item.aceitar(relatorioImposto);
        }

        System.out.println("\nImpressão dos Itens:");
        for (Item item : itens) {
            item.aceitar(impressao);
        }

    }
}
