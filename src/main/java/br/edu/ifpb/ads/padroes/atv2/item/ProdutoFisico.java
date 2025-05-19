package br.edu.ifpb.ads.padroes.atv2.item;

import br.edu.ifpb.ads.padroes.atv2.visitante.Visitante;

public class ProdutoFisico implements Item{
    String nome;
    double preco;

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitar(this);
    }

    public ProdutoFisico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
