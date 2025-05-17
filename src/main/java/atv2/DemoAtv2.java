package atv2;

import java.util.List;

public class DemoAtv2 {
    public static void main(String[] args) {
        List<Item> itens = List.of(
                new ProdutoFisico("Notebook", 3500.0),
                new Servico("Consultoria", 800.0)
        );

        TaxVisitor taxVisitor = new TaxVisitor();
        PrintVisitor printVisitor = new PrintVisitor();

        for (Item item : itens) {

            item.accept(printVisitor);

            double imposto = item.accept(taxVisitor);
            System.out.printf("Imposto devido: R$ %.2f%n%n", imposto);
        }
    }
}
