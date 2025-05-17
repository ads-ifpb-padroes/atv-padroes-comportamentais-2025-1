package br.edu.ifpb.ads.padroes.atv2.main;

import br.edu.ifpb.ads.padroes.atv2.model.Item;
import br.edu.ifpb.ads.padroes.atv2.model.Produto;
import br.edu.ifpb.ads.padroes.atv2.model.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitor.Imprimir;
import br.edu.ifpb.ads.padroes.atv2.visitor.RelatorioImposto;

public class Main {
    public static void main(String[] args) {
        // Itens
        Item produto = new Produto(500);
        Item servico = new Servico(1000);

        // Visitantes
        RelatorioImposto relatorio = new RelatorioImposto();
        Imprimir impressao = new Imprimir();

        // Impressão
        System.out.println("\nValores dos itens:");
        produto.aceitar(impressao);
        servico.aceitar(impressao);

        // Impostos
        System.out.println("\nValores dos impostos:");
        produto.aceitar(relatorio);
        servico.aceitar(relatorio);

        // Total impostos
        System.out.printf("\nTotal em impostos: R$ %.2f\n", relatorio.getTotalImpostos());
    }
}
