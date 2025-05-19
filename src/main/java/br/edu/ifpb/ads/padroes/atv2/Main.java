package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;
import br.edu.ifpb.ads.padroes.atv2.visitante.Imprimir;
import br.edu.ifpb.ads.padroes.atv2.visitante.RelatorioImpostos;

public class Main {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico("Omega 3", 70.00);
        Servico servico = new Servico("Cortar Cabelo", 25.00);

        Imprimir imprimir = new Imprimir();
        System.out.println("Imprimir: ");
        imprimir.visitar(produtoFisico);
        imprimir.visitar(servico);

        System.out.println();

        RelatorioImpostos relatorioImpostos = new RelatorioImpostos();
        System.out.println("Relatorio de impostos: ");
        relatorioImpostos.visitar(produtoFisico);
        relatorioImpostos.visitar(servico);
    }
}
