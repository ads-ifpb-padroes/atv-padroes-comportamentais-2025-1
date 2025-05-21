package br.edu.ifpb.ads.padroes.atv1.atv2;

public class Servico implements Item{

    private double valor;

    public  Servico (double valor){ this.valor=valor;}

    public double getValor() { return valor;}

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitor(this);
    }
}
