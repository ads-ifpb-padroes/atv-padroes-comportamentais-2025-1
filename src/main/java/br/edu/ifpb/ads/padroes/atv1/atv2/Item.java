package br.edu.ifpb.ads.padroes.atv1.atv2;

public interface Item {
    Object accept(Visitor visitor);

    double getValor();
}