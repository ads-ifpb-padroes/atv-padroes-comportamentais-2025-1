package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public class ProdutoFisico implements Item{
    private double valor;

    public ProdutoFisico(double valor) {
        this.valor = valor;
    }

    @Override
    public void accept(Visitor regra) {
        regra.visit(this);
    }

    public double getValor() {
        return valor;
    }
}
