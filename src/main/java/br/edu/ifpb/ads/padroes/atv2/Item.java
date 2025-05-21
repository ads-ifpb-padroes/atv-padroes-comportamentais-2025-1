package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

public interface Item {
    double getValor();
    void aceitar(Visitor visitor);
}
