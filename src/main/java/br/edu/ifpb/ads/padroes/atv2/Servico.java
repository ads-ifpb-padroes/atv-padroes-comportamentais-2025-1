package br.edu.ifpb.ads.padroes.atv2;

public class Servico implements Item {
    private String nome;
    private double valor;

    public Servico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarServico(this);
    }
}
