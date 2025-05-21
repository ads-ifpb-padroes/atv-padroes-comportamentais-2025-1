package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.item.PhysicalProduct;
import br.edu.ifpb.ads.padroes.atv2.item.Service;

public class TaxReportVisitor implements Visitor {

    @Override
    public void visit(PhysicalProduct product) {
        double tax = product.getValue() * 0.10;

        System.out.printf("Imposto sobre produto físico (R$ %.2f): R$ %.2f%n", product.getValue(), tax);
    }

    @Override
    public void visit(Service service) {
        double tax = service.getValue() * 0.15;

        System.out.printf("Imposto sobre serviço (R$ %.2f): R$ %.2f%n", service.getValue(), tax);
    }
}
