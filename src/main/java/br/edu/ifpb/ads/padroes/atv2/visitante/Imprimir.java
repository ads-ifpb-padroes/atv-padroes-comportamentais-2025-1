package br.edu.ifpb.ads.padroes.atv2.visitante;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public class Imprimir implements Visitante {
    @Override
    public void visitar(ProdutoFisico item) {
        double preco = item.getPreco()*1.1;
        System.out.printf("%.2f\n", preco);
    }

    @Override
    public void visitar(Servico item) {
        double preco = item.getPreco()*1.15;
        System.out.printf("%.2f\n", preco);
    }
}
