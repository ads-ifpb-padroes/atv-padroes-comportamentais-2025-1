package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.item.Item;
import br.edu.ifpb.ads.padroes.atv2.item.Produto;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitantes.Visitor;
import br.edu.ifpb.ads.padroes.atv2.visitantes.VisitorImposto;
import br.edu.ifpb.ads.padroes.atv2.visitantes.VisitorImprimir;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new Produto(100.0));
        itens.add(new Servico(200.0));
        itens.add(new Produto(150.0));
        Visitor visitorImposto = new VisitorImposto();
        Visitor visitorImpressao = new VisitorImprimir();

        System.out.println("---- Impressão dos Valores ----");
        for(Item item : itens){
            item.aceitarVisitante(visitorImpressao);
        }

        System.out.println("\n ---- Cálculo de Impostos ----");
        for(Item item : itens){
            item.aceitarVisitante(visitorImposto);
        }
    }
}
