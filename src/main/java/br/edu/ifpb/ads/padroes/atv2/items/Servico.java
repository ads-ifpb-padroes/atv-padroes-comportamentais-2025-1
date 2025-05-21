package br.edu.ifpb.ads.padroes.atv2.items;

import br.edu.ifpb.ads.padroes.atv2.visitors.Visitor;

public class Servico implements Item {
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarServico(this);
    }
}
