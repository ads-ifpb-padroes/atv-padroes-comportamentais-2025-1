package Atv2;

import java.math.BigDecimal;

public class ProdutoFisico implements Item{
    private String nome;
    private BigDecimal valor;

    public ProdutoFisico(String nome, BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
    BigDecimal getValor() {
        return valor;
    }
}
