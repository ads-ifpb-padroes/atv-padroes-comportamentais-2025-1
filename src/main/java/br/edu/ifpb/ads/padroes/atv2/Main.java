package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.items.Item;
import br.edu.ifpb.ads.padroes.atv2.items.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.items.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitors.ImpostoVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitors.ImpressaoVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new ProdutoFisico(100.0));
        itens.add(new Servico(200.0));

        Visitor impostoVisitor = new ImpostoVisitor();
        Visitor impressaoVisitor = new ImpressaoVisitor();

        System.out.println("=== Impressão dos Itens ===");
        for (Item item : itens) {
            item.aceitar(impressaoVisitor);
        }

        System.out.println("\n=== Cálculo de Impostos ===");
        for (Item item : itens) {
            item.aceitar(impostoVisitor);
        }
    }
}
