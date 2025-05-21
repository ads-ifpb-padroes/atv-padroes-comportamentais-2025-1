import VisitorsImpressao.ImprimirConcreteVisitor;
import VisitorsImpressao.ImprimirVisitor;
import VisitorsRelatorio.CalculoConcreteVisitor;
import VisitorsRelatorio.CalculoVisitor;
import produto.Produto;
import produto.ProdutoFisico;
import produto.Servico;

public class Main {
    public static void main(String[] args) {
        Produto produto = new ProdutoFisico(20);
        Produto servico = new Servico(50);

        CalculoVisitor calculadora = new CalculoConcreteVisitor();
        ImprimirVisitor imprimir = new ImprimirConcreteVisitor();

        produto.aceitarCalculo(calculadora);
        produto.aceitarImpressao(imprimir);
    }
}
