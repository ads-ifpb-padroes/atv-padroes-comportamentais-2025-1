package VisitorsImpressao;

import produto.Produto;
import produto.ProdutoFisico;
import produto.Servico;

public class ImprimirConcreteVisitor implements Visitor {

    @Override
    public void visitar(ProdutoFisico produto) {
        System.out.println("Valor do produto: "+produto.getPreco()+ "\n ---------------------- " );
    }

    @Override
    public void visitar(Servico produto) {
        System.out.println("Valor do serviço: "+produto.getPreco()+ "\n ---------------------- " );
    }
}
