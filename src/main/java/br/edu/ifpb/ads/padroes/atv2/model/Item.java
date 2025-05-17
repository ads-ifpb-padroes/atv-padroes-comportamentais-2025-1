package br.edu.ifpb.ads.padroes.atv2.model;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public interface Item {
    void aceitar(Visitor visitor);
}
