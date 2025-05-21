package produto;

import VisitorsImpressao.Visitor;

public class ProdutoFisico implements Produto {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public ProdutoFisico(double preco) {
        this.preco = preco;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
