package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitor.Imprimir;
import br.edu.ifpb.ads.padroes.atv2.visitor.RelatorioImposto;

public class Loader {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico(10);
        Servico servico = new Servico(10);

        RelatorioImposto relatorioImposto = new RelatorioImposto();
        Imprimir imprimir = new Imprimir();

        System.out.println("Relatorio de imposto");
        produtoFisico.accept(relatorioImposto);
        servico.accept(relatorioImposto);

        System.out.println("\nImprimir");
        produtoFisico.accept(imprimir);
        servico.accept(imprimir);
    }


}
