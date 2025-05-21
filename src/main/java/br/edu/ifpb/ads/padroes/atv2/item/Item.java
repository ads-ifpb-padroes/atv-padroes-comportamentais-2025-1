package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public interface Item {
    void accept(Visitor visitor);
}
