package produto;

import VisitorsImpressao.ImprimirVisitor;
import VisitorsRelatorio.CalculoVisitor;

public class ProdutoFisico implements Produto {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public ProdutoFisico(double preco) {
        this.preco = preco;
    }

    @Override
    public void aceitarCalculo(CalculoVisitor calculo) {
        calculo.calcular(this);
    }

    @Override
    public void aceitarImpressao(ImprimirVisitor imprimirVisitor) {
        imprimirVisitor.imprimir(this);
    }
}
