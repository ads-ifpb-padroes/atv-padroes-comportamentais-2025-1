package br.edu.ifpb.ads.padroes.atv2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new ProdutoFisico("Notebook", 3000.00),
                new ProdutoFisico("Impressora", 800.00),
                new Servico("Instalação de software", 150.00),
                new Servico("Consultoria técnica", 500.00)
        );

        Visitor relatorioImposto = new RelatorioImpostoVisitor();
        Visitor impressao = new ImpressaoVisitor();

        System.out.println("### Valores dos Itens:");
        for (Item item : itens) {
            item.aceitar(impressao);
        }

        System.out.println("\n### Relatório de Impostos:");
        for (Item item : itens) {
            item.aceitar(relatorioImposto);
        }
    }
}
