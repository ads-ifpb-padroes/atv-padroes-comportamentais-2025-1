package br.edu.ifpb.ads.padroes.atv2.items;

import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

public interface Item {
    void aceitar(Visitor visitor);
    double getValor();
}
