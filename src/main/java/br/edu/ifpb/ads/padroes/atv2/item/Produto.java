package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitantes.Visitor;

public class Produto implements Item{
    private double valor;
    public Produto(double valor){
        this.valor = valor;
    }
    @Override
    public void aceitarVisitante(Visitor visitante) {
        visitante.visitarProduto(this);
    }

    @Override
    public double getValor() {
        return valor;
    }
}
