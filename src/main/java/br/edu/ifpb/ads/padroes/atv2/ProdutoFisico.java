package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

public class ProdutoFisico implements Item {
    private double valor;

    public ProdutoFisico(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarProdutoFisico(this);
    }
}


