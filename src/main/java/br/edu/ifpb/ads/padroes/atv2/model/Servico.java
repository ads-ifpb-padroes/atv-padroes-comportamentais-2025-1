package br.edu.ifpb.ads.padroes.atv2.model;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public class Servico implements Item {
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarServico(this);
    }
}
