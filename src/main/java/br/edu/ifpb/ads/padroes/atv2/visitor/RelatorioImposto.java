package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.model.Produto;
import br.edu.ifpb.ads.padroes.atv2.model.Servico;

public class RelatorioImposto implements Visitor {
    private double totalImpostos = 0;

    @Override
    public void visitarProduto(Produto produto) {
        double imposto = produto.getValor() * 0.10;
        totalImpostos += imposto;
        System.out.println("Imposto do produto: " + imposto);
    }

    @Override
    public void visitarServico(Servico servico) {
        double imposto = servico.getValor() * 0.15;
        totalImpostos += imposto;
        System.out.println("Imposto do serviço: " + imposto);
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}
