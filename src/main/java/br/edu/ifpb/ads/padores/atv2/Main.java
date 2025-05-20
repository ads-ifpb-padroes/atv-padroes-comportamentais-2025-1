package br.edu.ifpb.ads.padores.atv2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(
                new ProdutoFisico(100),
                new Servico(200),
                new ProdutoFisico(50)
        );

        CalculadoraImposto calcImposto = new CalculadoraImposto();
        Impressora impressora = new Impressora();

        for (Item item : itens) {
            item.aceitar(impressora);
        }

        System.out.println("---");

        for (Item item : itens) {
            item.aceitar(calcImposto);
        }

        System.out.println("Total de imposto: " + calcImposto.getTotalImposto());
    }
}
