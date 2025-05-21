package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.item.PhysicalProduct;
import br.edu.ifpb.ads.padroes.atv2.item.Service;

public class PrintItensVisitor implements Visitor {

    @Override
    public void visit(PhysicalProduct product) {
        System.out.printf(
                "Produto físico - Nome: %s | Valor: $%.2f | Fabricante: %s%n",
                product.getName(),
                product.getValue(),
                product.getManufacturer()
        );
    }

    @Override
    public void visit(Service service) {
        System.out.printf(
                "Serviço - Nome: %s | Valor: $%.2f | Descrição: %s%n",
                service.getName(),
                service.getValue(),
                service.getDescription()
        );
    }
}
