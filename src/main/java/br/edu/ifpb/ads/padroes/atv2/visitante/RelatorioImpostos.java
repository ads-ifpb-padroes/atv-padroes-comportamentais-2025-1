package br.edu.ifpb.ads.padroes.atv2.visitante;

import br.edu.ifpb.ads.padroes.atv2.item.ProdutoFisico;
import br.edu.ifpb.ads.padroes.atv2.item.Servico;

public class RelatorioImpostos implements Visitante{
    @Override
    public void visitar(ProdutoFisico item) {
        double preco = item.getPreco();
        double impostos = preco * 0.1;
        String nome = item.getNome();

        exibirRelatorio(nome, preco, impostos);
    }

    @Override
    public void visitar(Servico item) {
        double preco = item.getPreco();
        double impostos = preco * 0.15;
        String nome = item.getNome();

        exibirRelatorio(nome, preco, impostos);
    }

    private void exibirRelatorio(String nome, double preco, double impostos){
        String relatorio = String.join("",
                "nome: ", nome, "\n",
                "preco: ", String.format("%.2f", preco), "\n",
                "impostos: ", String.format("%.2f", impostos), "\n",
                "total: ", String.format("%.2f", impostos + preco), "\n");
        System.out.println(relatorio);
    }
}
