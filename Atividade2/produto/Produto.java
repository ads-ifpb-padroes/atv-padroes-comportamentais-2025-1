package produto;

import VisitorsImpressao.ImprimirVisitor;
import VisitorsRelatorio.CalculoVisitor;

public interface Produto {
    public double getPreco();
    public void aceitarCalculo(CalculoVisitor calculoVisitor);
    public void aceitarImpressao(ImprimirVisitor imprimirVisitor);
}
