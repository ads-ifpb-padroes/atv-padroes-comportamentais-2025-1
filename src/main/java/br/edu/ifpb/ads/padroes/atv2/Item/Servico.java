package br.edu.ifpb.ads.padroes.atv2.Item;

import br.edu.ifpb.ads.padroes.atv2.visitor.Visitor;

public class Servico implements  Item{

    private String nome;
    private  double valor;

    public Servico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void aceitar(Visitor visitante) {
       visitante.visitar(this);
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
