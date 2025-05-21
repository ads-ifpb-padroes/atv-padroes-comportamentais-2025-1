package br.edu.ifpb.ads.padroes.atv2;

public interface Item {
    double getValor();
    void aceitar(Visitor visitor);
}