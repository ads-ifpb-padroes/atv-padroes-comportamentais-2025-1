package refatoracao.atv2;

import java.util.List;

public class MainImpostos {
    public static void main(String[] args) {
        List<Item> itens = List.of(
            new ProdutoFisico("Notebook", 3000.0),
            new Servico("Consultoria", 800.0)
        );

        System.out.println(">>> Impressão dos Itens:");
        Visitor impressao = new ImpressaoVisitor();
        itens.forEach(item -> item.aceitar(impressao));

        System.out.println("\n>>> Relatório de Impostos:");
        Visitor relatorio = new RelatorioImpostoVisitor();
        itens.forEach(item -> item.aceitar(relatorio));
    }
}
