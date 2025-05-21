package produto;

import VisitorsImpressao.ImprimirVisitor;
import VisitorsRelatorio.CalculoVisitor;

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
    public void aceitarCalculo(CalculoVisitor calculoVisitor) {
        calculoVisitor.calcular(this);
    }

    @Override
    public void aceitarImpressao(ImprimirVisitor imprimirVisitor) {
        imprimirVisitor.imprimir(this);
    }
}
