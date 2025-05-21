package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitantes.Visitor;

public interface Item {
    void aceitarVisitante(Visitor visitante);
    double getValor();
}
