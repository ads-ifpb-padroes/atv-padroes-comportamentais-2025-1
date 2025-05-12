package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitante.Visitante;

public class Servico implements Item{
    String nome;
    double preco;

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitar(this);
    }

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
