package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitantes.Visitor;

public class Servico implements Item{
    private double valor;

    public Servico(double valor){
        this.valor = valor;
    }
    @Override
    public void aceitarVisitante(Visitor visitante) {
        visitante.visitarServico(this);
    }

    @Override
    public double getValor() {
        return valor;
    }
}
