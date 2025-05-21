package VisitorsImpressao;

import produto.Produto;
import produto.ProdutoFisico;
import produto.Servico;

public class ImprimirConcreteVisitor implements ImprimirVisitor {

    @Override
    public void imprimir(ProdutoFisico produto) {
        System.out.println("Valor do produto: "+produto.getPreco());
    }

    @Override
    public void imprimir(Servico produto) {
        System.out.println("Valor do produto: "+produto.getPreco());
    }
}
