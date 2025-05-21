package Atv2.Itens;

import Atv2.Visitor;

import java.math.BigDecimal;

public class Servico implements Item {
    private String nome;
    private BigDecimal valor;

    public Servico(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }
}