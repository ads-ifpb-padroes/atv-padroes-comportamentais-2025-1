package br.edu.ifpb.ads.padroes.atv2.Item;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public interface Item {
    void aceitar(Visitor visitante);
}
