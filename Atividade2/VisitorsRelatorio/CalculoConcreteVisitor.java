package VisitorsRelatorio;

import produto.ProdutoFisico;
import produto.Servico;

public class CalculoConcreteVisitor implements CalculoVisitor {

    @Override
    public void calcular(ProdutoFisico produto) {
        double imposto = (produto.getPreco() * 10)/100;
        double valorFinal = imposto + produto.getPreco();
        System.out.println("Relatório:\nValor do produto: "+produto.getPreco()+"\nImposto: "+imposto +"\nValor Final: "+valorFinal );
    }

    @Override
    public void calcular(Servico servico) {
        double imposto = (servico.getPreco() * 10)/100;
        double valorFinal = imposto + servico.getPreco();
        System.out.println("Relatório:\nValor do serviço: "+servico.getPreco()+"\nImposto: "+imposto +"\nValor Final: "+valorFinal );
    }
}
