import VisitorsImpressao.ImprimirConcreteVisitor;
import VisitorsImpressao.CalculoConcreteVisitor;
import VisitorsImpressao.Visitor;
import produto.Produto;
import produto.ProdutoFisico;
import produto.Servico;

public class Main {
    public static void main(String[] args) {
        Produto produto = new ProdutoFisico(20);
        Produto servico = new Servico(50);

        Visitor imprimir = new ImprimirConcreteVisitor();
        Visitor calcular = new CalculoConcreteVisitor();

        produto.aceitar(imprimir);
        produto.aceitar(calcular);

        servico.aceitar(imprimir);
        servico.aceitar(calcular);
    }
}
