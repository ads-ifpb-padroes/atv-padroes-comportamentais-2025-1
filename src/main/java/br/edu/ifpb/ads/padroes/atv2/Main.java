package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Item.Item;
import br.edu.ifpb.ads.padroes.atv2.Item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.Item.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitor.VisitorImprimir;
import br.edu.ifpb.ads.padroes.atv2.visitor.VisitorRelatorioDeImposto;
import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(
                new ProdutoFisico("Notebook", 3000.00),
                new ProdutoFisico("Teclado", 200.00),
                new Servico("Instalação de Software", 500.00),
                new Servico("Consultoria Técnica", 1000.00)
        );
        Visitor relatorioImpostos = new VisitorRelatorioDeImposto();
        Visitor impressao = new VisitorImprimir();

        System.out.println("--- Impressão de Valores ---");
        for (Item item : itens) {
            item.aceitar(impressao);
        }

        System.out.println("\n--- Relatório de Impostos ---");
        for (Item item : itens) {
            item.aceitar(relatorioImpostos);
        }
    }
}
