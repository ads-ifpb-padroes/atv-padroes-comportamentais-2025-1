package br.edu.ifpb.ads.padroes.atv2.Itens;
import br.edu.ifpb.ads.padroes.atv2.Visitor;

public interface Item {
    void aceitar(Visitor visitor);
}
