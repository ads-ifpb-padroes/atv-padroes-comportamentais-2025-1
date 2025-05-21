package VisitorsImpressao;

import produto.ProdutoFisico;
import produto.Servico;

public class CalculoConcreteVisitor implements Visitor {

    @Override
    public void visitar(ProdutoFisico produto) {
        double imposto = (produto.getPreco() * 10)/100;
        double valorFinal = imposto + produto.getPreco();
        System.out.println("Relatório:\nValor do produto: "+produto.getPreco()+"\nImposto: "+imposto +"\nValor Final: "+valorFinal+
        "\n ---------------------- " );
    }

    @Override
    public void visitar(Servico servico) {
        double imposto = (servico.getPreco() * 15)/100;
        double valorFinal = imposto + servico.getPreco();
        System.out.println("Relatório:\nValor do serviço: "+servico.getPreco()+"\nImposto: "+imposto +"\nValor Final: "+valorFinal+ "\n ---------------------- " );
    }
}
