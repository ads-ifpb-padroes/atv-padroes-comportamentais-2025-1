package produto;
import VisitorsImpressao.Visitor;

public class Servico implements Produto {
    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(Visitor calculoVisitor) {
        calculoVisitor.visitar(this);
    }
}