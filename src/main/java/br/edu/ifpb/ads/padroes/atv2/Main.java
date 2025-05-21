package br.edu.ifpb.ads.padroes.atv2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = List.of(
            new ProdutoFisico("Notebook", 3000.0),
            new Servico("Manutenção", 500.0),
            new ProdutoFisico("Cadeira", 400.0),
            new Servico("Consultoria", 800.0)
        );

        System.out.println("=== Impressão de Itens ===");
        ImpressaoVisitor impressora = new ImpressaoVisitor();
        for (Item item : itens) {
            item.aceitar(impressora);
        }

        System.out.println("\n=== Cálculo de Impostos ===");
        ImpostoVisitor calc  = new ImpostoVisitor();
        for (Item item : itens) {
            item.aceitar(calc);
        }

        System.out.printf("\nTotal de Impostos: R$ %.2f\n", calc.getTotalImposto());
    }
}
