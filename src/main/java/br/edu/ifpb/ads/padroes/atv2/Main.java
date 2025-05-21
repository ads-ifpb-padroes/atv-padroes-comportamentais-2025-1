package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.item.PhysicalProduct;
import br.edu.ifpb.ads.padroes.atv2.item.Service;
import br.edu.ifpb.ads.padroes.atv2.visitor.PrintItensVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitor.TaxReportVisitor;
import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        PhysicalProduct product1 = new PhysicalProduct("Chinelo", 50.0, "Havaianas");
        Service service1 = new Service("Manutenção PC", 200.0, "Limpeza e diagnóstico completo");

        Visitor printItensVisitor = new PrintItensVisitor();
        Visitor taxReport = new TaxReportVisitor();

        product1.accept(printItensVisitor);
        product1.accept(taxReport);

        service1.accept(printItensVisitor);
        service1.accept(taxReport);
    }
}
