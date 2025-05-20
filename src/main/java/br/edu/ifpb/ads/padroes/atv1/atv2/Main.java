package br.edu.ifpb.ads.padroes.atv1.atv2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de itens
        List<Item> itens = new ArrayList<>();

        // Adicionando produtos físicos e serviços
        itens.add(new ProdutoFisico("Notebook", 3500.00));
        itens.add(new ProdutoFisico("Smartphone", 2000.00));
        itens.add(new Servico("Manutenção", 500.00));
        itens.add(new Servico("Consultoria", 1200.00));

        // Criando os visitantes
        RelatorioDeImpostosVisitor relatorioVisitor = new RelatorioDeImpostosVisitor();
        ImpressaoVisitor impressaoVisitor = new ImpressaoVisitor();

        // Utilizando o visitante de relatório de impostos
        System.out.println("=== Relatório de Impostos ===");
        double totalImpostos = 0.0;

        for (Item item : itens) {
            double imposto = (double) item.accept(relatorioVisitor);
            totalImpostos += imposto;

            // Imprimindo informações do item e seu imposto
            String info = (String) item.accept(impressaoVisitor);
            System.out.println(info + " - Imposto: R$ " + String.format("%.2f", imposto));
        }

        System.out.println("Total de impostos: R$ " + String.format("%.2f", totalImpostos));

        // Utilizando apenas o visitante de impressão
        System.out.println("\n=== Lista de Itens ===");
        for (Item item : itens) {
            System.out.println(item.accept(impressaoVisitor));
        }
    }
}