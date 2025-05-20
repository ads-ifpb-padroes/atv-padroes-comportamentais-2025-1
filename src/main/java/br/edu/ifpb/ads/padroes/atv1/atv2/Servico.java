package br.edu.ifpb.ads.padroes.atv1.atv2;

public class Servico implements Item {
    private String nome;
    private double valor;

    public Servico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}