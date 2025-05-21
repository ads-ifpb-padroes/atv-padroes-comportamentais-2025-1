package br.edu.ifpb.ads.padroes.atv2.visitor;

import br.edu.ifpb.ads.padroes.atv2.item.PhysicalProduct;
import br.edu.ifpb.ads.padroes.atv2.item.Service;

public interface Visitor {
    void visit(PhysicalProduct product);
    void visit(Service service);
}
